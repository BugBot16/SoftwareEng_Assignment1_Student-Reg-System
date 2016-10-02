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
    
    public CourseProgramme(String c, ArrayList m, LocalDate s, LocalDate e){
        this.courseName = c;
        this.modules = m;
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
    public void setModules(ArrayList m){
        this.modules = m;
    }
    public void setStart(LocalDate s){
        this.start = s;
    }
    public void setEnd(LocalDate e){
        this.end = e;
    }
    
    public void addModule(Module m){
        this.modules.add(m);
    }
}
