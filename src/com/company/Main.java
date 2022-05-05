package com.company;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Alexander", "Pushkin");
        Author tolstoy = new Author("Lev", "Tolstoy");

        Book onegin = new Book("Evgeniy Onegin", pushkin, 1833);
        System.out.println(onegin);
        Book karenina = new Book("Anna Karenina", tolstoy, 1878);
        System.out.println(karenina);

        onegin.setYearOfPublishing(1832);

        System.out.println("pushkin.equals(tolstoy)? " + pushkin.equals(tolstoy));
        System.out.println("onegin.equals(onegin)? " + onegin.equals(onegin));
    }
}
