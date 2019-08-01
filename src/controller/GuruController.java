package controller;

//mengkomunikasikan view dan model 
import javax.swing.JOptionPane;
import model.GuruModel;
import view.GuruTambahView;
import view.GuruEditView;

public class GuruController {

    //panggil juga modelnya
    private GuruModel model;

    //buat set dari si Guru
    public void setModel(GuruModel model) {
        this.model = model;
    }
    /*ketika user menekan tombol simpan dia langsung mengakses ke method ini 
     method tambah | di sini kita bisa langsung menginputkan apa saja dilakukan
     lakukan validasi sebelum sebelum akhirnya method tambah yg di dalam model
     guru ini dieksekusi
     */

    public void resetForm(GuruTambahView view) {
        model.resetForm();
    }

    public void tambahGuru(GuruTambahView view) {
        String id_guru = view.getTf_guruTambah_idGuru().getText();
        String nama = view.getTf_guruTambah_nama().getText();
        String email = view.getTf_guruTambah_email().getText();
        String tanggal_lahir = view.getTf_guruTambah_lahir().getText();
        String telepon = view.getTf_guruTambah_telepon().getText();
        String status = (String) view.getCb_guruTambah_status().getSelectedItem();

        if (id_guru.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "ID Guru tidak boleh kosong");
        } else if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email tidak boleh kosong");
        } else if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (tanggal_lahir.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Tanggal Lahir tidak boleh kosong");
        } else if (telepon.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Telepon tidak boleh kosong");
        } else if (status.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Status tidak boleh kosong");
        } else {
            //kalau tidak ada error maka simpan(tambah) langsung ke model
            model.tambahGuru(id_guru, nama, email, tanggal_lahir, telepon, status);
        }

    }

    public void perbaruiGuru(GuruEditView view) {
        String id_guru = view.getTf_guruEdit_idGuru().getText();
        String nama = view.getTf_guruEdit_nama().getText();
        String email = view.getTf_guruEdit_email().getText();
        String tanggal_lahir = view.getTf_guruEdit_tanggalLahir().getText();
        String telepon = view.getTf_guruEdit_telepon().getText();
        String status = (String) view.getCb_guruEdit_status().getSelectedItem();

        if (id_guru.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "ID Guru tidak boleh kosong");
        } else if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email tidak boleh kosong");
        } else if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        } else if (tanggal_lahir.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Tanggal Lahir tidak boleh kosong");
        } else if (telepon.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Telepon tidak boleh kosong");
        } else if (status.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Status tidak boleh kosong");
        } else {
            //kalau tidak ada error maka simpan(tambah) langsung ke model
            model.perbaruiGuru(id_guru, nama, email, tanggal_lahir, telepon, status);
        }

    }

}
