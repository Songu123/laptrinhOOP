package bai12.baitap.model;

import java.util.List;

public class PhuThuy extends NhanVat{
    private String phepThuat;

    public PhuThuy(String ten, int sucManh, int mau, String phepThuat) {
        super(ten, sucManh, mau);
        this.phepThuat = phepThuat;
    }

    public String getPhepThuat() {
        return phepThuat;
    }

    public void setPhepThuat(String phepThuat) {
        this.phepThuat = phepThuat;
    }

    @Override
    public String toString() {
        return "PhuThuy{" +
                "phepThuat='" + phepThuat + '\'' +
                "} " + super.toString();
    }
}
