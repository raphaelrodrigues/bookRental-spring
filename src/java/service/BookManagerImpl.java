/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.util.List;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookRepository;

/**
 *
 * @author raphael
 */
@Service
public class BookManagerImpl implements BookManager{
    
    //private BookRepository bookRepository;   
    private List<Book> books;
    
    @Override
    public List<Book> findAllBooks() {
        return books;
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }
    
    
     public void setBooks(List<Book> books) {
        this.books = books;
    }  
    
}
