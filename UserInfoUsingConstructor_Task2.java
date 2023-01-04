public class UserInfoUsingConstructor_Task2 {
 
    //   Task2 Using Constructor

    String name;
    int UserId ;
    String companyName;
    String place;
    int age;
    String designation;
       
        void createUser(String name, int UserId, String companyName, String place , int age, String designation){
        this.name=name;
        this.UserId=UserId;
        this.companyName=companyName;
        this.place=place;
        this.age=age;
        this.designation=designation;
       }
        
        void displayinfo(){
        System.out.println("Name of user: "+name);
        System.out.println("User Id : "+UserId);
        System.out.println("Name of company : "+companyName);
        System.out.println("Place : "+place);
        System.out.println("Age : "+age);
        System.out.println("designation : "+designation);
        System.out.println();
       }

    public static void main(String[] args) {
        UserInfoUsingConstructor_Task2 obj1 = new UserInfoUsingConstructor_Task2();
        UserInfoUsingConstructor_Task2 obj2 = new UserInfoUsingConstructor_Task2();

        obj1.createUser("Ajay",1234,"axis","Pune",24,"DM");
        obj2.createUser("Mayur",12345,"axisFintech","mumbai",23,"dm(it)");
        obj1.displayinfo();
        obj2.displayinfo();


    }
}
