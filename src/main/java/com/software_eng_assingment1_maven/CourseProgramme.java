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
    private ArrayList<Student> students;
    
    public CourseProgramme(String c, LocalDate s, LocalDate e){
        this.courseName = c;
        this.start = s;
        this.end = e;
        this.modules = new ArrayList<Module>();
        this.students = new ArrayList<Student>();
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
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    
    // Mutator Methods
    public void setCourseName(String c){
        this.courseName = c;
    }
    // Adding multiple modules, overrides original list
    public void setModules(ArrayList<Module> m){
        this.modules = m;
        
        for(Module mod : m){
            for(Student s : this.students){
                mod.addStudent(s);
                s.addModule(mod);
            }
        }
    }
    public void setStart(LocalDate s){
        this.start = s;
    }
    public void setEnd(LocalDate e){
        this.end = e;
    }
    
    // Adding multiple students, overrides original list.
    public void setStudents(ArrayList<Student> s){
        this.students = s;
        
        for(Student student : s){
            // Add this student to the Course Programme's modules
            for(Module mod : this.modules){
                mod.addStudent(student); 
                student.addModule(mod);
            }
        }
    }
    
    // Adding an individual module
    public void addModule(Module m){
        this.modules.add(m);
        
        // Add the students in the course to the module's list of students
        for(Student student : this.students){
            m.addStudent(student);
        }
    }
    
    public void addStudent(Student s){
        this.students.add(s);
        s.addCourseProgramme(this);
        
        // Add this student to the Course Programme's modules
        for(Module mod : this.modules){
            mod.addStudent(s); 
            s.addModule(mod);
        }
    }
}
