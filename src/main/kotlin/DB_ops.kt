import java.io.File
import java.io.FileInputStream
import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement

class DB_ops {
  var conn:Connection?=null
    fun crtConnnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()   // to cross-check jdbc of mysql is present or not
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","IDofAjay@1907")  //setting up path to your databases and url(local host)
            if (conn!=null) {
                println("connection is done in b/w your database and url")
            }
            println("connected successfully!")

        }catch (e:SQLException){    // every catch block is provided to see any exception are occured or not
            println(e)
        }
    }
// To create a table
    fun crtTable(){
        var preStat:PreparedStatement?=null
        var sql = "create table data1(id int auto_increment PRIMARY KEY, name CHAR (255), age int );"

    try {
        preStat=conn!!.prepareStatement(sql);  // check conn is not null , if YES then store sql in prepStat
        var status=preStat.executeUpdate()     // to update execute of preStat in status
        if (status>1){
            println("Table is created successfully!!")
        }
    }catch (e:SQLException){
        println(e)
        }
    }
   // To insert Data into the table
    fun insertdata(){
        var preSt:PreparedStatement?=null

        var sql = "insert into data(name , age ) values (? ,? );"

        try {
            preSt= conn!!.prepareStatement(sql);
            println("Give name to insert")
            preSt.setString(1, readLine())
            println("Give age to insert ")
            preSt.setInt(2, readLine()!!.toInt())
            var status = preSt.executeUpdate()
            if (status==1){
                println("Data is inserted !!")
            }
        }catch (e:SQLException){
            println(e)
        }
    }
//     To search data using id
    fun Searchdata(){
        var state:Statement?=null
        println("Give id to search")
        var id = readLine()!!.toString()
        var sql = "select * from data where id=$id"

       var res:ResultSet?=null

    try {
        state=conn!!.createStatement()
        res=state.executeQuery(sql)

        while (res!!.next()){
            println("${res.getString("name")}")
            println("${res.getString("age")}")
        }
    }catch (e:SQLException){
        println(e)
    }
    }
    // To drop a table using User input table
    fun dropTable(){
        var prestat:PreparedStatement?=null
        println("Give table name to drop")
        var tab= readLine()!!.toString()
        var sql = "drop table $tab"

        try {
            prestat=conn!!.prepareStatement(sql)
            var status=prestat.executeUpdate()

            if (status>1){
                println("Table is dropped!!")
            }
        }catch (e:SQLException){
            println(e)
        }
    }
    fun InsertImage(){
        var preSta:PreparedStatement?=null
        var sql = "insert into data(imagename,image) values (?,?);"

        // Data type of image is BLOB => MEDIUMBLOB, LARGEBLOB (w.r.to sizes)
        try {
            var ImageFile:File=(.png);  // Path of image
            var readImageFile=FileInputStream(ImageFile)
            preSta=conn!!.prepareStatement(sql)
            preSta.setString(1,"data")
            preSta.setBinaryStream(2,readImageFile)
        }

    }
}
fun main() {
    var obj = DB_ops()

    obj.crtConnnection()

    println("Welcome to CRUD Operations : ")

    println("Enter choice to perform an Operation \n " +
            "1. Create Table \n 2. Insert Data \n 3. Search Data using id \n 4. Drop table")

    var num = readLine()!!.toInt()

    loop@ while(true){
        when(num){
//            1 -> obj.crtConnnection()
            1 -> obj.crtTable()
            2 -> obj.insertdata()
            3 -> obj.Searchdata()
            4 -> obj.dropTable()
            5 -> obj.InsertImage()
            6 -> break@loop
            else -> println("Enter valid num")
        }
    }

//    obj.crtTable()
//    obj.insertdata()
//    obj.Searchdata()

}