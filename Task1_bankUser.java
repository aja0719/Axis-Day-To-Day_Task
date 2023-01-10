package Day10;

import java.util.Scanner;

public class Task1_bankUser extends Bank{
    String userName;
    int userPhn;
    int userAge;
    int loanAmt;
    static int count=0;

    boolean LoanApproval=true;

    static Scanner sc = new Scanner(System.in);

    Task1_bankUser [] array;

    public void userData(){

    Task1_bankUser user1 = new Task1_bankUser();
     if(count<array.length){

    System.out.println("Enter consumer name :");
    user1.userName=sc.next();
    System.out.println("Enter consumer age :");
    user1.userAge=sc.nextInt();
    System.out.println("Enter consumer phone numb: ");
    user1.userPhn=sc.nextInt();
    System.out.println("Enter req loan amount : ");
    user1.loanAmt=sc.nextInt();

    checkLoan();

    array[count]=user1;
    count++;
    }
    else
    {
        System.out.println("Cannot store more : Array is Full");
    } 
}

    public void displayDetails(){

        for(int i=0; i<array.length;i++){

            System.out.println("Consumer name : " + array[i].userName);
            System.out.println("Consumer age : " + array[i].userAge);
            System.out.println("Consumer phone num : " +array[i].userPhn);
            System.out.println("Consumer loan requirement : " + array[i].loanAmt);
            System.out.println(" Bank Name " +array[i].bankName);
            System.out.println(" ID  : " + array[i].bankID);
        
            System.out.println("");

            // System.out.println("Loan providerbank name: "+array[i].bankName);
            // System.out.println(" loan provider ID "+array[i].bankID);
        
        }
    }
    public static void main(String[] args) {
        Task1_bankUser user1 = new Task1_bankUser();

        System.out.println("Enter array size to store User Info : ");
        int n = sc.nextInt();        

        user1.array= new Task1_bankUser[n];
       
        while (true) {
            System.out.println("Choose \n 1:Add \n 2:Display \n 3:Exit");
            int choose = sc.nextInt();
        switch(choose){
        case 1: user1.userData();break;
        case 2: user1.displayDetails();break;
        case 3: System.exit(1);

              }
          }
     }

 }
    