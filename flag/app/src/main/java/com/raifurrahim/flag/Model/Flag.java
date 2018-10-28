package com.raifurrahim.flag.Model;

public class Flag {

    String name;
    String description;
    String population;
    String currency;
    int icon;


     //constructor


    public Flag(String name, String description, String population, String currency, int icon) {
        this.name = name;
        this.description = description;
        this.population = population;
        this.currency = currency;
        this.icon = icon;
    }

    //getter

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPopulation() {
        return population;
    }

    public String getCurrency() {
        return currency;
    }

    public int getIcon() {
        return icon;
    }
}
