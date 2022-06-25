package com.example.movietheater;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class MenuFragment extends Fragment {

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_movie_theater:
                Toast.makeText(getActivity(), "Menu Movie Theater", Toast.LENGTH_LONG).show();
                break;
            case R.id.menuSeat:
                Toast.makeText(getActivity(), "Menu assents", Toast.LENGTH_LONG).show();
                break;
            case R.id.menuMovie:
                Toast.makeText(getActivity(), "Menu Movie", Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}