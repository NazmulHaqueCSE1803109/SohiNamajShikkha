package com.example.salat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class SalatTime extends AppCompatActivity {
//    HashMap<String, HashMap<String, String>> allTimes;
    private RequestQueue mQueue;
    private TextView fajr,sunrise,dhuhr,asr,sunset,maghrib,isha,midnight,imsak;
    private Button searchbt;
    private EditText searchlocation;
    private TextView location;
    private TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        mQueue = Volley.newRequestQueue(this); // for json parsing

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salat_time);

        fajr=(TextView)findViewById(R.id.fajrtv);
        sunrise=(TextView)findViewById(R.id.sunrisetv);
        dhuhr=(TextView)findViewById(R.id.dhuhrtv);
        asr=(TextView)findViewById(R.id.asrtv);
        sunset=(TextView)findViewById(R.id.sunsettv);
        maghrib=(TextView)findViewById(R.id.magribtv);
        isha=(TextView)findViewById(R.id.ishatv);
        midnight=(TextView)findViewById(R.id.midnighttv);
        imsak=(TextView)findViewById(R.id.imsaktv);

        searchlocation=(EditText)findViewById(R.id.edittexttv);
        searchbt=(Button)findViewById(R.id.searchtv);
        location=(TextView)findViewById(R.id.locationtv);
        date=(TextView)findViewById(R.id.datetv);


        searchbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mlocation=searchlocation.getText().toString().trim();
//                Log.e("District: ", mlocation);
                if(mlocation.isEmpty())
                {
                        Toast.makeText(SalatTime.this,"please enter location",Toast.LENGTH_SHORT).show();
                }
                else
                {
//                    System.out.println("Calling jsonParse()");
                    jsonParse(mlocation);
//                    System.out.println();
//                    fajr.setText("Test time");
                }
            }
        });

    }
    private void jsonParse(String dis)
    {
        location.setText(dis);
//        System.out.println("Fethcing for "+dis);
        String url = "https://aladhan.p.rapidapi.com/timingsByCity?city="+dis+"&country=Bangladesh"; //endpoint
        // https://rapidapi.com/meezaan/api/prayer-times     <---- for more info
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONObject obj = response.getJSONObject("data");
                            JSONObject timings = obj.getJSONObject("timings");
                            fajr.setText(timings.getString("Fajr"));
                            sunrise.setText(timings.getString("Sunrise"));
                            dhuhr.setText(timings.getString("Dhuhr"));
                            asr.setText(timings.getString("Asr"));
                            sunset.setText(timings.getString("Sunset"));
                            maghrib.setText(timings.getString("Maghrib"));
                            isha.setText(timings.getString("Isha"));
                            imsak.setText(timings.getString("Imsak"));
                            midnight.setText(timings.getString("Midnight"));
                            date.setText(obj.getJSONObject("date").getString("readable"));

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                final Map<String, String> headers = new HashMap<>();
                headers.put("x-rapidapi-key", "61634d0e02msh8bfd3a9c36d8ee6p1c08aejsn2c9681b1aef6");//put your token here
                headers.put("x-rapidapi-host", "aladhan.p.rapidapi.com");
                return headers;
            }
        };
        mQueue.add(request);
    }
//    private void showPage() throws IOException {
//        Time obj = new Time();
//        obj.fetchForAllDistricts();
//        HashMap<String, HashMap<String, String>> allTimes = obj.getTimings();
//        ArrayList<String> allDistricts = new ArrayList<>();
//        allDistricts.add("Dhaka");
//        allDistricts.add("Rajshahi");
//        allDistricts.add("Pabna");
//        allDistricts.add("Khulna");
//        allDistricts.add("Barishal");
//        allDistricts.add("Chittagong");
//        allDistricts.add("Bogura");
//        allDistricts.add("Jashore");
//
//        // add more ....
//
//        for(String dis: allDistricts)
//        {
//            allTimes.get(dis).get("Fajr");
//            allTimes.get(dis).get("Sunrise");
//            allTimes.get(dis).get("Dhuhr");
//            allTimes.get(dis).get("Asr");
//            allTimes.get(dis).get("Sunset");
//            allTimes.get(dis).get("Magrib");
//            allTimes.get(dis).get("Isha");
//            allTimes.get(dis).get("Midnight");
//        }
//    }




    //menu items...
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.shareid)
        {
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject="সহীহ নামাজ শিক্ষা";
            String body="এটা একটা ইসলামিক অ্যাপ। অ্যাপটিতে ইসলামের মূল ভিত্তিগুলো সম্পর্কে মৌলিক ধারনা দেওয়া হয়েছে । এর মধ্যে গুরুত্বপূর্ণ বিষয় হলঃ কালেমা, নামাজ, রোজা, হজ্জ, জাকাত, কোরআন, হাদিস, নামাজের সময় হিসাব করা,যাকাত হিসাব করা, তাসবীহ হিসাব করা সহ আরও অনেক কিছু।";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"share with"));
        }
        else if(item.getItemId()==R.id.feedbackid)
        {
            Intent intent=new Intent(this,Feedback.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.moreid)
        {

            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.jituhasan.namaz_shikkha"));
            startActivity(browserIntent);
        }
        else if(item.getItemId()==R.id.rateid)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.sevenonelab.bangla_namaz_shikkha"));
            startActivity(browserIntent);
        }
        else if(item.getItemId()==R.id.appid)
        {
            Intent intent=new Intent(this,AboutApp.class);
            startActivity(intent);
        }
        else if(item.getItemId()==R.id.inventorid)
        {
            Intent intent=new Intent(this,AboutInventor.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}

