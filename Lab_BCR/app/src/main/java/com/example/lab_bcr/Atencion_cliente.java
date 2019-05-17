package com.example.lab_bcr;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Atencion_cliente extends AppCompatActivity {
    private static final String TAG="MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_atencion_cliente);

        Log.d(TAG,"onCreate: Starting");

        mSectionsPageAdapter= new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager= (ViewPager)findViewById(R.id.container);
        setupViewPage(mViewPager);

        TabLayout tabLayout= (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
    private void setupViewPage(ViewPager viewPager){
        SectionsPageAdapter adapter= new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new contacto_bcr(), "CONTACTO BCR");
        adapter.addFragment(new facebook_bcr(), "FACEBOOK");
        adapter.addFragment(new twiter_bcr(), "TWITER");
        adapter.addFragment(new youtube_bcr(), "YOUTUBE");
        viewPager.setAdapter(adapter);
    }

}