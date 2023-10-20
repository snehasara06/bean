package com.kgisl.springBeanPractice;

import org.springframework.stereotype.Component;

public class Book {
    {
        System.out.println("********** Book Loaded ********** ");
    }

    String bookName;

    Book() {
        System.out.println("Book constructor");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}
