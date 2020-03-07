package com.example.novatec.dracarys.cervejaadvice;

import java.util.ArrayList;
import java.util.List;

public class ExpertCerveja {

    List<String> getMarcas(String color) {
        List<String> marcas = new ArrayList<String>();
        if (color.equals("amber")) {
            marcas.add("Jack Amber");
            marcas.add("Red Moose");
            marcas.add("Patagônia");
        } else if (color.equals("lager")) {
                marcas.add("Brahma extra");
                marcas.add("Corona");
                marcas.add("Heinneken");
        } else if (color.equals("pilsen")) {
            marcas.add("Skol");
            marcas.add("Bavária");
            marcas.add("Kaiser");
        } else {
            marcas.add("Jail Pale Ale");
            marcas.add("Gout Stout");
        }
        return marcas;
    }
}
