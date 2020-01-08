package com.example.virtshop;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {
    private ImageButton button;

    final String[] arrayName = {
            "sapun",
            "food",
            "pet",
            "vege",
            "tv"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button = findViewById(R.id.image_button);
        CircleMenu circleMenu = findViewById(R.id.circle_menu);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.ic_app, R.drawable.ic_cancel)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.sapun)
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.food)
                .addSubMenu(Color.parseColor("#FF4B32"), R.drawable.pet)
                .addSubMenu(Color.parseColor("#8A39FF"), R.drawable.vege)
                .addSubMenu(Color.parseColor("#FF6A00"), R.drawable.tv)



                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this, "You selected " + arrayName[index], Toast.LENGTH_SHORT).show();

                        if (index==0){
                            Intent intent = new Intent(MainActivity.this,sapun.class);
                            startActivity(intent);
                        }
                        if (index==1){
                            Intent intent = new Intent(MainActivity.this,food.class);
                            startActivity(intent);
                        }
                        if (index==2){
                            Intent intent = new Intent(MainActivity.this,pet.class);
                            startActivity(intent);
                        }
                        if (index==3){
                            Intent intent = new Intent(MainActivity.this,vege.class);
                            startActivity(intent);
                        }
                        if (index==4){
                            Intent intent = new Intent(MainActivity.this,tv.class);
                            startActivity(intent);
                        }
                        }
                });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menubar) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menubar, menubar);
        return true;
    }

    public void openActivity2() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
