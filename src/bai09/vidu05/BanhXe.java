package bai09.vidu05;

public class BanhXe implements Cloneable {
    private double banKinh;

    public BanhXe(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "BanhXe{" +
                "banKinh=" + banKinh +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
