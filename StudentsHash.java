package day11_Collections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class StudentsHash {
     int rollNo;
    String name, clg, place, dept;

    static Scanner sc = new Scanner(System.in);
    
    public class HelperClass extends StudentsHash {
        StudentsHash std1 = new StudentsHash();
     
        HashMap<Integer,StudentsHash>map = new HashMap <Integer,StudentsHash>();

         void addStudent() {
            System.out.println("Enter roll no: ");
            std1.rollNo=sc.nextInt();
            System.out.println("Enter stud name : ");
            std1.name=sc.next();
            System.out.println("Enter college name : ");
            std1.clg=sc.next();
            System.out.println("Enter roll no: ");
            std1.place=sc.next();
            System.out.println("Enter roll no: ");
            std1.dept=sc.next();
            map.put(std1.rollNo, std1);
        }
        
        void searchStudent() {
        System.out.println("Enter students roll no for searching : ");
        int i = sc.nextInt();
        map.get(i);
        for(Entry<Integer, StudentsHash> m:map.entrySet()) {
            if(i==m.getKey()){
            System.out.println("Student name : "+m.getValue().name);
            System.out.println("Student name : "+m.getValue().rollNo);
            System.out.println("Student name : "+m.getValue().clg);
            System.out.println("Student name : "+m.getValue().dept);
            System.out.println("Student name : "+m.getValue().place);
           }  
         }
       }

    //    public void deleteStudent() {
        
    //    }
        
     } 
    public static void main(String[] args) {

        StudentsHash std = new StudentsHash();
    
        while(true){
        System.out.println("Enter the choice on Student DataBase : \n");
        System.out.println("1:To add Student Details \n2:To search studen \n3:To delete student \n4:Exit");
        int choice = sc.nextInt();
            switch (choice) {
                case 1:((HelperClass)std).addStudent();break;
                case 2:((HelperClass)std).searchStudent();break;
                // case 3:((HelperClass) std).deleteStudent();break;
                case 3:System.exit(1);
            }
        }
    }

    }
