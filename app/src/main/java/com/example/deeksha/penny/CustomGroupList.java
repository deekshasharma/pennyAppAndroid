package com.example.deeksha.penny;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomGroupList extends ArrayAdapter
{

    private String[] groupNames;
    private int[] imageIds;


    public CustomGroupList(Context context,int resource, String[] groupNames, int[] imageIds )
    {
        super(context, resource);
        this.groupNames = groupNames;
        this.imageIds = imageIds;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.custom_group_list,null,true);
        ImageView imageView = (ImageView) row.findViewById(R.id.groupImage);
        TextView textView = (TextView) row.findViewById(R.id.groupName);
        imageView.setImageResource(imageIds[position]);
        textView.setText(groupNames[position]);
        return row;
    }

}
