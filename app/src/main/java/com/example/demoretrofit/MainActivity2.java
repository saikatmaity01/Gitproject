package com.example.demoretrofit;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    /*TextView tv_Name, tv_Pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_Name = findViewById(R.id.tv_Name);
        tv_Pwd = findViewById(R.id.tv_Pwd);
        SharedPreferences sp = getSharedPreferences("Demo", Context.MODE_PRIVATE);
        tv_Name.setText(sp.getString("name", ""));
        tv_Pwd.setText(sp.getString("pwd", ""));
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        new AlertDialog.Builder(MainActivity2.this)
                .setCancelable(false)
                .setMessage("Log Out")
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences sp = getSharedPreferences("Demo", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sp.edit();
                        editor.clear();
                        editor.apply();
                        finish();
                    }
                }).show();
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("lifecycle1", "onCreate invoked");
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(MainActivity2.this,MainActivity.class));

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle1", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle1", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle1", "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle1", "onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle1", "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle1", "onDestroy invoked");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}