class College_Task{
    var clgName=""
    var clgPlace=""
    fun displayCollege(){
        println("College name is $clgName and Place is $clgPlace")
    }
    inner class branch{
        var branchName=""
        var branchId=0
        fun displaybranch(){
            println("branch name is $branchName and Id is $branchId")
        }
        inner class Student {
            var studname=""
            var studPlace=""
            fun showStuds(){
                println("Student name $studname and Place is $studPlace")
            }
        }
    }
}
//fun main(){
//
//
//    var clgObj = College_Task();
//    clgObj.clgName="DPCOE"
//    clgObj.clgPlace="Pune"
//
//    var brnch = clgObj.branch()
//    brnch.branchName="IT"
//    brnch.branchId=4060
//
//    var stud = brnch.Student()
//    stud.studname="Ajay"
//    stud.studPlace="Kharadi"
//
//    clgObj.displayCollege()
//    clgObj.branch().displaybranch()
//    stud.showStuds()
//
//}