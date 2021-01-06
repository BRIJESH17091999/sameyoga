//package com.own.dailykidsyoga;
//
//import java.util.ArrayList;
//
//import android.content.Context;
//import android.content.res.Resources;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//
//
//public class Welcome_screen extends ArrayAdapter<StatusBean> {
//
//    private Context context;
//    private ArrayList<StatusBean> statuses;
//    public Resources res;
//    StatusBean currRowVal = null;
//    LayoutInflater inflater;
//
//    public StatusAdapter(Context context, int textViewResourceId, ArrayList<StatusBean> statuses, Resources resLocal){
//        super(context, textViewResourceId, statuses);
//        this.context = context;
//        this.statuses = statuses;
//        this.res = resLocal;
//        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    }
//    @Override
//    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getDropDownView(position, convertView, parent);
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
//    }
//    public View getCustomView(int position,View convertView, ViewGroup parent){
//        View row = inflater.inflate(R.Layout.status_item,parent,false);
//        currRowVal = null;
//        currRowVal = (StatusBean) statuses.get(position);
//        TextView label = (TextView) row.findViewById(R.id.spinnerItem);
//        if(position == 0){
//            label.setText("Please select age group");
//        }else{
//            label.setText(currRowVal.getStatus());
//        }
//        return row;
//    }
//}
