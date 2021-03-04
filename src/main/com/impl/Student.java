package com.impl;

import java.util.List;
import java.util.Optional;

public class Student
{
    String name;
    int rollnumber;
    int roomID;


    public Optional<List<String>> subject;
    public Student() {
        this.name="";
        this.rollnumber=0;

    }

    public Student(String name, int rollnumber,int roomID Optional<List<String>> subject) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.subject = subject;
        this.roomID=0;
    }
    public int getRoomID() {
        return roomID;
    }
    public Optional<List<String>> getSubject() {
        return subject;
    }

    public void setSubject(Optional<List<String>> subject) {
        this.subject = subject;
    }



    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollnumber=" + rollnumber +
                ", subject=" + subject +
                '}';
    }






}

