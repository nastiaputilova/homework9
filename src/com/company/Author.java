package com.company;

import java.util.Objects;

public class Author {

    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
}

    @Override
    public String toString(){
        return "Author: " + this.firstName + " " + this.lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }

        Author author = (Author) other;
        if (getFirstName() != author.getFirstName()) {
            return false;
    }
        if (getLastName() != author.getLastName()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}