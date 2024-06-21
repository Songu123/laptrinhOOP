package bai12.baitap.model;

public abstract class VuKhi implements Cloneable {
    private String ten;
    private int soLuong;
    private int satThuong;

    public VuKhi(String ten, int soLuong, int satThuong) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.satThuong = satThuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSatThuong() {
        return satThuong;
    }

    public void setSatThuong(int satThuong) {
        this.satThuong = satThuong;
    }

    @Override
    public String toString() {
        return "VuKhi{" +
                "ten='" + ten + '\'' +
                ", soLuong=" + soLuong +
                ", satThuong=" + satThuong +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
