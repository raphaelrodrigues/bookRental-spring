/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.print.Book;
import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;
import web.BookController;

/**
 *
 * @author raphael
 */
public class BookControllerTest extends TestCase{
    
   public void testHandleRequestView() throws Exception{       
        BookController controller = new BookController();
        ModelAndView modelAndView = controller.book_list();
        
        assertEquals("bookList", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        ArrayList<Book> booksValue = (ArrayList<Book>) modelAndView.getModel().get("books");
        assertNotNull(booksValue);
    }
}
