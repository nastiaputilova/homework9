package com.company;

import java.util.Objects;

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
    @Override
    public String toString(){
        return "Title: " + this.bookTitle + " Year of publication: " + this.yearOfPublishing + " " + this.author;
        }


            @Override
            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (other == null || getClass() != other.getClass()) {
                    return false;
                }

                Book book = (Book) other;
                if (getAuthor() != book.getAuthor()) {
                    return false;
                }
                if (getYearOfPublishing() != book.getYearOfPublishing()) {
                    return false;
                }
                if (getBookTitle() != book.getBookTitle()) {
                    return false;
                }
                return true;
            }

    @Override
    public int hashCode() {
       return Objects.hash(bookTitle, author, yearOfPublishing);
    }

        }




