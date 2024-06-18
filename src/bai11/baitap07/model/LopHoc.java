package bai11.baitap07.model;

import java.util.ArrayList;

public class LopHoc {
    private String tenLop;
    private ArrayList<SinhVien> dssv;

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.dssv = new ArrayList<SinhVien>();
    }

    public void addSinhVien(SinhVien sv){
        SinhVien tam = null;
        try {
            tam = (SinhVien) sv.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        this.dssv.add(tam);
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "tenLop='" + tenLop + '\'' +
                ", dssv=" + dssv +
                '}';
    }
}
