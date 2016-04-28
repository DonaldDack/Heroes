package com.example.dmitry.heroesgame;

import com.example.dmitry.heroesgame.hero.Batmen;
import com.example.dmitry.heroesgame.hero.CatGirl;
import com.example.dmitry.heroesgame.hero.DrDoom;
import com.example.dmitry.heroesgame.hero.GreenArrow;
import com.example.dmitry.heroesgame.hero.HellBoy;
import com.example.dmitry.heroesgame.hero.Joker;
import com.example.dmitry.heroesgame.hero.Magneto;
import com.example.dmitry.heroesgame.hero.RickGrayms;
import com.example.dmitry.heroesgame.hero.Spiderman;
import com.example.dmitry.heroesgame.hero.Superman;
import com.example.dmitry.heroesgame.hero.Turtle;
import com.example.dmitry.heroesgame.hero.Xman;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Dmitry on 23.04.2016.
 */
public class Heroes {
    ArrayList<Hero> heroes;

    public Heroes(){
        heroes = new ArrayList<>();
        heroes.add(new Superman());
        heroes.add(new Batmen());
        heroes.add(new Spiderman());
        heroes.add(new CatGirl());
        heroes.add(new GreenArrow());
        heroes.add(new HellBoy());
        heroes.add(new RickGrayms());
        heroes.add(new Turtle());
        heroes.add(new Xman());
        heroes.add(new DrDoom());
        heroes.add(new Joker());
        heroes.add(new Magneto());
    }

    public Hero getHero(){
        return heroes.get(MainActivity.index(heroes.size()));
    }
}
