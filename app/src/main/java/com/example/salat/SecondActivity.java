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
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
private Button b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

      b2=(Button)findViewById(R.id.allahName);
      b2.setOnClickListener(this);
      b3=(Button)findViewById(R.id.ai);
      b3.setOnClickListener(this);
      b4=(Button)findViewById(R.id.kalema);
      b4.setOnClickListener(this);
      b5=(Button)findViewById(R.id.pobitrota);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.ajanoikamotid);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.paswaktonamazid);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.namazerbiboronid);
        b8.setOnClickListener(this);
        b9=(Button)findViewById(R.id.kajanamazerid);
        b9.setOnClickListener(this);
        b10=(Button)findViewById(R.id.bivinnonamazid);
        b10.setOnClickListener(this);
        b11=(Button)findViewById(R.id.namazerforojsunnatowajibid);
        b11.setOnClickListener(this);
        b12=(Button)findViewById(R.id.namazerdoaotasbihid);
        b12.setOnClickListener(this);
        b13=(Button)findViewById(R.id.namazersurasomuhoid);
        b13.setOnClickListener(this);
        b14=(Button)findViewById(R.id.namazchitroid);
        b14.setOnClickListener(this);
        b15=(Button)findViewById(R.id.namazvongoid);
        b15.setOnClickListener(this);
        b16=(Button)findViewById(R.id.rojarbiboronid);
        b16.setOnClickListener(this);
        b17=(Button)findViewById(R.id.hojoomrahid);
        b17.setOnClickListener(this);
        b18=(Button)findViewById(R.id.jakaterbiboronid);
        b18.setOnClickListener(this);
        b19=(Button)findViewById(R.id.kurbaniid);
        b19.setOnClickListener(this);
        b20=(Button)findViewById(R.id.doaid);
        b20.setOnClickListener(this);
        b21=(Button)findViewById(R.id.janajanamazid);
        b21.setOnClickListener(this);
        b22=(Button)findViewById(R.id.gunaid);
        b22.setOnClickListener(this);
        b23=(Button)findViewById(R.id.counterid);
        b23.setOnClickListener(this);
        b24=(Button)findViewById(R.id.jakathishabid);
        b24.setOnClickListener(this);
        b25=(Button)findViewById(R.id.namajtimeid);
        b25.setOnClickListener(this);
        b26=(Button)findViewById(R.id.kuranshikkhaid);
        b26.setOnClickListener(this);
        b27=(Button)findViewById(R.id.hadisid);
        b27.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.allahName)
        {
            Intent intent = new Intent(SecondActivity.this, NameOfAllah.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.ai)
        {
            Intent intent=new Intent(SecondActivity.this,AllahorPorisoi.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.kalema)
        {
            Intent intent=new Intent(SecondActivity.this,Kalema.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.pobitrota)
        {
            Intent intent=new Intent(SecondActivity.this,Pobitrota.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.ajanoikamotid)
        {
            Intent intent=new Intent(SecondActivity.this,AjanoIkamot.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.paswaktonamazid)
        {
            Intent intent=new Intent(SecondActivity.this,PaswaktoNamaz.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.namazerbiboronid)
        {
            Intent intent=new Intent(SecondActivity.this,NamazerBiboron.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.kajanamazerid)
        {
            Intent intent=new Intent(SecondActivity.this,KajaNamaz.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.bivinnonamazid)
        {
            Intent intent=new Intent(SecondActivity.this,BivinnoNamaz.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.namazerforojsunnatowajibid)
        {
            Intent intent=new Intent(SecondActivity.this,NamazerForojSunnatOwajib.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.namazvongoid)
        {
            Intent intent=new Intent(SecondActivity.this,NamazVongerkaron.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.namazerdoaotasbihid)
        {
            Intent intent=new Intent(SecondActivity.this,NamazerDoaoTasbih.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.namazersurasomuhoid)
        {
            Intent intent=new Intent(SecondActivity.this,SuraSomuho.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.namazchitroid)
        {
            Intent intent=new Intent(SecondActivity.this,ChitrosohoNamaz.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.rojarbiboronid)
        {
            Intent intent=new Intent(SecondActivity.this,RojarBiboron.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.hojoomrahid)
        {
            Intent intent=new Intent(SecondActivity.this,HojoOmrah.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.jakaterbiboronid)
        {
            Intent intent=new Intent(SecondActivity.this,JakaterBiboron.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.kurbaniid)
        {
            Intent intent=new Intent(SecondActivity.this,KurbanirBiboron.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.doaid)
        {
            Intent intent=new Intent(SecondActivity.this,DoaoAmol.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.gunaid)
        {
            Intent intent=new Intent(SecondActivity.this,BibinnoGunahsomuho.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.janajanamazid)
        {
            Intent intent=new Intent(SecondActivity.this,JanajaNamaj.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.counterid)
        {
            Intent intent=new Intent(SecondActivity.this,Counter.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.namajtimeid)
        {
            Intent intent=new Intent(SecondActivity.this,SalatTime.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.kuranshikkhaid)
        {
            Intent intent=new Intent(SecondActivity.this,KuranShikkha.class);
            startActivity(intent);
        }
        else if(view.getId()==R.id.hadisid)
        {
            Intent intent=new Intent(SecondActivity.this,Hadis.class);
            startActivity(intent);
        }
        else
        {
            Intent intent=new Intent(SecondActivity.this,ZakatCalculator.class);
            startActivity(intent);
        }
    }


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
