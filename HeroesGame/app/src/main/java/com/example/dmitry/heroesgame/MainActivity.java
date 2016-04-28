package com.example.dmitry.heroesgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static public int Points = 0;
    static public int ind = new Random().nextInt();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    public void heroesClick(View v){
        Intent intent = new Intent(this, HeroesActivity.class);
        startActivity(intent);
    }

    static public int index(int i){
      return (++ind)%i;
    }
}
