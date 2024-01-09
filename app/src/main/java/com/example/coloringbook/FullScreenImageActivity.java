package com.example.coloringbook;

import static androidx.annotation.InspectableProperty.ValueType.COLOR;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import com.example.coloringbook.Adapter.ImageAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FullScreenImageActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        imageView = (ImageView)findViewById(R.id.image_outline);


        Intent i =getIntent();

        int position=i.getExtras().getInt("id");

        ImageAdapter imageAdapter = new ImageAdapter(this);

        imageView.setImageResource(imageAdapter.imageArray[position]);
    }
}