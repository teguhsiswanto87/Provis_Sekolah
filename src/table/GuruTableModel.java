package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.GuruModel;

public class GuruTableModel extends AbstractTableModel {

    private ArrayList<GuruModel> data;
    private String[] namaField = {"id_guru", "nama", "email", "tanggal_lahir",
        "telepon", "status"};

    public void setData(ArrayList<GuruModel> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return namaField.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        GuruModel guru = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return guru.getId_guru();
            case 1:
                return guru.getNama();
            case 2:
                return guru.getEmail();
            case 3:
                return guru.getTanggal_lahir();
            case 4:
                return guru.getTelepon();
            case 5:
                return guru.getStatus();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return namaField[column];
    }
}
