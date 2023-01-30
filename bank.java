class bank {
    public static void main(String[] args) {
        CheckBank obj = CheckBank.getObject();  // To return singleton object method we need to access this object by a class in which we declared a singleton obj
        obj.bankStatus(10); 
    }
    
}
    