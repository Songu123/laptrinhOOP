package bai09.baitap;

import java.util.ArrayList;

public class HoaDon implements Cloneable {
    private int soHoaDon;
    private ArrayList<SanPham> dssp;

    public HoaDon(int soHoaDon, ArrayList<SanPham> dssp) {
        this.soHoaDon = soHoaDon;
        this.dssp = new ArrayList<>();
    }

    public HoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
        this.dssp = new ArrayList<>();
    }

    public void addSanPham(SanPham sp){
        try {
            SanPham tam = (SanPham) sp.clone();
            this.dssp.add(tam);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "soHoaDon=" + soHoaDon +
                ", dssp=" + dssp +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
