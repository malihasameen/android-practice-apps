package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add( new Word("father","padre",R.drawable.family_father));
        words.add( new Word("mother","madre",R.drawable.family_mother));
        words.add( new Word("grandfather","abuelo",R.drawable.family_grandfather));
        words.add( new Word("grandmother","abuela",R.drawable.family_grandmother));
        words.add( new Word("grandson","nieto",R.drawable.family_grandson));
        words.add( new Word("granddaughter","nieta",R.drawable.family_granddaughter));
        words.add( new Word("brother","hermano",R.drawable.family_brother));
        words.add( new Word("sister","hermana",R.drawable.family_sister));
        words.add( new Word("son","hijo",R.drawable.family_son));
        words.add( new Word("daughter","hija",R.drawable.family_daughter));
        words.add( new Word("uncle","tio",R.drawable.family_uncle));
        words.add( new Word("aunt","tia",R.drawable.family_aunt));
        words.add( new Word("nephew","sobrino",R.drawable.family_nephew));
        words.add( new Word("niece","sobrina",R.drawable.family_niece));

        WordAdapter adapter =
                new WordAdapter(getActivity(), words,R.color.category_family);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
