package com.example.lab_bcr;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.lab_bcr.ui.main.SectionsPagerAdapter;

public class Indicador_Finan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generic_tabs);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        tabs.addTab(tabs.newTab().setText("TIPO DE CAMBIO"));
        tabs.addTab(tabs.newTab().setText("CALCULADORA DE CREDITOS"));
        tabs.addTab(tabs.newTab().setText("TASAS DE INTERES"));
        tabs.addTab(tabs.newTab().setText("TASAS CDP"));
        tabs.addTab(tabs.newTab().setText("BCR VALORES"));
        tabs.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
}