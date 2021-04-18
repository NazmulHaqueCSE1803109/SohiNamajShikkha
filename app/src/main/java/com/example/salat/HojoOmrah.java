package com.example.salat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HojoOmrah extends AppCompatActivity implements View.OnClickListener{

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hojo_omrah);

        b1=(Button)findViewById(R.id.hojerbornonaid);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.hojoomrahorniotid);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.taoafosairid);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.ihramobsthainishiddokajid);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.hojerforojsunnatoajibid);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.bivinnoprokarerhojid);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.hojerdingulatekoroniosomuhoid);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.bodlihojokichukotha);
        b8.setOnClickListener(this);
        b9=(Button)findViewById(R.id.hojerguruttoofojilotid);
        b9.setOnClickListener(this);
        b10=(Button)findViewById(R.id.forojhojpalonnakorarshastiid);
        b10.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       if(view.getId()==R.id.hojerbornonaid)
       {
           Intent intent=new Intent(HojoOmrah.this,HojerBornonaOItihas.class);
           startActivity(intent);
       }
       else if(view.getId()==R.id.hojoomrahorniotid)
       {
           Intent intent=new Intent(HojoOmrah.this,HajOomrahorNiot.class);
           startActivity(intent);
       }
       else if(view.getId()==R.id.taoafosairid)
       {
           Intent intent=new Intent(HojoOmrah.this,TaoafOSair.class);
           startActivity(intent);
       }
       else if(view.getId()==R.id.ihramobsthainishiddokajid)
       {
           Intent intent=new Intent(HojoOmrah.this,IhramerNishiddhoKaj.class);
           startActivity(intent);
       }
       else if(view.getId()==R.id.hojerforojsunnatoajibid)
       {
           Intent intent=new Intent(HojoOmrah.this,HojerForojSunnatOwajib.class);
           startActivity(intent);
       }
       else if(view.getId()==R.id.bivinnoprokarerhojid)
       {
           Intent intent=new Intent(HojoOmrah.this,BivinnoProkarerHojj.class);
           startActivity(intent);
       }
       else if(view.getId()==R.id.hojerdingulatekoroniosomuhoid)
       {
           Intent intent=new Intent(HojoOmrah.this,HojjerDingulateKoroniosomuho.class);
           startActivity(intent);
       }
       else if(view.getId()==R.id.bodlihojokichukotha)
       {
           Intent intent=new Intent(HojoOmrah.this,BodliHojjoKichuKotha.class);
           startActivity(intent);
       }
       else if(view.getId()==R.id.bodlihojokichukotha)
       {
           Intent intent=new Intent(HojoOmrah.this,BodliHojjoKichuKotha.class);
           startActivity(intent);
       }
       else if(view.getId()==R.id.hojerguruttoofojilotid)
       {
           Intent intent=new Intent(HojoOmrah.this,HojjerGuruttoOFojilot.class);
           startActivity(intent);
       }
       else
       {
           Intent intent=new Intent(HojoOmrah.this,ForojHojjNamanrShasti.class);
           startActivity(intent);
       }
    }



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
            String body="এটা একটা ইসলামিক অ্যাপ। অ্যাপটিতে ইসলামের মূল ভিত্তিগুলো সম্পর্কে মৌলিক ধারনা দেওয়া হইছে। এর মধ্যে গুরুত্বপূর্ণ বিষয় হলঃ কালেমা, নামাজ, রোজা, হজ্জ, জাকাত, কোরআন ও হাদিস শিক্ষা, নামাজের সময় হিসাব করা,যাকাত হিসাব করা, তাসবীহ হিসাব করা সহ আরও অনেক কিছু। More info: https://github.com/NazmulHaqueCSE1803109/SohiNamajShikkha";

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

            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/NazmulHaqueCSE1803109/SohiNamajShikkha/raw/main/app-release.apk"));
            startActivity(browserIntent);
        }
        else if(item.getItemId()==R.id.rateid)
        {
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/NazmulHaqueCSE1803109/SohiNamajShikkha/raw/main/app-release.apk"));
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
