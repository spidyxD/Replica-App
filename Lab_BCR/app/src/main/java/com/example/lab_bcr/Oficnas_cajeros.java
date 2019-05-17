package com.example.lab_bcr;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;

public class Oficnas_cajeros extends FragmentActivity {
    private static final String TAG="MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_oficinas_cajeros);

        Log.d(TAG,"onCreate: Starting");

        mSectionsPageAdapter= new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager= (ViewPager)findViewById(R.id.container);
        setupViewPage(mViewPager);

        TabLayout tabLayout= (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
    private void setupViewPage(ViewPager viewPager){
        SectionsPageAdapter adapter= new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new oficinas_bcr(), "OFICINAS BCR");
        adapter.addFragment(new atms_bcr(), "ATMS");
        adapter.addFragment(new tucan_bcr(), "TUCAN");
        viewPager.setAdapter(adapter);
    }

}