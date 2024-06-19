package bai11.baitapluyentap.model;

import java.util.ArrayList;

public class LopHoc {
    private String tenLop;
    private ArrayList<SinhVien> dssv;

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.dssv = new ArrayList<SinhVien>();
    }

    public void addSinhVien(SinhVien sv){
        this.dssv.add(sv);
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        for (SinhVien item: dssv){
            this.dssv.add(item);
        }
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "tenLop='" + tenLop + '\'' +
                ", dssv=" + dssv +
                '}';
    }
}
