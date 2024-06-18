package bai11.baitap07.model;

import java.util.ArrayList;
import java.util.List;

public class SinhVien implements Cloneable {
    private String hoTen;
    private LopHoc lop;
    private List<HoaDon> dshd;

    public SinhVien(String hoTen, LopHoc lop) {
        this.setHoTen(hoTen);
        this.setLop(lop);
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
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", lop=" + lop +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
