package bai08;

import java.util.ArrayList;

public class HoaDon {
    private int maHoaDon;
    private ArrayList<SanPham> dssp;

    public HoaDon(int maHoaDon, ArrayList<SanPham> dssp) {
        this.maHoaDon = maHoaDon;
        this.dssp = dssp;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public ArrayList<SanPham> getDssp() {
        return dssp;
    }

    public void setDssp(ArrayList<SanPham> dssp) {
        this.dssp = dssp;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon=" + maHoaDon +
                ", dssp=" + dssp +
                '}';
    }
}
