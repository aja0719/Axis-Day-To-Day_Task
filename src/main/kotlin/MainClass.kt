
import College_Task
fun main(){

    var clgObj = College_Task();
    clgObj.clgName="DPCOE"
    clgObj.clgPlace="Pune"

    var brnch = clgObj.branch()
    brnch.branchName="IT"
    brnch.branchId=4060

    var stud = brnch.Student()
    stud.studname="Ajay"
    stud.studPlace="Kharadi"

    clgObj.displayCollege()
    brnch.displaybranch()
    stud.showStuds()

}