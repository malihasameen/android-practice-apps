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
public class NumbersFragment extends Fragment {


    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add( new Word("one","un",R.drawable.number_one));
        words.add( new Word("two","deux",R.drawable.number_two));
        words.add( new Word("three","trois",R.drawable.number_three));
        words.add( new Word("four","quatre",R.drawable.number_four));
        words.add( new Word("five","cinq",R.drawable.number_five));
        words.add( new Word("six","six",R.drawable.number_six));
        words.add( new Word("seven","sept",R.drawable.number_seven));
        words.add( new Word("eight","huit",R.drawable.number_eight));
        words.add( new Word("nine","neuf",R.drawable.number_nine));
        words.add( new Word("ten","dix",R.drawable.number_ten));

        WordAdapter adapter =
                new WordAdapter(getActivity(), words, R.color.category_numbers);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
