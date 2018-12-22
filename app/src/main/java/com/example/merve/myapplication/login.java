package com.example.merve.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button kaydolbtn=(Button)findViewById(R.id.uyedegilimbtn);
        kaydolbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent sayfa=new Intent(login.this, signup.class);
                startActivity(sayfa);

            }});


    }

}
