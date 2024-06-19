package bai11.baitapluyentap.model;

import java.util.ArrayList;
import java.util.List;

public class XeHoi extends SanPham{
    private DongCo dongCo;
    private List<BanhXe> dsbx;

    public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa, DongCo dongCo){
        this.setMaSanPham(maSanPham);
        this.setTenSanPham(tenSanPham);
        this.setSoLuong(soLuong);
        this.setGiaCa(giaCa);
        try {
            this.dongCo = (DongCo) dongCo.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        this.dsbx = new ArrayList<>();
    }

    public void addBanhXe(BanhXe bx){
        try {
            BanhXe tam = (BanhXe) bx.clone();
            this.dsbx.add(tam);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public DongCo getDongCo() {
        return dongCo;
    }

    public void setDongCo(DongCo dongCo) {
        try {
            this.dongCo = (DongCo) dongCo.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "XeHoi1{" +
                "dongCo=" + dongCo +
                ", dsbx=" + dsbx +
                "} " + super.toString();
    }
}
