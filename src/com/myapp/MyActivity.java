package com.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MyActivity extends Activity implements AdapterView.OnItemClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView lv = (ListView) findViewById(R.id.listView);
        String[] numbers = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eight"};
        CustomListAdapter adapter = new CustomListAdapter(this, numbers);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);

        adapter.setSelectedItemPosition(3);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        CustomListAdapter adapter = (CustomListAdapter) parent.getAdapter();
        adapter.setSelectedItemPosition(position);
        adapter.notifyDataSetChanged();
    }
}
