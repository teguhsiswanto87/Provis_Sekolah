/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.Database;
import event.GuruListener;
import javax.swing.JOptionPane;

/**
 *
 * @author tsisw
 */
public class GuruModel {

    private String id_guru;
    private String nama;
    private String email;
    private String tanggal_lahir;
    private String telepon;
    private String status;

    private Database database;
    private GuruListener guruListener;

    //pasang getter setter dari listener yang sudah kita buat
    public GuruListener getGuruListener() {
        return guruListener;
    }

    public void setGuruListener(GuruListener guruListener) {
        this.guruListener = guruListener;
    }

    // getter & setter dari model
    public String getId_guru() {
        return id_guru;
    }

    public void setId_guru(String id_guru) {
        this.id_guru = id_guru;
        fileOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fileOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fileOnChange();
    }

    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
        fileOnChange();
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
        fileOnChange();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
//        fileOnChange();
    }

    //validasi inputan pertama untuk si listenernya (karena listener-nya onChange)
    protected void fileOnChange() {
        if (guruListener != null) {
            guruListener.onChange(this);
        }
    }

    public GuruModel() {
    }

    public GuruModel(String id_guru, String nama, String email, String tanggal_lahir, String telepon, String status) {
        setId_guru(id_guru);
        setNama(nama);
        setEmail(email);
        setTanggal_lahir(tanggal_lahir);
        setTelepon(telepon);
        setStatus(status);
    }

    public void resetForm() {
        setId_guru("");
        setNama("");
        setEmail("");
        setTanggal_lahir("");
        setTelepon("");
        setStatus("");
    }

    public void tambahGuru(String id_guru, String nama, String email, String tanggal_lahir, String telepon, String status) {
        database = new Database();
        database.tambah_guru(id_guru, nama, email, tanggal_lahir, telepon, status);
        JOptionPane.showMessageDialog(null, "Guru BErhasil Ditambahkan");
        resetForm();
    }

    public void perbaruiGuru(String id_guru, String nama, String email, String tanggal_lahir, String telepon, String status) {
        database = new Database();
        database.perbarui_guru(id_guru, nama, email, tanggal_lahir, telepon, status);
        JOptionPane.showMessageDialog(null, "Perbarui Guru Berhasil");
        resetForm();
    }

}
