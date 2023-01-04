import java.util.Scanner;

public class UserInfo_Task1{
    String name;
    private int UserId ;
    String companyName;
    String place;
    protected  int age;
    private String designation;

    public void CreateUser () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of User : \n");
        System.out.println("Enter name : ");
        name=sc.nextLine();
        System.out.println("Enter user Id : ");
        UserId=sc.nextInt();
        System.out.println("Enter company name : ");
        companyName = sc.next();
        System.out.println("Enter place");
        place= sc.next();
        System.out.println("Enter age : ");
        age= sc.nextInt();
        System.out.println("Enter ur designation: ");
        designation= sc.next();
        
    }

       void displayinfo(){

        System.out.println("\n User information as given\n");

        System.out.println("User name  : "+ name);
        System.out.println("User ID  : "+UserId);
        System.out.println("Company Name : "+companyName);
        System.out.println("Place : "+place);
        System.out.println("Age of user : "+age);
        System.out.println("designation is : "+designation);
        System.out.println();
    }
    public static void main(String[] args) {
        UserInfo_Task1 U1 = new UserInfo_Task1();

        // U1.name="Ajay";
        // U1.UserId=1234;
        // U1.companyName="AxisFintech";
        // U1.place="Pune";
        // U1.age=23;
        // U1.designation="DM (IT)";

        U1.CreateUser();
        U1.displayinfo();

    }
}