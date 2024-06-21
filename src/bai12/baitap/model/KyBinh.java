package bai12.baitap.model;

import java.util.ArrayList;
import java.util.List;

public class KyBinh extends NhanVat {
    private int capDo;
    private int kinhNghiem;
    private List<BinhDoan> listBinhDoan;

    public KyBinh(String ten, int sucManh, int mau, int capDo, int kinhNghiem) {
        super(ten, sucManh, mau);
        this.capDo = capDo;
        this.kinhNghiem = kinhNghiem;
        this.listBinhDoan = new ArrayList<>();
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

    public List<BinhDoan> getListBinhDoan() {
        return listBinhDoan;
    }

    public void setListBinhDoan(List<BinhDoan> listBinhDoan) {
        this.listBinhDoan = listBinhDoan;
    }

    @Override
    public String toString() {
        return "KyBinh{" +
                "capDo=" + capDo +
                ", kinhNghiem=" + kinhNghiem +
                ", listBinhDoan=" + listBinhDoan +
                "} " + super.toString();
    }
}
