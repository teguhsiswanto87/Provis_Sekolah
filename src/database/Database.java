/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import model.GuruModel;

/**
 *
 * @author tsisw
 */
public class Database {

    public final String driver = "com.mysql.jdbc.Driver";
    public final String url = "jdbc:mysql://localhost/db10117065sekolah";
    public final String user = "root";
    public final String pass = "";

    public ArrayList<GuruModel> tampil_semua_GuruModel() {
        ArrayList<GuruModel> list = new ArrayList<GuruModel>();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
//            GuruModel guru = new GuruModel();
            sql = "select * from guru";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(new GuruModel(rs.getString("id_guru"), rs.getString("nama"),
                        rs.getString("email"), rs.getString("tanggal_lahir"),
                        rs.getString("telepon"), rs.getString("status")));
            }
            rs.close();

        }//end TRY
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }//end Catch
        finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                conn.close();
            } catch (Exception e) {
            }
        }//end Finally
        return list;
    }//end Array List

    public void tambah_guru(String id_guru, String nama, String email, String tanggal_lahir, String telepon, String status) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "insert into guru values('" + id_guru + "','" + nama
                    + "','" + email + "','" + tanggal_lahir + "','" + telepon
                    + "','" + status + "')";
            stmt.executeUpdate(sql);

        }//end TRY
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        } finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                conn.close();
            } catch (Exception e) {
            }
        }//end Finally
    }//end Tambah_Mahasiswa

    //Hapus Data
    public void hapus_guru(String id_guru) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "delete from guru WHERE id_guru='" + id_guru + "'";
            stmt.executeUpdate(sql);
        }//endTRY
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }//end Catch
        finally {
            try {
                stmt.close();
            }//endTRY
            catch (Exception e) {
            }
            try {
                conn.close();
            }//endTRY
            catch (Exception e) {
            }
        }//endFinally
    }//end HAPUS Mahasiswa

    public void perbarui_guru(String id_guru, String nama, String email, String tanggal_lahir, String telepon, String status) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "UPDATE guru SET nama= '" + nama + "', "
                    + "email = '" + email + "',"
                    + "tanggal_lahir = '" + tanggal_lahir + "',"
                    + "telepon = '" + telepon + "',"
                    + "status = '" + status + "' where id_guru = '" + id_guru + "'  ";

            stmt.executeUpdate(sql);
        }//endTRY
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }//end Catch
        finally {
            try {
                stmt.close();
            }//endTRY
            catch (Exception e) {
            }
            try {
                conn.close();
            }//endTRY
            catch (Exception e) {
            }
        }//endFinally
    }//end UPDATE

    public GuruModel pilih_guru(String id_guru) {
        GuruModel guru = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM guru WHERE id_guru ='" + id_guru + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                guru = new GuruModel(rs.getString("id_guru"), rs.getString("nama"),
                        rs.getString("email"), rs.getString("tanggal_lahir"),
                        rs.getString("telepon"), rs.getString("status"));
            } else {
                guru = null;
                rs.close();
            }
        }//endTRY
        catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }//end CATCH 
        finally {
            try {
                stmt.close();
            }//endTRY
            catch (Exception e) {
            }
            try {
                conn.close();
            }//endTRY
            catch (Exception e) {
            }
        }//end FINALLY
        return guru;
    }//end PILIH

    public ArrayList<GuruModel> cari_nama_guru(String kataKunci) {
        ArrayList<GuruModel> listGuru = new ArrayList<GuruModel>();
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            String sql;
            sql = "select * from guru where nama like '%" + kataKunci + "%'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                listGuru.add(new GuruModel(rs.getString("id_guru"), rs.getString("nama"),
                        rs.getString("email"), rs.getString("tanggal_lahir"),
                        rs.getString("telepon"), rs.getString("status")));
            }
            rs.close();
        }//end TRY
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }//end Catch
        finally {
            try {
                stmt.close();
            } catch (Exception e) {
            }
            try {
                conn.close();
            } catch (Exception e) {
            }
        }//end Finally
        return listGuru;
    }//end Array List

}
