package com.example.deeksha.penny;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class AddTransactionFragment extends Fragment implements View.OnClickListener {

    private TextView date;
    private Calendar myCalender ;
    private DatePickerDialog datePickerDialog;
    private String[] allMonths = {
            "JAN","FEB", "MAR","APR", "MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"
    };


    public AddTransactionFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view    = inflater.inflate(R.layout.fragment_add_transaction, container, false);
        findViewsById(view);
        setDate();
        return view;
    }

    /*
     Find the view for date field
    */
    public void findViewsById(View view)
    {
        date = (TextView) view.findViewById(R.id.date);
        date.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v == date)
        {datePickerDialog.show();}
    }

    /*
    Allows user to select the date in a date picker and set the value in date field.
     */
    private void setDate()
    {
        myCalender = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(getActivity(),
                new DatePickerDialog.OnDateSetListener()
                {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth)
                    {
                        Calendar selectedDate = Calendar.getInstance();
                        selectedDate.set(year,monthOfYear,dayOfMonth);
                        String month = allMonths[selectedDate.get(Calendar.MONTH)];
                        date.setText(new StringBuilder()
                                .append(selectedDate.get(Calendar.DAY_OF_MONTH)).append("-")
                                .append(month).append("-")
                                .append(selectedDate.get(Calendar.YEAR)));
                    }
                }
        ,myCalender.get(Calendar.YEAR),myCalender.get(Calendar.MONTH),myCalender.get(Calendar.DAY_OF_MONTH));
    }

}
