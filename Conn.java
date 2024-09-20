package employeemanagementsystem;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem2", "root", "WJ28@krhps");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    

