package com.example.salat;

import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class RojarBiboron extends AppCompatActivity implements View.OnClickListener {
private Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rojar_biboron);

        b1=(Button)findViewById(R.id.rojaid);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.rojaritihasid);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.rojaruddeshshoid);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.rojarshortoid);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.rojavongoid);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.kajarojaid);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.rojarfojilotid);
        b7.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.rojaid)
        {
            Intent intent=new Intent(RojarBiboron.this,Roja.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.rojaritihasid)
        {
            Intent intent=new Intent(RojarBiboron.this,RojarItihas.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.rojaruddeshshoid)
        {
            Intent intent=new Intent(RojarBiboron.this,RojarUddeshsho.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.rojarshortoid)
        {
            Intent intent=new Intent(RojarBiboron.this,RojarShorto.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.rojavongoid)
        {
            Intent intent=new Intent(RojarBiboron.this,RojaVongo.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.kajarojaid)
        {
            Intent intent=new Intent(RojarBiboron.this,KajaRoja.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.rojarfojilotid)
        {
            Intent intent=new Intent(RojarBiboron.this,RojarFojilot.class);
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
