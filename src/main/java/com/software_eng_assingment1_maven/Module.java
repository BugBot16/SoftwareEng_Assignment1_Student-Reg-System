package com.software_eng_assingment1_maven;
import java.util.*;

/**
 * @author Aoife McDonagh, 13411348 <https://github.com/aoifemcdonagh>
 */
public class Module {
    private String moduleName;
    private String id;
    private ArrayList<Student> students;
    
    public Module(String n, String i){
        this.moduleName = n;
        this.id = i;
    }
    
    // Accessor Methods
    public String getModuleName(){
        return this.moduleName;
    }
    public String getID(){
        return this.id;
    }
    public ArrayList getStudents(){
        return this.students;
    }
    
    // Mutator Methods
    public void setModuleName(String n){
        this.moduleName = n;
    }
    public void setID(String i){
        this.id = i;
    }
    
    // Adding a list of students
    public void setStudents(ArrayList<Student> s){
        this.students = s;
        
        //Add this module as a module each student is registered in.
        for(Student student : s){
            student.addModule(this);
        }
    }
    
    // Adding an individual student
    public void addStudent(Student s){
        this.students.add(s);
        s.addModule(this); // Adding itself to student's list of assigned modules
    }
}
