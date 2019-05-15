package com.example.lab_bcr;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class bcrValores extends Fragment {
    private static final String TAG=" calculadoraCreditos";


    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.tab_bcr_valores, container, false);

    }

}