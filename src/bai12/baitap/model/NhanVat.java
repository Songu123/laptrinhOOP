package bai12.baitap.model;

import java.util.ArrayList;
import java.util.List;

public class NhanVat implements Dichuyen{
    private String ten;
    private int sucManh;
    private int mau;
    private List<VuKhi> listVuKhi;

    public NhanVat(String ten, int sucManh, int mau) {
        this.ten = ten;
        this.sucManh = sucManh;
        this.mau = mau;
        this.listVuKhi = new ArrayList<>();
    }

    public void addVuKhi(VuKhi vk){
        try {
            this.addVuKhi((VuKhi) vk.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSucManh() {
        return sucManh;
    }

    public void setSucManh(int sucManh) {
        this.sucManh = sucManh;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public List<VuKhi> getListVuKhi() {
        return listVuKhi;
    }

    public void setListVuKhi(List<VuKhi> listVuKhi) {
        for (VuKhi vk: listVuKhi){
            this.listVuKhi.add(vk);
        }
    }


    @Override
    public String toString() {
        return "NhanVat{" +
                "ten='" + ten + '\'' +
                ", sucManh=" + sucManh +
                ", mau=" + mau +
                ", listVuKhi=" + listVuKhi +
                '}';
    }
}
