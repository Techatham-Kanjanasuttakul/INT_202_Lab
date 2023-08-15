package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProblemOne {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>(125, 0.75f);
        students.add(new Student(10001, "Somsir", 3.25));
        students.add(new Student(10002 ,"Sonsak"  ,3.0));
        students.add(new Student(10009, "Somchai", 3.26));
        students.add(new Student(10007, "Somsiri", 3.25));
        students.add(new Student(100037, "Sirisopa", 3.25));


        for (Student s : students){
            System.out.println(s + "->"+ s.hashCode());
        }

//        เรียงตามไอดี
        Set<Student> students1 = new TreeSet<>();
        students1.add(new Student(10001, "Somsir", 3.25));
        students1.add(new Student(10002 ,"Sonsak"  ,3.0));
        students1.add(new Student(10009, "Somchai", 3.26));
        students1.add(new Student(10007, "Somsiri", 3.25));
        students1.add(new Student(100037, "Sirisopa", 3.25));

        System.out.println("--------------------");

        for(Student s :students1){
            System.out.println(s);
        }

        List<Student> tmpList = students.stream().sorted(Student.SORT_BY_GPAX_DESC).toList();
        System.out.println("------------------");
        for(Student s : tmpList){
            System.out.println(s+"->"+s.hashCode());
        }
    }
}
