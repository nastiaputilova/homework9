package com.company;

public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Alexander", "Pushkin");
        System.out.println(pushkin.getFirstName() + " " + pushkin.getLastName());

        Author tolstoy = new Author("Lev", "Tolstoy");
        System.out.println(tolstoy.getFirstName() + " " + tolstoy.getLastName());

        Book onegin = new Book("Evgeniy Onegin", pushkin, 1833);
        System.out.println(onegin.getBookTitle() + " " + onegin.getAuthor().getFirstName() + " " + onegin.getAuthor().getLastName() + " " + onegin.getYearOfPublishing());

        Book karenina = new Book("Anna Karenina", tolstoy, 1878);
        System.out.println(karenina.getBookTitle() + " " + karenina.getAuthor().getFirstName() + " " + karenina.getAuthor().getLastName() + " " + karenina.getYearOfPublishing());

        onegin.setYearOfPublishing(1832);
        System.out.println(onegin.getYearOfPublishing());

    }
}
