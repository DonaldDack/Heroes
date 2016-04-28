package com.example.dmitry.heroesgame;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HeroesActivity extends AppCompatActivity {

    final int DIALOG = 7;

    private int click_image = 1;

    Heroes heroes;
    GridView gridView;
    Hero hero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heroes_activity);

        Toast.makeText(this, "Имена героев пишите с большой буквы", Toast.LENGTH_SHORT);

        gridView = (GridView)findViewById(R.id.gvHeroes);

        heroes = new Heroes();
        hero = heroes.getHero();
        hero.drawHero(this, gridView, click_image);

    }


    public void btnTestClick(View v){
        if (TextUtils.equals(((EditText) findViewById(R.id.etTest)).getText().toString(), hero.name.toString())){
            winActive();
        }
        else
            Toast.makeText(this, "попробуйте ещё", Toast.LENGTH_SHORT).show();
    }

    private void winActive() {
        MainActivity.Points += 5 - click_image;
        showDialog(DIALOG);
        changeHero();
    }

    protected Dialog onCreateDialog(int id){
        if (id == DIALOG){
            AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle(R.string.happy);
            adb.setMessage("+ " + (5 - click_image) + " в вашу копилку! \n Всего: " + MainActivity.Points);
            return adb.create();
        }
        return super.onCreateDialog(id);
    }

    protected void onPrepareDialog(int id, Dialog dialog){
        super.onPrepareDialog(id, dialog);
        if (id == DIALOG){
            ((AlertDialog) dialog).setMessage("+ " + (5 - click_image) + " в вашу копилку! \n Всего: " + MainActivity.Points);
        }
    }

    public void cliclOpenImage(View v){
        if (click_image < 4)
            hero.drawHero(this, gridView, ++click_image);
    }

    public void skipClick(View v){
        changeHero();
    }

    public void changeHero(){
        EditText et = (EditText) findViewById(R.id.etTest);
        et.setText("");
        hero = heroes.getHero();
        click_image = 1;
        hero.drawHero(this, gridView, click_image);
    }

}
