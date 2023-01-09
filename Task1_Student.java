import java.util.Scanner;

public class Task1_Student{
    String name;
    int age;
    String place;
    String college;

   int count=0;

   Task1_Student[] array;

   static Scanner sc = new Scanner(System.in); 

       public void addStudents(){      

        Task1_Student std1 = new Task1_Student(); 

        if (count<array.length) { 

        System.out.println("Enter Name: ");
        std1.name=sc.next();
        System.out.println("Enter Age : ");
        std1.age=sc.nextInt();
        System.out.println("Enter Place : ");
        std1.place=sc.next();
        System.out.println("Enter College : ");
        std1.college=sc.next();
        array[count]=std1;    

        count++;
    }else
    {
        System.out.println("Students entry cannot be stor now cuz : Array is full");
    }
}

  public void displayStudents(){
    
    // Task1_Student std1 = new Task1_Student(); 

    for(int i=0; i<array.length; i++){

      System.out.println("Student name : "+ array[i].name);
      System.out.println("Student age : "+array[i].age);
      System.out.println("Student place : "+ array[i].place);
      System.out.println("Student college : "+ array[i].college);
      System.out.println(count);
    }
}
     public static void main(String[] args) {
        Task1_Student std1 = new Task1_Student();
            
        System.out.println("Enter the array size of Students : ");
        int num = sc .nextInt();

         std1.array = new Task1_Student[num];

        // Task1_Student [] array = new Task1_Student[num];

        while(true) 
        {         
            System.out.println("Enter to choose\n 1:Add Student \n 2:Display Student \n 3:Exit");
            int opt = sc.nextInt();
            switch (opt) {
            case 1:std1.addStudents();break;
            case 2:std1.displayStudents();break;
            case 3:System.exit(1);
        }
      
        }

    }
}