package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add( new Word("black","noir",R.drawable.color_black));
        words.add( new Word("red","rouge",R.drawable.color_red));
        words.add( new Word("yellow","jaune",R.drawable.color_yellow));
        words.add( new Word("blue","bleu",R.drawable.color_black));
        words.add( new Word("green","vert",R.drawable.color_green));
        words.add( new Word("orange","orange",R.drawable.color_black));
        words.add( new Word("purple","violet",R.drawable.color_black));
        words.add( new Word("brown","marron",R.drawable.color_brown));
        words.add( new Word("grey","gris",R.drawable.color_gray));
        words.add( new Word("white","blanc",R.drawable.color_white));

        WordAdapter adapter =
                new WordAdapter(getActivity(), words, R.color.category_colors);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
