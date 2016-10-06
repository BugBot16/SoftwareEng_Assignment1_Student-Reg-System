package com.software_eng_assingment1_maven;

import java.util.ArrayList;

/**
 * @author Aoife McDonagh, 13411348 <https://github.com/aoifemcdonagh>
 */
public class Student {
    private String name;
    private int age;
    private String dob;
    private int id;
    private String username;
    private ArrayList<Module> assignedModules;
    private CourseProgramme registeredCourse;
    
    public Student(String n, int a, String d, int i){
        this.name = n;
        this.age = a;
        this.dob = d;
        this.id = i;
        this.username = getUsername();
        this.assignedModules = new ArrayList<Module>();
    }
    
    // Mutator Methods
    public void setName(String n){
        this.name = n;
    }
    public void setAge(String a){
        this.name = a;
    }
    public void setDob(String d){
        this.name = d;
    }
    public void setID(String i){
        this.name = i;
    }
    
    // Accessor Methods
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getDob(){
        return this.dob;
    }
    public int getID(){
        return this.id;
    }
    public ArrayList getModules(){
        return this.assignedModules;
    }
    public CourseProgramme getCourseProgramme(){
        return this.registeredCourse;
    }
    
    // Implement JUnit test to test this method
    // Method creates the username and also acts as an accessor method.
    public String getUsername(){
        System.out.println("Username : " + this.name + this.age);
        return this.name + this.age;
    }
    
    public void addModule(Module m){
        this.assignedModules.add(m);
    }
    public void addCourseProgramme(CourseProgramme c){
        this.registeredCourse = c;
    }
    
    public void printInfo(){
        System.out.println("Course Programme : " + this.registeredCourse.getCourseName());
        System.out.println("Assigned Modules: ");
        for (Module mod : assignedModules){
            System.out.println(mod.getModuleName());
        }
    }
}
