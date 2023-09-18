package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvItem;
    private String[] namaNegara = new String[]{"Indonesia","Malaysia", "Singapore", "Italia", "Ingrris"
            , "Belanda","Argentina", "Chile","Mesir", "Uganda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem=(ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this, android.R.
                layout.simple_list_item_2, android.R.id.text2, namaNegara);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                Toast.makeText(MainActivity.this, "Memilih: "+ namaNegara[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}