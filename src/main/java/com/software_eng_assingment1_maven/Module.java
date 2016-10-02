package com.software_eng_assingment1_maven;
import java.util.*;

/**
 * @author Aoife McDonagh, 13411348 <https://github.com/aoifemcdonagh>
 */
public class Module {
    private String moduleName;
    private String id;
    private ArrayList<Student> students;
    
    public Module(String n, String i, ArrayList s){
        this.moduleName = n;
        this.id = i;
        this.students = s;
    }
    
    // Accessor Methods
    public String getModuleName(){
        return this.moduleName;
    }
    public String getID(){
        return this.id;
    }
    public List getStudents(){
        return this.students;
    }
    
    // Mutator Methods
    public void setModuleName(String n){
        this.moduleName = n;
    }
    public void setID(String i){
        this.id = i;
    }
    public void setStudents(ArrayList s){
        this.students = s;
    }
    
    public void addStudent(Student s){
        this.students.add(s);
    }
}
