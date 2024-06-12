package bai09.vidu02;

import java.util.ArrayList;

public class HoaDon {
    private int soHoaDon;
    private ArrayList<SanPham> dssp;

    public HoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
        this.dssp = new ArrayList<SanPham>();
    }
    public void addHoaDon(SanPham sp){

        try {
            SanPham tam = (SanPham) sp.clone();
            this.dssp.add(tam);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "soHoaDon=" + soHoaDon +
                ", dssp=" + dssp +
                '}';
    }
}
