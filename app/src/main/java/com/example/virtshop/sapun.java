package com.example.virtshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

public class sapun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sapun);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menubar) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menubar, menubar);
        return true;
    }
}
