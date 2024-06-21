package bai12.model;

public abstract class HinhHoc implements Cloneable {
    private double chuVi;
    private double dienTich;

    public abstract double tinhDienTich();
    public abstract double tinhChuVi();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "HinhHoc{" +
                "chuVi=" + tinhChuVi() +
                ", dienTich=" + tinhDienTich() +
                '}';
    }
}
