/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pengelolaan_krs;

/**
 *
 * @author IRFAN HIDAYAT
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Config {
    private static Connection mysqlconfig;

    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/krs";
            String user = "root";
            String pass = "";

            // Mendaftarkan driver MySQL
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                // Tangani pengecualian (untuk versi sebelum 8.0)
                e.printStackTrace();
            }

            // Membuat koneksi
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            return mysqlconfig;
        } catch (SQLException e) {
            // Tangani SQLException
            throw new SQLException("Koneksi gagal: " + e.getMessage(), e);
        }
    }

    public static void closeConnection() {
        try {
            if (mysqlconfig != null && !mysqlconfig.isClosed()) {
                mysqlconfig.close();
            }
        } catch (SQLException e) {
            System.err.println("Gagal menutup koneksi: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Connection connection = configDB();
            System.out.println("Koneksi database berhasil!");
            // Lakukan operasi lain dengan koneksi jika diperlukan
            closeConnection();
        } catch (SQLException e) {
            System.err.println("Error saat terhubung ke database: " + e.getMessage());
        }
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


