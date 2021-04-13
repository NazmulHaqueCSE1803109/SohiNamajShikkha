package com.example.salat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Hadis extends AppCompatActivity {
private Button hadis,islam,bela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis);


        hadis=(Button)findViewById(R.id.hadissomuhoid);
        hadis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hadithbd.com/"));
                startActivity(browserIntent);
            }
        });

        islam=(Button)findViewById(R.id.islamicbookid);
        islam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/folderview?id=1deQODtGoz8dE4_m5CKHlTEhXAkFCQFDy"));
                startActivity(browserIntent);
            }
        });

        bela=(Button)findViewById(R.id.belafurabarageid);
        bela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1VnFJFNDaCFK0CJt_HoEvbffKYmdTD9Gz/view"));
                startActivity(browserIntent);
            }
        });


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
            String body="এটা একটা ইসলামিক অ্যাপ। যার মধ্যে ইসলামের মূল ভিত্তিগুলো সম্পর্কে মৌলিক ধারনা দেওয়া হইছে। এর মধ্যে গুরুত্বপূর্ণ বিষয় হলঃ নামাজের সময় হিসাব করা,যাকাত হিসাব করা, তাসবীহ হিসাব করা সহ আরও অনেক কিছু।";

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