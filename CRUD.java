package crud;
import java.sql.*;
 import javax.sql.*;
 import java.util.*;
public class CRUD 
{
public static void main(String[]args)
Connection cn;
Statement st; 
ResultSet rs;
 try 
{
Class.forName("com.mysql.jdbc.Driver");
cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anurag", "root", "12345678");
st = cn.createStatement();
System.out.println("Welcome To Anurag Engineering College");
System.out.println("------MENU------");
System.out.println("1.Insert");
System.out.println("2.EDIT");
System.out.println("3.Delete");
System.out.println("4.Display");

System.out.println("5.Exit"); System.out.println("----------------"); String opt = "";

String htno = "", sname = "", mobile = "", sql = ""; Scanner sc = new Scanner(System.in);

while (opt != "5")
 {
 	System.out.println("Enter Your Option");
	optsc.next();
	switch (opt)
 	{
	case "1":
	 {
	 System.out.println("Enter Htno");
	 htno = sc.next(); 
	System.out.println("Enter Name");
	 sname = sc.next();
	System.out.println("Enter Mobile"); 
	mobile = sc.next();
	sql = "insert into stu values(" + "'" + htno + "'" + "," + "'" + sname + "'" + "," + "'" + 	mobile + "'" + ")";

	if (st.executeUpdate(sql) > 0)
	 {
	 System.out.println("Record Inserted");

	}
             		}

	break; 
	case "2":
	 {

System.out.println("Enter Htno to Update"); htno = sc.next();

System.out.println("Enter Name"); sname = sc.next(); System.out.println("Enter Mobile"); mobile = sc.next();

sql = "update stu set sname=" + "'" + sname + "'" + "," + "mobile=" + "'" + mobile + "'" "         		where htno='" + htno + "'";

if (st.executeUpdate(sql) > 0)
 { 
System.out.println("Record Updated");

} 
else 
{

System.out.println("Operation Failed");

}
   }
break;
case "3": 
{

System.out.println("Enter Htno to delete"); htno = sc.next();

sql = "delete from stu where Htno=" + "'" + htno + "'"; if (st.executeUpdate(sql) > 0)
 {

System.out.println("Record deleted"); } 
else
 {

System.out.println("Operation Failed");
	}
}

break;
 case "4": 
{

sql = "select * from stu"; 
rs = st.executeQuery(sql);

System.out.println("Htno\tSname\tMobile"); while (rs.next())
 {
System.out.println(rs.getString("Htno") + "\t" + rs.getString("SName") + "\t" + rs.getString("mobile"));

}
rs.close();
                      }
break;
case "5": 
{
 opt = "5";
System.out.println("Thank You"); st.close();
cn.close();

}

break; default: 
{

System.out.println("Choose Option between 1 and 5 only");
}
}

}
} 
catch (Exception ex) { System.out.println(ex.getMessage()); 

}
}
}
