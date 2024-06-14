package bai10.model3;

public class HinhVuong extends HinhHoc{
    private double canh;
    @Override
    public double tinhDienTich() {
        return this.canh*this.canh;
    }

    public HinhVuong(double canh) {
       setCanh(canh);
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                " , Dien tich = "+tinhDienTich()+"} ";
    }

}
