package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Coneccion {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/catastro";
    
    public Coneccion(){
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn!=null){
                System.out.println("Coneccion establecida con "+url);
            }
        }
        catch(Exception e){
            System.out.print("No se logro conectar: " + e);
        }
    }
    
    public Connection getConeccion(){
        return conn;
    }
    
    public void desconectar(){
        conn = null;
    }
}
