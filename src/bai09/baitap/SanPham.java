package bai09.baitap;

import java.util.SplittableRandom;

public class SanPham implements Cloneable {
    private int maSanPham;
    private String tenSanPham;

    public SanPham(int maSanPham, String tenSanPham) {
        this.setMaSanPham(maSanPham);
        this.setTenSanPham(tenSanPham);
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSanPham=" + maSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
