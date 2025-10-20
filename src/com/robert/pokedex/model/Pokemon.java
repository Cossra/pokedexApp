package com.robert.pokedex.model;

import java.util.List;

public class Pokemon {
    private String name;
    private int level;
    private String type;

    private List<String> moves;
    private int hp;
    private int maxHp;
    private boolean isFainted;


    public Pokemon(String name, int level, String type, List<String> moves, int maxHp) {
        this.name = name;
        this.level = level;
        this.type = type;
        this.moves = moves;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.isFainted = false;
    }

    public void attack(String move){
        System.out.println(name + " used " + move + "!");
    }
}