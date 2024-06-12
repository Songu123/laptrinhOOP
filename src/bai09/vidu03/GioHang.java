package bai09.vidu03;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private List<SanPham> dssp;

    public GioHang() {
        this.dssp = new ArrayList<>();
    }
    public void addSanPham(SanPham sp){
        this.dssp.add(sp);
    }
}
