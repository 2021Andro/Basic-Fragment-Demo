package com.example.basicfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_2 extends Fragment {


    public Fragment_2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        TextView tvName = view.findViewById(R.id.tvName);

        String name = getArguments().getString("Name");

        tvName.setText(name);



        return view;
    }
}