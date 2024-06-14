package bai10.model3;

public class HinhTron extends HinhHoc{
    private double banKinh;

    public HinhTron(double banKinh) {
        setBanKinh(banKinh);
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*Math.pow(this.banKinh, 2);
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                " , Dien tich = "+tinhDienTich()+"} ";
    }
}
