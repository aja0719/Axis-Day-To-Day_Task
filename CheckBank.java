
 class CheckBank {
    private static CheckBank singleobj = new CheckBank();   // Single tone object declaration

  private CheckBank(){}  // Constructor 

  public void bankStatus(int time) {
    if(time>9 && time<6){
        System.out.println("Bank id Open");
    }
    else
    {
        System.out.println("Bank is Closed now ");
    } 
   }    
 public static CheckBank getObject() {
    return singleobj;
   }
}

