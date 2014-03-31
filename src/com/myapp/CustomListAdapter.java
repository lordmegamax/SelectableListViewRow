package com.myapp;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class CustomListAdapter extends ArrayAdapter<String> {
    private final LayoutInflater inflater;
    private int selectedItemPosition;

    public CustomListAdapter(Context context, String[] data) {
        super(context, R.layout.row, data);

        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = inflater.inflate(R.layout.row, parent, false);

        LinearLayout layout = (LinearLayout) convertView;
        if (position == selectedItemPosition) {
            layout.setBackgroundColor(Color.BLUE);
        } else {
            layout.setBackgroundColor(Color.GREEN);
        }

        return convertView;
    }

    public void setSelectedItemPosition(int position) {
        selectedItemPosition = position;
    }
}
