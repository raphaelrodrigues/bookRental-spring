/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Book;
import org.springframework.stereotype.Repository;
import repository.BookRepository;

/**
 *
 * @author raphael
 */
@Repository

public class JpaBookRepositoryImpl implements BookRepository{

//    @PersistenceContext
//    private EntityManager em;
    
    @Override
    public List<Book> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        //return this.em.createQuery("SELECT * from book").getResultList();
    }
    
  
    
}
