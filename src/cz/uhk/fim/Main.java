package cz.uhk.fim;

import cz.uhk.fim.model.Movie;

public class Main {

    public static void main(String[] args) {
        // *** 1. Úkol: Prohození 2 proměnných ***
        int a = 5;
        int b = 9;

        // Řešení
        int c = a;
        a = b;
        b = c;

        System.out.println("a: " + a + ", b: " + b);

        // *** 2. Úkol ***
        // Vytvořte pole jmen studentů. Pole v cyklu projdětet a jména vypište.
        // Řešení
        String[] students = { "Jan", "Pepa", "Tomáš", "Štěpán" };
        for (String student : students) {
            System.out.println(student);
        }

        // *** 3. Úkol ***
        // Ve struktuře projektu vytvořte složku model.
        // V této složce vytvořte třídu Movie s atributy Name, Author, Year, Rating v % (např. 76,2%).
        // Zvolte vhodné datové typy a modifikátory přístupu.
        // Vytvořte constructor, gettery a settery
        // Vytvořte metodu toString(), která se postará o vypsání informací o daném filmu v této podobě:
            // Temný rytíř (2008), hodnocení:  90 %, autor: Christopher Nolan
        // Vytvořte dvě instance této třídy a vypište informace o filmech
        Movie movie1 = new Movie("Temný rytíř", "Christopher Nolan", 2008, 90.0f);
        Movie movie2 = new Movie("Hobit: Neočekávaná cesta", "Peter Jackson", 2012, 81.3f);
        System.out.println(movie1);
        System.out.println(movie2);

        // *** 4. Úkol ***
        Movie movie3 = new Movie("Temný rytíř", "Christopher Nolan", 2008, 90.0f);
        Movie movie4 = movie3;
        movie4.setName("Komando");
        movie3.setName("Rambo");
        // Co se vypíše?
        System.out.println(movie3.getName());
        System.out.println(movie4.getName());
    }
}
