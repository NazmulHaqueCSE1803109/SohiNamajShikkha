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
import android.widget.Toolbar;

public class SuraSomuho extends AppCompatActivity implements View.OnClickListener {
private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura_somuho);
        b1=(Button)findViewById(R.id.suraalfatihaid);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.suraalmaunid);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.suraannasorid);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.suraallahabid);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.suraalikhlasid);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.suraalfalakid);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.suraannasid);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.suraiasinid);
        b8.setOnClickListener(this);
        b9=(Button)findViewById(R.id.suraarrahmanid);
        b9.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.suraalfatihaid)
        {
            Intent intent=new Intent(SuraSomuho.this,SuraAlFatiha.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.suraalmaunid)
        {
            Intent intent=new Intent(SuraSomuho.this,SuraAlMaun.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.suraannasorid)
        {
            Intent intent=new Intent(SuraSomuho.this,SuraAnNasor.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.suraallahabid)
        {
            Intent intent=new Intent(SuraSomuho.this,SuraAlLahab.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.suraalikhlasid)
        {
            Intent intent=new Intent(SuraSomuho.this,SuraAlIkhlas.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.suraalfalakid)
        {
            Intent intent=new Intent(SuraSomuho.this,SuraAlFalak.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.suraannasid)
        {
            Intent intent=new Intent(SuraSomuho.this,SuraAnNas.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.suraiasinid)
        {
            Intent intent=new Intent(SuraSomuho.this,SuraIasin.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.suraarrahmanid)
        {
            Intent intent=new Intent(SuraSomuho.this,SuraRrahman.class);
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
            String body="এটা একটা ইসলামিক অ্যাপ। যার মধ্যে ইসলামের মূল ভিত্তিগুলো সম্পর্কে মৌলিক ধারনা দেওয়া হইছে। যার মধ্যে গুরুত্বপূর্ণ বিষয় হলঃ নামাজের সময় হিসাব করা,যাকাত হিসাব করা, তাসবীহ হিসাব করা সহ আরও অনেক কিছু।";

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
