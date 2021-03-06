package com.a24900.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.a24900.helloworld.ListView.ListViewActivity;
import com.a24900.helloworld.ListView.MyListAdapter;

public class MainActivity extends AppCompatActivity {

    private Button mBtnRadioButton;
    private Button mBtnListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButton(mBtnRadioButton, R.id.btn_radiobutton, RodioButtonActivity.class);
        setButton(mBtnListView, R.id.btn_listview, ListViewActivity.class);

    }

    private void setButton(Button btn, int id, final Class<?> cls){
        btn = (Button) findViewById(id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, cls);
                startActivity(intent);
            }
        });
    }
}
