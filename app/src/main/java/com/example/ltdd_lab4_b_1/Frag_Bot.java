package com.example.ltdd_lab4_b_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag_Bot#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag_Bot extends Fragment {
    ImageButton ibtLeft, ibtCenter, ibtRight;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters


    public Frag_Bot() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frag_Bot.
     */
    // TODO: Rename and change types and number of parameters
    public static Frag_Bot newInstance() {
        Frag_Bot fragment = new Frag_Bot();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag__bot, container, false);
        ibtCenter = view.findViewById(R.id.ibtCenter);
        ibtLeft = view.findViewById(R.id.ibttLeft);
        ibtRight = view.findViewById(R.id.ibtRight);
        view.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        ibtLeft.setBackgroundResource(R.drawable.ic_baseline_view_headline_24);
        ibtCenter.setBackgroundResource(R.drawable.ic_baseline_home_24);
        ibtRight.setBackgroundResource(R.drawable.ic_baseline_subdirectory_arrow_left_24);

        return view;
    }
}