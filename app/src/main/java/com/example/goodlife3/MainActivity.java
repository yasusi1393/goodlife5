package com.example.goodlife3;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // データを用意
        String[] names = {
                "とり", "しか", "きつね", "かば", "ライオン", "パンダ", "ひつじ"
        };
        String[] details = {
                "「とり」の説明文が入ります。", "「しか」の説明文が入ります。",
                "「きつね」の説明文が入ります。", "「かば」の説明文が入ります。",
                "「ライオン」の説明文が入ります。", "「パンダ」の説明文が入ります。",
                "「ひつじ」の説明文が入ります。"
        };
        int[] images = {
                R.drawable.a, R.drawable.b , R.drawable.c, R.drawable.d,
                R.drawable.e, R.drawable.e, R.drawable.e
        };

        ArrayList<Map<String, Object>> listData = new ArrayList<>();
        for (int i=0; i < names.length; i++) {
            Map<String, Object> item = new HashMap<>();
            item.put("name", names[i]);
            item.put("detail", details[i]);
            item.put("image", images[i]);
            listData.add(item);
        }

        // ListViewにデータをセットする
        ListView list = findViewById(R.id.list);
        list.setAdapter(new SimpleAdapter(
                this,
                listData,
                R.layout.list_item,
                new String[] {"name", "detail", "image"},
                new int[] {R.id.name, R.id.detail, R.id.image}
        ));
    }
}