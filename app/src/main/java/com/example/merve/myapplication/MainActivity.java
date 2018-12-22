package com.example.merve.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Button gecmisbutton=(Button)findViewById(R.id.gecmisbtn);
         gecmisbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent sayfa=new Intent(MainActivity.this, gecmis.class);
                 startActivity(sayfa);
             }
         });

        Button giyimbutton=(Button)findViewById(R.id.btn2);
         giyimbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view){
                 Intent sayfa=new Intent(MainActivity.this,giyim.class);
                 startActivity(sayfa);

             }
         });
       Button marketbutton=(Button)findViewById(R.id.btn1);
        marketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent sayfa=new Intent(MainActivity.this,market.class);
                startActivity(sayfa);

            }
        });
       Button faturabutton=(Button)findViewById(R.id.btn3);
       faturabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent sayfa=new Intent(MainActivity.this,fatura.class);
                startActivity(sayfa);

            }
        });
        Button yemekbutton=(Button)findViewById(R.id.btn4);
        yemekbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent sayfa=new Intent(MainActivity.this,yemek.class);
                startActivity(sayfa);

            }
        });
       Button eglencebutton=(Button)findViewById(R.id.btn5);
        eglencebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent sayfa=new Intent(MainActivity.this,eglence.class);
                startActivity(sayfa);

            }
        });
        Button digerbutton=(Button)findViewById(R.id.btn6);
        digerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent sayfa=new Intent(MainActivity.this,diger.class);
                startActivity(sayfa);

            }
        });

        Button gelirbtn=(Button)findViewById(R.id.gelireklebtn);
        gelirbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent sayfa=new Intent(MainActivity.this,login.class);
                startActivity(sayfa);

            }
        });



    }

}

