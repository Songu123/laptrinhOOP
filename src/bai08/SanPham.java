package bai08;

public class SanPham {
    private String maSP;
    private String name;

    public SanPham(String maSP, String name) {
        this.maSP = maSP;
        this.name = name;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
