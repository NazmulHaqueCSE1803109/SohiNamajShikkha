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

 public class Pobitrota extends AppCompatActivity implements View.OnClickListener {
private Button b1,b2,b3,b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pobitrota);

        b1=(Button)findViewById(R.id.pobitrotaid);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.paniid);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.pobitrotarguruttoid);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.ojuid);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.gosolermaslaid);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.taiamumid);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.haejonifasid);
        b7.setOnClickListener(this);
    }

     @Override
     public void onClick(View view) {
         if(view.getId()==R.id.pobitrotaid)
         {
             Intent intent=new Intent(Pobitrota.this,PobitrotarBornona.class);
             startActivity(intent);
         }
         else if(view.getId()==R.id.paniid)
         {
             Intent intent=new Intent(Pobitrota.this,Pani.class);
             startActivity(intent);
         }
         else if(view.getId()==R.id.pobitrotarguruttoid)
         {
             Intent intent=new Intent(Pobitrota.this,PobitrotarGurutto.class);
             startActivity(intent);
         }
         else if(view.getId()==R.id.ojuid)
         {
             Intent intent=new Intent(Pobitrota.this,Oju.class);
             startActivity(intent);
         }
         else if(view.getId()==R.id.gosolermaslaid)
         {
             Intent intent=new Intent(Pobitrota.this,Gosol.class);
             startActivity(intent);
         }
         else if(view.getId()==R.id.taiamumid)
         {
             Intent intent=new Intent(Pobitrota.this,Taiamum.class);
             startActivity(intent);
         }
         else if(view.getId()==R.id.haejonifasid)
         {
             Intent intent=new Intent(Pobitrota.this,HaejoNifas.class);
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
