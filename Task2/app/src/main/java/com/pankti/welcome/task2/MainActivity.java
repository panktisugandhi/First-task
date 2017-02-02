package com.pankti.welcome.task2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private Button btn1f,btn2s,btn3t;
    private Fragment1 frg1;
    private Fragment2 frg2;
    private Fragment3 frg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.activity_main);
        btn1f =(Button) findViewById(R.id.btn1);
        btn2s =(Button) findViewById(R.id.btn2);
        btn3t =(Button) findViewById(R.id.btn3);

        btn1f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frg1 = new Fragment1();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.activity_main,frg1);
                ft.addToBackStack("");
                ft.commit();
           //     fm.popBackStack();
            }
        });


        btn2s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frg2 = new Fragment2();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.activity_main,frg2);
                ft.addToBackStack("");
                ft.commit();
             //   fm.popBackStack();
            }
        });


        btn3t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frg3 = new Fragment3();
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.activity_main,frg3);
                ft.addToBackStack("");
                ft.commit();
               // fm.popBackStack();
            }
        });

    }
}
