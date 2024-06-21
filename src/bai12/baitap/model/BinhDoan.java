package bai12.baitap.model;

import java.util.ArrayList;
import java.util.List;

public class BinhDoan implements Cloneable  {
    private int capDo;
    private int kinhNghiem;
    private List<DoiQuan> listDoiQuan;

    public BinhDoan(int capDo, int kinhNghiem) {
        this.capDo = capDo;
        this.kinhNghiem = kinhNghiem;
        this.listDoiQuan = new ArrayList<>();
    }

    public void addDoiQuan(DoiQuan dq){
        this.listDoiQuan.add(dq);
    }

    public int getCapDo() {
        return capDo;
    }

    public void setCapDo(int capDo) {
        this.capDo = capDo;
    }

    public int getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(int kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public List<DoiQuan> getListDoiQuan() {
        return listDoiQuan;
    }

    public void setListDoiQuan(List<DoiQuan> listDoiQuan) {
        this.listDoiQuan = listDoiQuan;
    }

    @Override
    public String toString() {
        return "BinhDoan{" +
                "capDo=" + capDo +
                ", kinhNghiem=" + kinhNghiem +
                ", listDoiQuan=" + listDoiQuan +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
