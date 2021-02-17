package com.erik;

public class Person implements Cloneable{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public String toString(){
        return "name: "+name+", age: "+age+", hashcode:"+hashCode();
    }
    //overrided method clone()
    public Object clone(){
        try{
            return super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println("Clone not allowed");
            return this;
        }
    }
    
}
