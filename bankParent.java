
public class bankParent{
    
    String bankName;
    int bankID;
    private double bankTotalFund;
    private double bankIntr;
    double TotalInterest;
    boolean LoanApproval=false;
          
    public bankParent(String bankName, int bankID, double bankTotalFund, double bankIntr) {
        this.bankTotalFund = bankTotalFund;
        this.bankIntr = bankIntr; 
        this.bankName = bankName;
        this.bankID = bankID;
    }
   public void checkLoan(int loanAmt, double branchIntr){
        if(loanAmt<bankTotalFund){
            LoanApproval=true;
            System.out.println("Loan is approved");
            TotalInterest(branchIntr);
        }else
        {
            LoanApproval=false;
            System.out.println("Loan is not approved");
        }
    }      
     void TotalInterest(double branchIntr){
    System.out.println("You are avail for a loan on Interest of : "+(branchIntr+this.bankIntr)+"%");
}
    }
