package com.example.deeksha.penny;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class AddTransactionFragment extends Fragment implements View.OnClickListener,DatePickerDialog.OnDateSetListener {

    private TextView date;
    private int day;
    private int month;
    private int year;





    public AddTransactionFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view    = inflater.inflate(R.layout.fragment_add_transaction, container, false);
        findViewsById(view);
        return view;
    }

    public void findViewsById(View view)
    {
        date = (TextView) view.findViewById(R.id.date);
        date.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),this,2015,2,2);
        datePickerDialog.show();

    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
    {
        this.year = year;
        this.month = monthOfYear;
        this.day = dayOfMonth;
        updateDisplay();
    }

    private void updateDisplay()
    {
        date.setText(new StringBuilder().append(day).append("/").append(month+1).append("/").append(year).append(" "));
    }

//

}
