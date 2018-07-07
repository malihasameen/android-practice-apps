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
public class PhrasesFragment extends Fragment {


    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add( new Word("one","un"));
        words.add( new Word("two","deux"));
        words.add( new Word("three","trois"));
        words.add( new Word("four","quatre"));
        words.add( new Word("five","cinq"));
        words.add( new Word("six","six"));
        words.add( new Word("seven","sept"));
        words.add( new Word("eight","huit"));
        words.add( new Word("nine","neuf"));
        words.add( new Word("ten","dix"));

        WordAdapter adapter =
                new WordAdapter(getActivity(), words, R.color.category_phrases);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
