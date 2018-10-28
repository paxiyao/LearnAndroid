package com.a24900.helloworld.ListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.a24900.helloworld.MainActivity;
import com.a24900.helloworld.R;

public class ListViewActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        mListView = (ListView) findViewById(R.id.lv);
        mListView.setAdapter(new MyListAdapter(ListViewActivity.this));
    }
}
