package com.a24900.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.a24900.helloworld.ListView.MyListAdapter;

public class MainActivity extends AppCompatActivity {

    private Button mBtnRadioButton;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButton(mBtnRadioButton, R.id.btn_radiobutton, RodioButtonActivity.class);

        mListView = (ListView) findViewById(R.id.lv);
        mListView.setAdapter(new MyListAdapter(MainActivity.this));
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
