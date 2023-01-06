
public class Task2_Students extends Task2_dept{

    String StudName;
    int StudId;
    int Studphno;

    public Task2_Students(String StudName,int StudId ,int Studphno,String clgName,String place, int clgId,String deptName, int deptId,int deptStaff){
    
        super(clgName, place, clgId, deptName,deptStaff,deptId);
        // super(deptName,deptId,deptStaff);
        // this.clgName=clgName;
        // this.clgId=clgId;
        // this.place=place;
        this.StudName=StudName;
        this.StudId=StudId;
        this.Studphno=Studphno;

        this.deptId=deptId;
        this.deptName=deptName;
        // this.deptStaff=deptStaff;

    }
    void dispalyStudAllInfo(){

        System.out.println("Students name : "+this.StudName);
        System.out.println("Students ID : "+this.StudId);
        System.out.println("Students phone no : "+this.Studphno);
        System.out.println("College Name : "+this.clgName);
        System.out.println("College Id : "+this.clgId);
        System.out.println("College place : "+this.place);
        System.out.println("Department name : "+this.deptName);
        System.out.println("Department Id : "+this.deptId);
        // System.out.println("Department name : "+this.deptStaff);
        // System.out.println("College Name : "+clgId);

    }
    public static void main(String[] args) {
        // Task2_Students s1 = new Task2_Students("Ajay", 23, 8849257, "DPCOE", "Pune",6040);

        Task2_Students s1 = new Task2_Students("Ajay", 24, 9766055,"DPCOE","Pune", 6040,"IT", 4060,12);

         s1.dispalyStudAllInfo();
        //  s1.displayCollegeInfo();
        //  s1.displayDeptInfo();
    }
}
