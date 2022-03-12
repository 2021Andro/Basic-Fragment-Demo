package com.example.basicfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment_1 extends Fragment {


    public Fragment_1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        Button btnAdd = view.findViewById(R.id.btnAddPerson);

        EditText etPersonName = view.findViewById(R.id.etPersonName);



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = etPersonName.getText().toString().trim();

                if (name.isEmpty())
                {
                    etPersonName.setError("Enter your name");
                    return;
                }
                else {

                    Fragment_2 frag2 = new Fragment_2();

                    Bundle bundle = new Bundle();

                    bundle.putString("Name", name);

                    frag2.setArguments(bundle);

                    getFragmentManager().beginTransaction().replace(R.id.fcFra, frag2).addToBackStack(null).commit();

                }


            }
        });




        return view;
    }
}