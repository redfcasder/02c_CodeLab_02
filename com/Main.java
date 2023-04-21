package com;

import java.util.ArrayList;
import java.util.List;

import com.cc.java.Mitarbeiter;

// public class App {

// 	public static void main(String[] args) {
	
	

// 	}

	

// 	private static void output(String outStr) {
// 		System.out.println(outStr);
// 	}

// };



public class Main {

    public static void main(String[] args) {
        List<Mitarbeiter>mitarbeiters = new ArrayList<>();
        mitarbeiters.add(new Mitarbeiter("Müller", "Til", "Salesperson","21.04.2023" ));
        mitarbeiters.add(new Mitarbeiter("Stift", "Max", "Instructionworker","31.07.2022" ));

       for (Mitarbeiter mitarbeiter : mitarbeiters) {
        System.out.println("-------------------");
        System.out.println(mitarbeiter.getInfo());
        System.out.println(mitarbeiter.getName());
        System.out.println(mitarbeiter.getFirstname());
        System.out.println(mitarbeiter.getFunction());
        System.out.println(mitarbeiter.getEntryYear());
        System.out.println("-------------------");
       }
    }
}