/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author raphael
 */
public class BookTest {
    
    private Book book;
    
    @Test
    public void testSetAndGetName() {
        book = new Book(10);
        String testName = "aName";
        book.getId();
        assertNull( book.getName());
        book.setName(testName);
         assertEquals(testName, book.getName());
    }
}
