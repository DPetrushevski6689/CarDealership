package com.example.cardealershipfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle("Models");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ArrayList<Model> modeli =new ArrayList<>();
        Intent intent = getIntent();
        int id = intent.getIntExtra("image_url",R.drawable.bmw);
        if(id==R.drawable.mercedes){
            modeli.add(new Model(R.drawable.cclass,"C-Class"));
            modeli.add(new Model(R.drawable.eclass,"E-Class"));
            modeli.add(new Model(R.drawable.sclass,"S-Class"));
        }
        else if(id==R.drawable.bmw){
            modeli.add(new Model(R.drawable.three,"3-Series"));
            modeli.add(new Model(R.drawable.five,"5-Series"));
            modeli.add(new Model(R.drawable.seven,"7-Series"));
        }




        /****************komentari.add(new Model(R.drawable.cclass,"C-Class"));
         komentari.add(new Model(R.drawable.eclass,"E-Class"));
         komentari.add(new Model(R.drawable.sclass,"S-Class"));****/

        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter= new ModelAdapter(modeli);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
