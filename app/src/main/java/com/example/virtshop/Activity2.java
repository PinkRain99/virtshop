package com.example.virtshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import java.util.ArrayList;
import java.util.List;
//blablfhtrdvdsrbwe
public class Activity2 extends AppCompatActivity {

    SearchView mySearchView;
    ListView myList;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySearchView = (SearchView)findViewById(R.id.searchView);
        myList = (ListView)findViewById(R.id.myList);

        list=new ArrayList<String >();
        list.add("Patiserie");
        list.add("Produse curatat");
        list.add("Produse ingrijire personala");
        list.add("Mezeluri");
        list.add("Produse lactate");
        list.add("Hartie si servetele");
        list.add("Alimente");


        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list );
        myList.setAdapter(adapter);

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);

                return false;
            }
        });
    }
}