package bai09.baitap;

import java.util.ArrayList;

public class LopHoc implements Cloneable {
    private String tenLop;
    private ArrayList<SinhVien> dssv;

    public LopHoc(String tenLop, ArrayList<SinhVien> dssv) {
        this.tenLop = tenLop;
        this.dssv = dssv;
    }

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.dssv = new ArrayList<>();
    }

//    public void addSinhVien(SinhVien sv){
//        try {
//            SinhVien tam = (SinhVien) sv.clone();
//            this.dssv.add(tam);
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "tenLop='" + tenLop + '\'' +
                ", dssv=" + dssv +
                '}';
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        LopHoc lopHocClone = (LopHoc) super.clone();
//        lopHocClone.dssv = new ArrayList<>(dssv.size());
//        for (SinhVien sv : dssv) {
//            lopHocClone.dssv.add((SinhVien) sv.clone()); // Deep clone each SinhVien in dssv
//        }
//        return lopHocClone;
//    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
