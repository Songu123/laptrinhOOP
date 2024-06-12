package bai08.baitap4;

import java.util.ArrayList;

public class KyBinh implements Cloneable {
    private int maKyBinh;
    private ArrayList<VuKhi> dsvk;

    public KyBinh(int maKyBinh, ArrayList<VuKhi> dsvk) {
        this.maKyBinh = maKyBinh;
        this.dsvk = dsvk;
    }

    public int getMaKyBinh() {
        return maKyBinh;
    }

    public void setMaKyBinh(int maKyBinh) {
        this.maKyBinh = maKyBinh;
    }

    public ArrayList<VuKhi> getDsvk() {
        return dsvk;
    }

    public void setDsvk(ArrayList<VuKhi> dsvk) {
        this.dsvk = dsvk;
    }

    @Override
    public String toString() {
        return "KyBinh{" +
                "maKyBinh=" + maKyBinh +
                ", dsvk=" + dsvk +
                '}';
    }
    public Object clone(){
        ArrayList<VuKhi> dsvk = new ArrayList<>();
        for (VuKhi vk: this.getDsvk()){
            VuKhi newvk = new VuKhi(vk.getTenVuKhi(), vk.getSoLuong());
            dsvk.add(newvk);
        }
        KyBinh kyBinh = new KyBinh(this.getMaKyBinh(), dsvk);
        return kyBinh;
    }
}
