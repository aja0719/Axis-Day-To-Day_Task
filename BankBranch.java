
import java.util.Scanner;

public class BankBranch extends bankParent {

    String branchName;
    int brachID;
    private double branchTotalFund;
    static double branchIntr;

    public BankBranch(String branchName,int brachID,double branchTotalFund,double branchIntr, double bankTotalFund ,double bankIntr){
        super(branchName, brachID, bankTotalFund ,bankIntr);
        // super.bankName=bankName;
        // super.bankID=bankID;
        this.branchName=branchName;
        this.brachID = brachID;
        this.branchTotalFund= branchTotalFund;
        this.branchIntr= branchIntr;
        
    }
    public double TotalInterest( double TotalInterest, double bankIntr, double branchIntr){
          return branchIntr+bankIntr; 
    }
   
  public static void main(String[] args) {
    BankBranch branch1 = new BankBranch("AxisPune",1234,100000,3.5,50000000,4.5);
    
    Scanner sc = new Scanner(System.in);
    System.err.println("Enter Loan Amount : ");
    int loanAmt = sc.nextInt();
    branch1.checkLoan(loanAmt,branch1.branchIntr);
          
  }

}
