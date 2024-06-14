package bai10.model3;

public abstract class HinhHoc {
    private double dienTich;
    public abstract double tinhDienTich();

    @Override
    public String toString() {
        return "HinhHoc{" +
                "dienTich=" + dienTich +
                '}';
    }
}
