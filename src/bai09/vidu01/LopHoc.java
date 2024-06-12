package bai09.vidu01;

import java.util.ArrayList;
import java.util.List;

public class LopHoc {
    private String tenLop;
    private List<SinhVien> dssv;

    public LopHoc(String tenLop) {
        this.setTenLop(tenLop);
        this.dssv = new ArrayList<>();
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void addSinhVien(SinhVien sv){
        this.dssv.add(sv);
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "tenLop='" + tenLop + '\'' +
                ", dssv=" + dssv +
                '}';
    }
}
