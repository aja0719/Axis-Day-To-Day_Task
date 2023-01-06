import java.util.Scanner;

public class Shops implements RetailCompany {
    
    float priceCosme=600;
    float pricePerfume=700;
    float priceClothes=500;

    float taxCosmetics=0.03f;
    float taxPerfume=0.07f;
    float taxClothes=0.04f;

    float costCosmetics;
    float costPerfumes;
    float costClothes;

    float sumCost;
    float Discountprice;

    float discount=0.02f;    
    
    @Override
    public void getTotalCost() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter required num of Cosmetics : ");
        int reqCos=sc.nextInt();
        System.out.println("Enter required num of Perfume : ");
        int reqPerf=sc.nextInt();
        System.out.println("Enter required num of Clothes : ");
        int reqClo=sc.nextInt();
        sc.close();

        costCosmetics = reqCos*(priceCosme+taxCosmetics);
        System.out.println("Cosmetics total price: " + costCosmetics);

         costPerfumes = reqPerf*(pricePerfume+taxPerfume);
        System.out.println("Perfumes total price: " + costPerfumes);

         costClothes = reqClo*(priceClothes+taxClothes);
        System.out.println("Clothes total price: " + costClothes);
        
    }

    @Override
    public void getTotalExtendedCost() {
        // TODO Auto-generated method stub
         sumCost = (costCosmetics+costPerfumes+costClothes);
         System.out.println("Sum of all the items without discount : "+sumCost);
  
    } 

    @Override
    public void geTotalDiscount() {
        // TODO Auto-generated method stub
         Discountprice=(sumCost-(sumCost*discount));
         System.out.println("Discounted price : "+Discountprice);
        
    }
   public void show(){
        getTotalCost();
        getTotalExtendedCost();
        geTotalDiscount();
    }
    public static void main(String[] args) {
        Shops user1 = new Shops();
        user1.show();
    }

}