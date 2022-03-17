/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class SV {
    private String maSV ;
    private String hodemSv ;
    private String tenSv ;
    private String sdt ;
    private String email ;

    public SV(String maSV, String hodemSv, String tenSv, String sdt, String email) {
        this.maSV = maSV;
        this.hodemSv = hodemSv;
        this.tenSv = tenSv;
        this.sdt = sdt;
        this.email = email;
    }
    public void addSV () throws SQLException,ClassNotFoundException{
        String sql ="INSERT INTO tblsv (MASV,HODEM,TENSV,TELSV,EMAILSV)";
        sql += "VALUES('"+maSV+"','"+hodemSv+"','"+tenSv+"','"+sdt+"','"+email+"')";
//        System.out.println(sql);
        Connection conn =null;
        Statement state =null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            if(conn==null)conn.close();
            conn=DriverManager.getConnection("jdbc:sqlserver://localhost;user=sa;password=123456;databaseName=My_web","sa","123456");
            state =conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            state.executeUpdate(sql);
            state.close();
            System.out.println(sql);
            conn.close();
            
        } catch (SQLException e) {
            System.err.println("Loi k connect");
            e.printStackTrace();
            conn.close();
        }
          
    }
           
}
