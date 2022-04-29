package com.company;

public class Book {

    private String bookTitle;
    private Author author;
    private int yearOfPublishing;

    public Book(String bookTitle, Author author, int yearOfPublishing){
        this.bookTitle = bookTitle;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookTitle(){
        return bookTitle;
    }
    public Author getAuthor(){
        return author;
    }

    public int getYearOfPublishing(){
        return yearOfPublishing;
}
    public void setYearOfPublishing(int yearOfPublishing){
        this.yearOfPublishing = yearOfPublishing;

}
}