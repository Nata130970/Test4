package by.si;

public class User {
   private String name;
   private String surName;
   protected String professional;
   protected int age;
   protected int salary;
   private int currentYear = 2022;

    public User(String name,String surName,String professional,int... data){
        this.name=name;
        this.surName=surName;
        this.professional=professional;
        this.age=data[0];
        this.salary=data[1];
}
    public User(){
    }
    protected int year(){
        return currentYear-age;
    }
    public void setName(String newName){
        name=newName;
    }
    public String getName(){
        return name;
    }
    public void setSurName(String newName){
        surName=newName;
    }
    public String getSurName(){
        return surName;
    }
}
