package bai10.model2;

import java.util.Comparator;

public class SinhVien implements Comparator<SinhVien> {
    private String hoTen;
    private double diemTB;
    private int tuoi;

    public SinhVien(String hoTen, double diemTB, int tuoi) {
        this.hoTen = hoTen;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diemTB=" + diemTB +
                ", tuoi=" + tuoi +
                '}';
    }

    @Override
    public Comparator<SinhVien> reversed() {
        return Comparator.super.reversed();
    }

    public int compare(SinhVien sv1, SinhVien sv2) {
        return Double.compare(sv1.diemTB, sv2.diemTB);
    }

}
