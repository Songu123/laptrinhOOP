package bai12.model;

public class HinhTron extends HinhHoc{
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*Math.pow(banKinh, 2);
    }

    @Override
    public double tinhChuVi() {
        return 2*Math.PI*banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                "} " + super.toString();
    }
}
