package com.example.cardealershipfinal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Zoomed extends AppCompatActivity {

    private ImageView iv;
    private ImageView oldPhoto;
    private static final int REQUEST_IMAGE_CAPTURE=101;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_zoom);


        Intent intent = getIntent();
        iv=(ImageView) findViewById(R.id.imageview);
        oldPhoto = (ImageView) findViewById(R.id.availableimage);

        String car = intent.getStringExtra("image_url");
        Glide.with(this).asBitmap().load(car).into(oldPhoto); /** samo ova ne znam zashto ne funkcionira **/

    }


    public void takePicture(View view) {
        Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if(imageTakeIntent.resolveActivity(getPackageManager())!=null){
            startActivityForResult(imageTakeIntent,REQUEST_IMAGE_CAPTURE);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            iv.setImageBitmap(imageBitmap);
        }

    }

    public void sendPicture(View view) {
        Toast.makeText(view.getContext(),"Image sent",Toast.LENGTH_SHORT).show();
    }
}
