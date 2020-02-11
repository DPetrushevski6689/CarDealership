package com.example.cardealershipfinal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Zoomed extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_zoom);

        Intent intent = getIntent();
        int imageUrl = intent.getIntExtra("image_url",R.drawable.cklasaprva);
        //String imageName = intent.getStringExtra("text");
        ImageView iv = (ImageView) findViewById(R.id.imageZoomed);
        TextView name = (TextView) findViewById(R.id.zoomedName);

        if(imageUrl==R.drawable.cklasaprva){
            iv.setImageResource(R.drawable.cklasaprva);
            name.setText("Mercedes-Benz C-Class 2008");
        }
        else if(imageUrl==R.drawable.cklasavtora){
            iv.setImageResource(R.drawable.cklasavtora);
            name.setText("Mercedes-Benz C-Class 2012");
        }
        else if(imageUrl==R.drawable.cklasatreta){
            iv.setImageResource(R.drawable.cklasatreta);
            name.setText("Mercedes-Benz C-Class 2018");
        }
        else if(imageUrl==R.drawable.eklasaprva){
            iv.setImageResource(R.drawable.eklasaprva);
            name.setText("Mercedes-Benz C-Class 2008");
        }
        else if(imageUrl==R.drawable.eklasavtora){
            iv.setImageResource(R.drawable.cklasavtora);
            name.setText("Mercedes-Benz C-Class 2012");
        }
        else if(imageUrl==R.drawable.eklasatreta){
            iv.setImageResource(R.drawable.eklasatreta);
            name.setText("Mercedes-Benz E-Class 2018");
        }
        else if(imageUrl==R.drawable.sklasaprva){
            iv.setImageResource(R.drawable.sklasaprva);
            name.setText("Mercedes-Benz E-Class 2008");
        }
        else if(imageUrl==R.drawable.sklasavtora){
            iv.setImageResource(R.drawable.sklasavtora);
            name.setText("Mercedes-Benz E-Class 2012");
        }
        else if(imageUrl==R.drawable.sklasatreta){
            iv.setImageResource(R.drawable.sklasatreta);
            name.setText("Mercedes-Benz S-Class 2019");
        }
        else if(imageUrl==R.drawable.triprva){
            iv.setImageResource(R.drawable.triprva);
            name.setText("BMW 3-Series 2012");
        }
        else if(imageUrl==R.drawable.trivtora){
            iv.setImageResource(R.drawable.trivtora);
            name.setText("BMW 3-Series  2018");
        }
        else if(imageUrl==R.drawable.petprva){
            iv.setImageResource(R.drawable.petprva);
            name.setText("BMW 5-Series 2014");
        }
        else if(imageUrl==R.drawable.petvtora){
            iv.setImageResource(R.drawable.petvtora);
            name.setText("BMW 5-Series 2019");
        }
        else if(imageUrl==R.drawable.sedumprva){
            iv.setImageResource(R.drawable.sedumprva);
            name.setText("BMW 7-Series 2019");
        }
    }

}
