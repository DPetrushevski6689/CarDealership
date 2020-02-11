package com.example.cardealershipfinal;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AvailableActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<AvailableModel> modeli;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_2);
        setTitle("Available Models");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        modeli=new ArrayList<>();

        Intent intent = getIntent();
        int imgSent = intent.getIntExtra("image_url1",R.drawable.cclass);
        if(imgSent==R.drawable.cclass){
            modeli.add(new AvailableModel(R.drawable.cklasaprva,"Mercedes-Benz C-Class 2008","3.5-litre V6 petrol 230 Horsepower","Comfort package"));
            modeli.add(new AvailableModel(R.drawable.cklasavtora,"Mercedes-Benz C-Class 2012","3.8-litre V8 petrol 285 Horsepower","Excellence package"));
            modeli.add(new AvailableModel(R.drawable.cklasatreta,"Mercedes-Benz C-Class 2018","5.6-litre AMG V8 petrol 450 Horsepower","Sport AMG package"));
        }
        else if(imgSent==R.drawable.eclass){
            modeli.add(new AvailableModel(R.drawable.eklasaprva,"Mercedes-Benz E-Class 2008","3.5-litre V6 petrol 230 Horsepower","Comfort package"));
            modeli.add(new AvailableModel(R.drawable.eklasavtora,"Mercedes-Benz E-Class 2012","3.8-litre V8 petrol 285 Horsepower","Excellence package"));
            modeli.add(new AvailableModel(R.drawable.eklasatreta,"Mercedes-Benz E-Class 2018","5.6-litre AMG V8 petrol 450 Horsepower","Sport AMG package"));
        }
        else if(imgSent==R.drawable.sclass){
            modeli.add(new AvailableModel(R.drawable.sklasaprva,"Mercedes-Benz S-Class 2008","4.8-litre V6 petrol 320 Horsepower","Comfort package"));
            modeli.add(new AvailableModel(R.drawable.sklasavtora,"Mercedes-Benz S-Class 2012","3.8-litre V8 petrol 440 Horsepower","Excellence package"));
            modeli.add(new AvailableModel(R.drawable.sklasatreta,"Mercedes-Benz S-Class 2018","7.0-litre AMG V12 petrol 550 Horsepower","Sport AMG package"));
        }
        else if(imgSent==R.drawable.three) {
            modeli.add(new AvailableModel(R.drawable.triprva, "BMW 3-Series 2014", "3.5-litre V6 petrol 230 Horsepower", "Comfort package"));
            modeli.add(new AvailableModel(R.drawable.trivtora, "BMW 3-Series 2019", "6.2-litre V10 petrol 520 Horsepower", "M-Sport package"));
        }
        else if(imgSent==R.drawable.five) {
            modeli.add(new AvailableModel(R.drawable.petprva, "BMW 5-Series 2014", "4.2-litre V6 petrol 280 Horsepower", "Comfort package"));
            modeli.add(new AvailableModel(R.drawable.petvtora, "BMW 5-Series 2019", "6.8-litre V10 petrol 605 Horsepower", "M-Sport package"));
        }
        else if(imgSent==R.drawable.seven) {
            modeli.add(new AvailableModel(R.drawable.sedumprva, "BMW 7-Series 2016", "4.2-litre V8 petrol 230 Horsepower", "Comfort package"));
            modeli.add(new AvailableModel(R.drawable.sedumprva, "BMW 7-Series 2019", "6.1-litre V6 Eco hybrid 450 Horsepower", "Ellegance package"));
        }
        else if(imgSent==R.drawable.achetiri) {
            modeli.add(new AvailableModel(R.drawable.achetprva, "Audi A4 2008", "3.6-litre 4.0 petrol 180 Horsepower", "Comfort package"));
            modeli.add(new AvailableModel(R.drawable.achettreta, "Audi A4 2019", "6.1-litre V8 Eco hybrid 450 Horsepower", "Ellegance package"));
            modeli.add(new AvailableModel(R.drawable.achetvtora, "Audi A4 2012", "6.1-litre V6 Petrol 320 Horsepower", "Ellegance Quattro package"));
        }
        else if(imgSent==R.drawable.ashesh) {
            modeli.add(new AvailableModel(R.drawable.asesprva, "Audi A6 2016", "5.2-litre V10 petrol 340 Horsepower", "Sport Quattro package"));

        }
        else if(imgSent==R.drawable.qsedum) {
            modeli.add(new AvailableModel(R.drawable.qsedprva, "Audi Q7 2012", "4.2-litre 6.0 Diesel 280 Horsepower", "Luxury Quattro package"));

        }



        mRecyclerView=findViewById(R.id.rView2);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter= new AvailableAdapter(modeli);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
