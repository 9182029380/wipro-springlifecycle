package org.wipro.annot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
    private String name;
    private int age;
    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @PostConstruct
    public void init() {
        System.out.println("Init method called");
    }
    @PreDestroy
    public void destroy()throws Exception {
        System.out.println("Destroy method called");
    }
}
