package com.example.bulbulhossen.animationlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toolbar;

import com.dodola.listview.extlib.ListViewExt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// {
//            @Override
//            public void onClick(View view) {
//            }
//        });

        String[] strs = new String[30];
        for (int i = 0; i < 30; i++) {strs[i] = "আমার সোনার বাংলা" + i;
        }
        ListViewExt lv = (ListViewExt) findViewById(R.id.view);
        lv.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, strs));
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.me.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
