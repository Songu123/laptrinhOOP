package bai6.vidu1;

public class HinhTron implements HinhHoc{
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return this.banKinh*2*Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*Math.pow(this.banKinh, 2);
    }
}
