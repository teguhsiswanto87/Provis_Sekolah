package controller;

//mengkomunikasikan view dan model 
import javax.swing.JOptionPane;
import model.GuruModel;
import view.GuruTambahView;

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
        } else {
            //kalau tidak ada error maka simpan(tambah) langsung ke model
            model.tambahGuru();
        }

    }
}
