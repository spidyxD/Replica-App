package com.example.lab_bcr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class Beneficios_Tarjetas extends AppCompatActivity {

    CarouselView carouselView;

    int[] sampleImages = {R.drawable.e1, R.drawable.e2, R.drawable.e3, R.drawable.e4, R.drawable.e5,R.drawable.e6,
            R.drawable.e7, R.drawable.e8, R.drawable.e9, R.drawable.e10, R.drawable.e11,R.drawable.e12,R.drawable.e13, R.drawable.e14, R.drawable.e15, R.drawable.e16};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_beneficios_tarjetas);
        getSupportActionBar().hide();
        carouselView = findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(sampleImages[position]);
            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {

            }
        });
    }

}
