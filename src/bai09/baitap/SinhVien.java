package bai09.baitap;

import java.util.ArrayList;

public class SinhVien implements Cloneable {
    private String hoTen;
    private LopHoc lopHoc;
    private ArrayList<HoaDon> dshd;

    public SinhVien(String hoTen, LopHoc lopHoc) {
        this.hoTen = hoTen;
        try {
            this.lopHoc = (LopHoc) lopHoc.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        this.dshd = new ArrayList<>();
    }

    public void addHoaDon(HoaDon hd){
        try {
            HoaDon tam = (HoaDon) hd.clone();
            this.dshd.add(tam);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", lopHoc=" + lopHoc +
                ", dshd=" + dshd +
                '}';
    }
}

