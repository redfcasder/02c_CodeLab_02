
package com.cc.java;

public class Mitarbeiter { //klasse

    private final String name, firstname, function, entryYear; //Attribute
//constructur
    public Mitarbeiter(String name, String firstname, String function, String entryYear) {
        this.name = name;
        this.firstname = firstname;
        this.function = function;
        this.entryYear = entryYear;
    }

    public String getInfo(){
        return "Das ist ist Info von " + name;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getFunction() {
        return function;
    }

    public String getEntryYear() {
        return entryYear;
    }
}