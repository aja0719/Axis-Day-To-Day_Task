package Day10;

public class Bank {

    public String bankName="Axis";
    public int bankID=1234;
    public double bankloanLimit=40000.0;
    public double bankIntr=7.5;
    public boolean LoanApproval=true;

    public void checkLoan(double bankloanLimit,int loanAmt){
        // Task1_bankUser user1 = new Task1_bankUser();
        
        if(loanAmt<bankloanLimit){
            LoanApproval=true;
            System.out.println("Loan can be approved");
            // TotalInterest(branchIntr);
        }else
        {
            LoanApproval=false;

            System.out.println("Loan cannot be approved");
        }
    }  
    // void TotalInterest(){
    //     System.out.println("You are avail for a loan on Interest of : "+(this.bankIntr)+"%");
    //     }
    
}

