public class Task2_dept extends Task2_College {
    String deptName;
    int deptStaff;
    int deptId;

    public Task2_dept(String clgName, String place, int clgId,String deptName,int deptStaff, int deptId) {
        super(clgName, place, clgId);
        //TODO Auto-generated constructor stub
        this.deptName=deptName;
        this.deptId=deptId;
        this.deptStaff=deptStaff;
    }

    void displayDeptInfo(){
        
        System.out.println("College Name : "+this.clgName);
        System.out.println("College Name : "+this.clgId);
        System.out.println("College place : "+this.place);
        System.out.println("Department name : "+this.deptName);
        System.out.println("Department Id : "+this.deptId);
        System.out.println("Department name : "+this.deptStaff);
        
 }
}
