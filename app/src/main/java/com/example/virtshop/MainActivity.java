package com.example.virtshop;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //this is a comment
        button = findViewById(R.id.Button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openActivity2();
            }
        });

        }

    CircleMenu circleMenu = findViewById(R.id.circle_menu);
    final String[] arrayName = {
            "sapun",
            "food",
            "pet",
            "vege",
            "tv"
    };





        circleMenu.setMainMenu(Color.parseColor( "#CDCDCD"), R.drawable.ic_app, R.drawable.ic_cancel)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.food)
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.pet)
                .addSubMenu(Color.parseColor("#FF4B32"), R.drawable.sapun)
                .addSubMenu(Color.parseColor("#8A39FF"), R.drawable.tv)
                .addSubMenu(Color.parseColor("#FF6A00"), R.drawable.vege)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this, "You selected" +arrayName[index], Toast.LENGTH_SHORT).show();
                    }


        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menubar) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menubar,menubar);
        return true;
    }

    public void openActivity2(){
        Intent intent = onNewIntent(this, Activity2.class);
        startActivity(intent);
}
