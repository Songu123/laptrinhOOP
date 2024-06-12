package bai08.baitap4;

import java.util.ArrayList;

public class VuKhi {
    private String tenVuKhi;
    private int soLuong;

    public VuKhi(String tenVuKhi, int soLuong) {
        this.tenVuKhi = tenVuKhi;
        this.soLuong = soLuong;
    }

    public String getTenVuKhi() {
        return tenVuKhi;
    }

    public void setTenVuKhi(String tenVuKhi) {
        this.tenVuKhi = tenVuKhi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "VuKhi{" +
                "tenVuKhi='" + tenVuKhi + '\'' +
                ", soLuong=" + soLuong +
                '}';
    }

}
