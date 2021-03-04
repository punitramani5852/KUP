package com.impl;
import java.util.*;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        List<String> ListSubject=new ArrayList<>();
        ListSubject.add("Automata");
        ListSubject.add("Operating System");
        Optional<List<String>> optionalsubjectlist=Optional.of(ListSubject);
        List<Student> student=new ArrayList<>();
        Optional<List<Student>> optionalstudentlist=Optional.of(student);




        Student student1=new Student("punit",15,"xyz"" optionalsubjectlist);
        Student student2=new Student("sazal",45, Optional.ofNullable(Arrays.asList("OS","DBMS")));
        Student student3=new Student("ashwani",22, Optional.ofNullable(Arrays.asList("Software engineering","Java")));
        Student student4=new Student("abhishek",2, Optional.ofNullable(Arrays.asList("Biology")));
        Student student5=new Student("john",29, Optional.ofNullable(Arrays.asList("Automata")));
        Student student6=new Student("jan",29, Optional.ofNullable(Arrays.asList("null")));
        student.add(student1);


        Classroom c1=new Classroom(123,optionalstudentlist);
        c1.hasStudent();
        c1.studentsWithparticulartRoomId(xyz);
        c1.studentsWithNoSubjects();








    }
}
//if subject.isempty
//System.out.println student name and roll no




