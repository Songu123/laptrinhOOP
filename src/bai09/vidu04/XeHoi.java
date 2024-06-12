package bai09.vidu04;

import java.util.ArrayList;
import java.util.List;

public class XeHoi {
    private DongCo dongCo;
    private List<BanhXe> dsbx;

    public XeHoi(DongCo dongCo, List<BanhXe> dsbx) {
        this.dongCo = dongCo;
        this.dsbx = dsbx;
    }

    public XeHoi(DongCo dongCo) {
        try {
            this.dongCo = (DongCo) dongCo.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        this.dsbx = new ArrayList<BanhXe>();
    }


    public void addBanhXe(BanhXe bx){
//        try {
//            BanhXe tam = (BanhXe) bx.clone();
//            this.dsbx.add(tam);
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
        this.dsbx.add(bx);
    }
    public void addDongCo(DongCo dc){
        try {
            this.dongCo = (DongCo) dc.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "XeHoi{" +
                "dongCo=" + dongCo +
                ", dsbx=" + dsbx +
                '}';
    }
}
