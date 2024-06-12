package bai09.vidu05;

import java.util.ArrayList;
import java.util.List;

public class XeHoi {
    private DongCo loaiDongCo;
    private List<BanhXe> dsBanhXe;

    public XeHoi(DongCo loaiDongCo, List<BanhXe> dsBanhXe) {
        try {
            this.loaiDongCo =(DongCo) loaiDongCo.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        this.dsBanhXe = new ArrayList<>();
    }

    public XeHoi(DongCo loaiDongCo) {
        try {
            this.loaiDongCo = (DongCo) loaiDongCo.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        this.dsBanhXe = new ArrayList<>();
    }

    public void addBanhXe(BanhXe bx){
        try {
            BanhXe tam = (BanhXe) bx.clone();
            this.dsBanhXe.add(tam);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "XeHoi{" +
                "loaiDongCo=" + loaiDongCo +
                ", dsBanhXe=" + dsBanhXe +
                '}';
    }
}
