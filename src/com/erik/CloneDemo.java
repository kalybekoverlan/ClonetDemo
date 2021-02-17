package com.erik;

public class CloneDemo {

    public static void main(String[] args) {
        Person pr1=new Person("Erik",24);
        Person pr2= (Person) pr1.clone();
        System.out.println(pr1);
        System.out.println(pr2);
        pr1.setName("Eriknew");
        pr1.setAge(23);
        System.out.println(pr1);
        System.out.println(pr2);
    }
}
