public class Task2_College {
    String clgName;
    String place;
    int clgId;
    

     public Task2_College(String clgName,String place, int clgId){
        this.clgName=clgName;
        this.clgId=clgId;
        this.place=place;
     }

    public void dispalyClgInfo() {
        System.out.println("College Name : "+this.clgName);
        System.out.println("College Name : "+this.clgId);
        System.out.println("College place : "+this.place);
        
    }
    
}