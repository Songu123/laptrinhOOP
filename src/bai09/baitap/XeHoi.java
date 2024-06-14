package bai09.baitap;

import java.util.ArrayList;
import java.util.List;

public class XeHoi extends SanPham{
    private DongCo dongCo;
    private List<BanhXe> dsbx;

    public XeHoi(int maSanPham, String tenSanPham, DongCo dongCo, List<BanhXe> dsbx) {
        super(maSanPham, tenSanPham);
        try {
            this.dongCo = (DongCo) dongCo.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        this.dsbx = new ArrayList<>();
    }

    public XeHoi(int maSanPham, String tenSanPham, DongCo dongCo) {
        super(maSanPham, tenSanPham);
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


    @Override
    public String toString() {
        return "XeHoi{" +
                "dongCo=" + dongCo +
                ", dsbx=" + dsbx +
                "} " + super.toString();
    }
}
