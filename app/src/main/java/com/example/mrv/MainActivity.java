package com.example.mrv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private RecyclerView RV=null;
    private String pet_types[]=null,pet_desc[]=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RV=(RecyclerView)findViewById(R.id.id_recyclerView);
        pet_types=getResources().getStringArray(R.array.pet_types);
        pet_desc=getResources().getStringArray(R.array.pet_desc);
        MyAdapter mAdapterObject=new MyAdapter(getApplicationContext(),pet_types,pet_desc);
        RV.setAdapter(mAdapterObject);
        RV.setLayoutManager(new LinearLayoutManager(this));
    }
}
