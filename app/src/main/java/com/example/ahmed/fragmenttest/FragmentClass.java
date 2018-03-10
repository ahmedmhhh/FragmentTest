package com.example.ahmed.fragmenttest;


import android.app.Fragment;
import android.os.Bundle;
import android.widget.Toast;

public class FragmentClass extends Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       Toast.makeText(getActivity(),"hello Ahmed onCreate",Toast.LENGTH_LONG).show();
    }
}
