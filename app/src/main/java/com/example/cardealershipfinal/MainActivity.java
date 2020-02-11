package com.example.cardealershipfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CompanyAdapter adapter;
    ArrayList<CompanyModel> posts;
    String send = "send ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Companies");
        posts = new ArrayList<>();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.rView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        adapter = new CompanyAdapter(this, posts);
        recyclerView.setAdapter(adapter);
        initialiseData();
    }

    private void initialiseData() {

        CompanyModel post1 = new CompanyModel(R.drawable.mercedes, "Mercedes Benz");
        CompanyModel post2 = new CompanyModel(R.drawable.bmw, "BMW");
        CompanyModel post3= new CompanyModel(R.drawable.audi,"Audi");


        posts.add(post1);
        posts.add(post2);
        posts.add(post3);


        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this,"Item 1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"You are on the home page",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"Models selected",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,DetailsActivity.class);
                //intent.putExtra("send",send);
                startActivity(intent);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


