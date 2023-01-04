public class Task3_ConstructorOverloading{
     String userName,companyName,desig,place;
     int userId, age;

     void createUser(String userName,int userId,int age,String place,String companyName,String desig){
            this.userName = userName;
            this.userId = userId;
            this.age = age;
            this.place = place;
            this.companyName= companyName;
            this.desig = desig;
        }
        void displayInfo(){
            System.out.println("*** User Details ***");
            System.out.println("User name : "+userName);
            System.out.println("User ID : "+userId);
            System.out.println("Age : "+age);
            System.out.println("Place : "+place);
            System.out.println("designation : "+desig);
            System.out.println();
        }
    public static void main(String[] args) {

        Task3_ConstructorOverloading obj1 = new Task3_ConstructorOverloading();
        
       obj1.createUser("Ajay",1234,23,"Pune","AxisFintech","Dm(IT)");
        obj1.displayInfo();

        
    }
}