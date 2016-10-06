package com.software_eng_assingment1_maven;
import java.util.*;
import org.joda.time.*;

/**
 * @author Aoife McDonagh, 13411348 <https://github.com/aoifemcdonagh>
 */
public class CourseProgramme {
    private String courseName;
    private ArrayList<Module> modules;
    private LocalDate start;
    private LocalDate end;
    
    public CourseProgramme(String c, LocalDate s, LocalDate e){
        this.courseName = c;
        this.start = s;
        this.end = e;
    }
    
    // Accessor Methods
    public String getCourseName(){
        return this.courseName;
    }
    public List getModules(){
        return this.modules;
    }
    public LocalDate getStart(){
        return this.start;
    }
    public LocalDate getEnd(){
        return this.end;
    }
    
    // Mutator Methods
    public void setCourseName(String c){
        this.courseName = c;
    }
    
    // Adding multiple modules
    public void setModules(ArrayList<Module> m){
        this.modules = m;
        
        // Add this course programme as a course programme 
        // for all students in the module.
        for(Module mod : m){
            
            // Get list of students in each module
            ArrayList<Student> s = mod.getStudents();
            for(Student student : s){
                student.addCourseProgramme(this);
            }   
        }
    }
    public void setStart(LocalDate s){
        this.start = s;
    }
    public void setEnd(LocalDate e){
        this.end = e;
    }
    
    // Adding an individual module
    public void addModule(Module m){
        this.modules.add(m);
        
        // Get the students in the new module
        ArrayList<Student> students = m.getStudents();
        
        // Add this course programme as a course programme 
        // for all students in the module.
        for(Student student : students){
            student.addCourseProgramme(this);
        }
    }
}
