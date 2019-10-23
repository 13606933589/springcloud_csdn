package com.yusys.bbs;

import java.sql.*;

/**
 * 2019/10/23.
 */
public class JavaTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con = null;
        boolean flag;
        try {

            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bbs?serverTimezone=UTC","root", "root");
            String sql = "select '1' from dual";
            Statement ps = con.createStatement();
            flag = ps.execute(sql);
            System.out.println(flag);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
