package com.impl;
import com.impl.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Classroom {

    int roomID;
    public Optional<List<Student>> studentlist;
     public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public Optional<List<Student>> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(Optional<List<Student>> studentlist) {
        this.studentlist = studentlist;
    }



    @Override
    public String toString() {
        return "Classroom{" +
                "roomID='" + roomID + '\'' +
                ", studentlist=" + studentlist +
                '}';
        public boolean hasStudent()
        {
            long count = studentlist.get().stream()
                    .filter(student -> student.subject.get().size()==0)
                    .count();
            return count==0 ? true : false;
        }



        public void studentsWithparticulartRoomId(int id)
        {
            studentlist.stream()
                    .filter(l -> l.getRoomID().equals(Integer.toString("xyz"))
                    .forEach(student -> System.out.println("Student Name: "+student));

        }

        public void studentsWithNoSubjects()
        {
            studentlist.get().stream()
                    .filter(student -> student.subject.get().size()==0)
                    .forEach(student -> System.out.println("Students with no subjects"+student));
        }
    }











}

