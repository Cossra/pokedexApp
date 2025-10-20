package com.robert.pokedex;

import com.robert.pokedex.model.Pokemon;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 15, "Electric", List.of("Thunder Shock", "Quick Attack"), 50);
        Pokemon charmander = new Pokemon("Charmander", 10, "Water", List.of("Water Gun", "Tackle"), 45);

        pikachu.attack("Thunder Shock");
        charmander.attack("Water Gun");
    }
}