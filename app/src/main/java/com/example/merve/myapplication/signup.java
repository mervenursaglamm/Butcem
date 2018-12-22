package com.example.merve.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        Button girisbtn=(Button)findViewById(R.id.girisyapbtn);
        girisbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent sayfa=new Intent(signup.this, login.class);
                startActivity(sayfa);

            }
        });
    }
}
