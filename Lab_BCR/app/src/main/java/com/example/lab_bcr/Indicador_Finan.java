package com.example.lab_bcr;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

public class Indicador_Finan extends FragmentActivity  {
    private static final String TAG="MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private  ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_indicador_financiero);

        Log.d(TAG,"onCreate: Starting");

        mSectionsPageAdapter= new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager= (ViewPager)findViewById(R.id.container);
        setupViewPage(mViewPager);

        TabLayout tabLayout= (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }
    private void setupViewPage(ViewPager viewPager){
        SectionsPageAdapter adapter= new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new tipoCambio(), "TIPO DE CAMBIO");
        adapter.addFragment(new calculadoraCreditos(), "CALCULADORA CRÉTIDOS");
        adapter.addFragment(new tasasDeInteres(), "TASAS DE INTERÉS");
        adapter.addFragment(new tasasCdp(), "TASAS CDP");
        adapter.addFragment(new bcrValores(), "BCR VALORES");
        viewPager.setAdapter(adapter);
    }

}