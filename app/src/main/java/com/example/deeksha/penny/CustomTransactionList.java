package com.example.deeksha.penny;

import android.app.Activity;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


    public class CustomTransactionList extends ArrayAdapter<String> {

        private Activity context ;
        int[] dateIcon;
        String[] transactionName;
        double[] transactionPrice;
        int[] groupIcon;

        public CustomTransactionList(Activity context,int[] dateIcon, String[] transactionName,
                                     double[] transactionPrice, int[] groupIcon)
        {
            super(context, R.layout.custom_transaction_list);
            this.context = context;
            this.dateIcon = dateIcon;
            this.transactionName = transactionName;
            this.transactionPrice = transactionPrice;
            this.groupIcon = groupIcon;
        }
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent)
//        {
//            LayoutInflater layoutInflater = context.getLayoutInflater();
//            View row = layoutInflater.inflate(R.layout.custom_transaction_list,null,true);
//            TextView animalName = (TextView) row.findViewById(R.id.animalName);
//            ImageView animalImage = (ImageView) row.findViewById(R.id.detailAnimalImage);
//            animalName.setText(animalItems[position]);
//            animalImage.setImageResource(imageId[position]);
//            return row;
//        }
//    }

}
