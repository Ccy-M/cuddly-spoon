package JDBXDemo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCQuick {
    public static void main(String[] args) throws Exception {

        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");


        //获取连接对象
        String url = "jdbc:mysql://localhost:3306/Test_stu";

        String user = "root";
            String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);

            //获取执行sql语句对象
        Statement statement = connection.createStatement();

        //编写sql语句 并执行 以及接受返回的结果集
        String sql = "SELECT emp_id,emp_name,emp_salary,emp_age FROM t_emp";
        ResultSet resultSet = statement.executeQuery(sql);
        //处理结果 便利resultSet结果集
        while(resultSet.next()){
            int empId = resultSet.getInt("emp_id");
            String empName = resultSet.getString("emp_name");
            double empSalary = resultSet.getDouble("emp_salary");
            int empAge = resultSet.getInt("emp_age");
            System.out.println(empId+"\t"+empName+"\t"+empSalary+"\t"+empAge);
        }

        //释放资源（先开后关）
        resultSet.close();
        statement.close();
        connection.close();

    }
}
