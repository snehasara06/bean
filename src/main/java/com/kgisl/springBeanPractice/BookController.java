package com.kgisl.springBeanPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/books")
public class BookController {

    {
        System.out.println("********** BookController Loaded ********** ");
    }

    // @Autowired
    Book book;
    // BookController(Book book){
    //     this.book=book;
    // }

    @GetMapping("/books")
    public String getScope(){
        System.out.println(book);
        return "book";
    }

    @GetMapping("/")
    public  String getBook(){
        System.out.println(book);
        return "book";

    }
   @GetMapping("/books/name")
    public String getApplicationScopeMessage(final Model model) {
        System.out.println("App Scope");
        // book.setBookName("Harry Potter");
        model.addAttribute("previousMessage", book.getBookName());
        book.setBookName("Harry Potter");
        model.addAttribute("currentMessage", book.getBookName());
        return "book";
    }
}
