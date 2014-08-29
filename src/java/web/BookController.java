/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import service.BookManager;

/**
 *
 * @author raphael
 */
@Controller
public class BookController {
    
    protected final Log logger = LogFactory.getLog(getClass()); 
    
    private BookManager bookManager;
    
    @RequestMapping("/bookList")
    public ModelAndView book_list() { 
        logger.info("enter"); 
        List<Book> books = new ArrayList<>();
        books.addAll(bookManager.findAllBooks());
        logger.info("Returning hello view with "); 
        if( books.isEmpty() ){
            Book b = new Book(10);
            books.add(b);
        }
        return new ModelAndView("bookList", "books", books ) ;
    }
    
    @RequestMapping("/book/{bookId}")
    public ModelAndView show(@PathVariable("bookId") int bookId) { 
        logger.info("Returning hello view with "); 
        return new ModelAndView("book", "book", "boooooookkkkkkkkkkkk" + bookId  ) ;
    }
    
    @RequestMapping(value="/ajax_request", method = RequestMethod.GET)
    public @ResponseBody String ajax_request() { 
        logger.info("AJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJAAJJJJAJJAJA"); 
        String response = "cdsdsdsdsdsdsdsd";
	return response;
    }
    
    public void setBookManager(BookManager bookManager) {
        this.bookManager = bookManager;
    } 
    
    
    
    
    
}
