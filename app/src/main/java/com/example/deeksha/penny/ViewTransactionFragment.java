package com.example.deeksha.penny;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


public class ViewTransactionFragment extends Fragment {

    private static final String POSITION = "position";
    private TextView getYear;
    private TextView getMonths;
    private TextView getTransactions;

    public ViewTransactionFragment(){}

    public static ViewTransactionFragment newInstance(int position)
    {
        ViewTransactionFragment fragment = new ViewTransactionFragment();
        Bundle args = new Bundle();
        args.putInt(POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = getLayoutInflater(savedInstanceState).inflate(R.layout.fragment_view_transaction, container, false);

        getYear = (TextView) view.findViewById(R.id.getYear);
        getMonths = (TextView) view.findViewById(R.id.getMonths);
        getTransactions = (TextView) view.findViewById(R.id.getTransactions);
        getYear.setText("2015");
        getMonths.setText("JAN");
        getTransactions.setText("40");
        return view;

//        return inflater.inflate(R.layout.fragment_view_transaction, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity) activity).updateTitle(
                getArguments().getInt(POSITION));
    }



}