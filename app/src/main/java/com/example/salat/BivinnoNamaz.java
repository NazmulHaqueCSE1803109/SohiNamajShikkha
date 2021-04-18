package com.example.salat;

import android.content.Intent;
//import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BivinnoNamaz extends AppCompatActivity implements View.OnClickListener {
private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bivinno_namaz);

        b1=(Button)findViewById(R.id.nofolnamazid);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.tahajjotnamazid);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.salatultasbihid);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.ishraqernamazid);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.sasternamazid);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.tarabihnamazid);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.idulfitorid);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.idulajhaid);
        b8.setOnClickListener(this);
        b9=(Button)findViewById(R.id.beterernamazid);
        b9.setOnClickListener(this);
        b10=(Button)findViewById(R.id.istikhajarnamazid);
        b10.setOnClickListener(this);
        b11=(Button)findViewById(R.id.arokichunamazid);
        b11.setOnClickListener(this);
        b12=(Button)findViewById(R.id.jummarnamazid);
        b12.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.nofolnamazid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,NofolNamazerBiboron.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.tahajjotnamazid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,TahajjotNamaz.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.salatultasbihid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,SalatulTasbih.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.ishraqernamazid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,IshraqerNamaz.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.sasternamazid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,SasterNamaz.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.tarabihnamazid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,TarabihNamaz.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.idulfitorid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,IdulFitor.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.idulajhaid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,IdulAjaha.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.beterernamazid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,BetererNamaz.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.istikhajarnamazid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,IstikhajarNamaz.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.arokichunamazid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,AroNamaz.class);
            startActivity(intent);
        }
        else if (view.getId() == R.id.jummarnamazid)
        {
            Intent intent=new Intent(BivinnoNamaz.this,JummarNamaz.class);
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
