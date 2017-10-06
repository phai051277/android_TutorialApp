package com.example.phai0512.tutorialapp;

/**
 * Created by phai0512 on 2017/10/07.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// import jp.co.casareal.sample.viewpagersample.R;

public class HelloFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hello, container, false);
    }
}
