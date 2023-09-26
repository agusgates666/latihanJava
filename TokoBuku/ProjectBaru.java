/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbaru;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author agus
 */
public class ProjectBaru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //   new FormUtama().setVisible(true);
         Connection connection = null;
        try {
            // buat koneksi ke server mysql.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/tokobuku", "root", "");

            // siapkan objek statement untuk query
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;

            // eksekusi query
            resultSet = statement.executeQuery("select * from barang");

            // baca dan tampilkan data dari query
            String kode;
            String nama;
            while (resultSet.next()) { // baca data & geser kursor ke record selanjutnya
                kode = resultSet.getString("kode"); // baca kolom "kode"
                nama = resultSet.getString("nama"); // baca kolom "nama"
                System.out.println("kode : " + kode + " nama : " + nama); // tampilkan data
            }

            // hapus objek dan koneksi
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            // tampilkan pesan error (jika terjadi kesalahan)
            System.out.println(exception);
        }
    }
    }
    

