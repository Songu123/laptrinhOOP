package bai11.model;

public class SinhVien {
    private String ten;
    private double diemTB;
    private int tuoi;

    public SinhVien(String ten, double diemTB, int tuoi) {
        this.ten = ten;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
                "ten='" + ten + '\'' +
                ", diemTB=" + diemTB +
                ", tuoi=" + tuoi +
                '}';
    }


}
