package com.example.mystudyadapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 列表视图控件
        ListView text_lv = (ListView) findViewById(R.id.text_lv);
        // 数据源
        // String arr[] = { "墩儿", "卷儿", "毛儿", "蔚天" };
        // List<String> list = new ArrayList<String>();
        // for (String string : arr) {
        // list.add(string);
        // }
        // 适配器上下文
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        // R.layout.arraylist_item, R.id.text_tv,list);

        List<Map<String, String>> data = new ArrayList<Map<String, String>>();
        Map<String, String> map = null;
        for (int i = 0; i < 20; i++) {
            map = new HashMap<String, String>();
            map.put("name", "墩儿" + (i + 1));
            map.put("age", "14");
            data.add(map);
            map = null;
        }
        // 适配器上下文
        SimpleAdapter adapter = new SimpleAdapter(this, data,
                R.layout.arraylist_item, new String[]{"name", "age"},
                new int[]{R.id.ltext_name, R.id.ltext_age});

        // 设置适配器
        text_lv.setAdapter(adapter);
        text_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "fuck you", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
