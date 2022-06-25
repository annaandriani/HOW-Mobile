package com.example.movietheater.movies;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.movietheater.R;


public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if(savedInstanceState == null){
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame_movies, new ListFragment()).commit();
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.movie_fragment_main, container, false);
    }

}