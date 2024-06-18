package bai11.baitap07.model;

import java.util.ArrayList;

public class HoaDon implements Cloneable{
    private int soHoaDon;
    private SinhVien sinhVien;
    private ArrayList<SanPham> dssp;

    public HoaDon(int soHoaDon, SinhVien sinhVien) {
        this.setSoHoaDon(soHoaDon);
        try {
            this.sinhVien = (SinhVien) sinhVien.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        this.dssp = new ArrayList<SanPham>();
    }

    public void addSanPham(SanPham sp){
        SanPham tam = null;
        try {
            tam = (SanPham) sp.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        this.dssp.add(tam);
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
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
                "soHoaDon=" + soHoaDon +
                ", dssp=" + dssp +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
