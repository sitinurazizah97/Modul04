package helper;

import model.Matakuliah;

import java.sql.*;
import java.util.ArrayList;

public class MyConnection {
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/";
    private static String DB_NAME = "db_pekerjaan_rumah";
    private static String TIMEZONE = "?serverTimezone=Asia/Makassar";
    private static String USER = "root";
    private static String PASS = "";

    public Connection getConnection(){
        Connection con = null;

        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Sedang menghubungkan...");
            con = DriverManager.getConnection(URL+DB_NAME+TIMEZONE,USER,PASS);
            System.out.println("Berhasil");
            return con;
        } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Matakuliah matakuliah;
        ArrayList<Matakuliah> matakuliahList = new ArrayList<>();
        MyConnection myConnection = new MyConnection();
        Connection con = myConnection.getConnection();

        String selectQuery = "Select * FROM matakuliah ";
        Statement statement;
        ResultSet resultSet;

        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()){
                matakuliah = new Matakuliah(

                )
            }

        }
    }
}

