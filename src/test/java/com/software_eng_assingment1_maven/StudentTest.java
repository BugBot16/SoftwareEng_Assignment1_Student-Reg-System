package com.software_eng_assingment1_maven;
import com.software_eng_assingment1_maven.Student;
import junit.framework.TestCase;

/**
 * @author Aoife McDonagh, 13411348 <https://github.com/aoifemcdonagh>
 */
public class StudentTest extends TestCase {
   /**
    * return true if username generated is a concatenation of user's name and age.
    */ 
    public void testGetUsername(){
        Student Alex  = new Student("Alex", 18, "20/11/1997", 13411349);
        
        String expected = "Alex18";
        String actual = Alex.getUsername();
        
        assertEquals(expected, actual); // Test if values are equal
    }
    
   
}
