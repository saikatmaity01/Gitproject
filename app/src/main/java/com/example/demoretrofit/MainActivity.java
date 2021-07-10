package com.example.demoretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {

    //RecyclerView rv;
    ListView lv;
    RetroAdapter retroAdapter;
    //ArrayList<model> arr = new ArrayList<>();
    /*String url = "http://wptrafficanalyzer.in/p/demo1/first.php/";
    List<model> data;
    Button btn;
    EditText et_Name, et_Pwd;
    String name, pwd;*/

    /* @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         *//*et_Name = findViewById(R.id.et_name);
        et_Pwd = findViewById(R.id.et_pwd);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = et_Name.getText().toString();
                pwd = et_Pwd.getText().toString();
                if (name.equals("") || pwd.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                }
                else {
                    SharedPreferences sp = getSharedPreferences("Demo", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("name", name);
                    editor.putString("pwd", pwd);
                    editor.commit();
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                    finish();
                }
            }
        });*//*
        //rv = findViewById(R.id.rv);
        lv = findViewById(R.id.lv);

        //getData();
        //getJSONResponse();

       *//* model m=new model();
        m.name="Saikat";
        m.display();*//*
     *//*MainActivity m=new MainActivity();
        Thread t=new Thread(m);
        t.start();*//*
    }*/
    private void getJSONResponse() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MyInterface.JSONURL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

        MyInterface api = retrofit.create(MyInterface.class);

        Call<String> call = api.getString();

        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.i("Responsestring", response.body().toString());
                //Toast.makeText()
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        String jsonresponse = response.body().toString();
                        writeListView(jsonresponse);

                    } else {
                        Log.i("onEmptyResponse", "Returned empty response");//Toast.makeText(getContext(),"Nothing returned",Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }

    private void writeListView(String response) {

        try {
            //getting the whole json object from the response
            JSONObject obj = new JSONObject(response);
            if (obj.optString("status").equals("true")) {

                ArrayList<model> modelListViewArrayList = new ArrayList<>();
                JSONArray dataArray = obj.getJSONArray("data");

                for (int i = 0; i < dataArray.length(); i++) {

                    model modelListView = new model();
                    JSONObject dataobj = dataArray.getJSONObject(i);

                   /* modelListView.setImgURL(dataobj.getString("imgURL"));
                    modelListView.setName(dataobj.getString("name"));
                    modelListView.setCountry(dataobj.getString("country"));
                    modelListView.setCity(dataobj.getString("city"));*/

                    modelListViewArrayList.add(modelListView);

                }

                retroAdapter = new RetroAdapter(this, modelListViewArrayList);
                lv.setAdapter(retroAdapter);

            } else {
                Toast.makeText(MainActivity.this, obj.optString("message") + "", Toast.LENGTH_SHORT).show();
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    /*@Override
    public void run() {
        Log.i("onSu","Thread Running");
    }*/
    /*public void getData() {
        //Create Retrofit Object
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        myapi api = retrofit.create(myapi.class);
        Call<List<model>> call=api.getModels();

        call.enqueue(new Callback<List<model>>() {
            @Override
            public void onResponse(Call<List<model>> call, Response<List<model>> response) {
                data=response.body();
                rv.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                rv.setAdapter(new MyAdapter(MainActivity.this, data));
                lv.setAdapter(new MyAdapter(MainActivity.this, data));
            }

            @Override
            public void onFailure(Call<List<model>> call, Throwable t) {

            }
        });
    }*/
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate invoked");


               /* ArrayList obj=new ArrayList();
                obj.add("A");
                obj.add("B");
                obj.add("C");
                obj.add(1,"D");
                System.out.println("Obj"+obj);*/
        /*ArrayList<String> arr=new ArrayList<String>(2);
        arr.add("A");
        arr.add("B");
        arr.add("C");
        ArrayList<String> arr1=new ArrayList<String>();
        arr1.add("X");
        arr1.add("Y");
        arr1.add("Z");

        arr.addAll(arr1);
        System.out.println("Obj"+arr.size());*/

       /* int arr[] = {14,46,47,94,94,52,86,36,94,89};
        int largest = arr[0];
        int result = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                result = largest;
                largest = arr[i];
            } else if (arr[i] > result && arr[i] != largest) {
                result = arr[i];
            }
        }
        System.out.println("Obj" + result);*/

       /* model m=new model();
        //m.setName("Saikat");
        m.name="Saikat";
        m.display();*/

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
                //finish();

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy invoked");
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}