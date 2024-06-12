package bai08.baitap4;

import java.util.ArrayList;

public class RunBaitap {
    public static void main(String[] args) {
        ArrayList<VuKhi> dsvk = new ArrayList<>();
        dsvk.add(new VuKhi("m123",20));
        dsvk.add(new VuKhi("hello",10));
        dsvk.add(new VuKhi("ákdfkla",40));
        dsvk.add(new VuKhi("djfdsf",30));
        KyBinh kyBinh = new KyBinh(123, dsvk);
        System.out.println(kyBinh);
        KyBinh kyBinh2 = (KyBinh) kyBinh.clone();
        kyBinh2.setMaKyBinh(43859);
        kyBinh2.getDsvk().getFirst().setTenVuKhi("Nguyễn Văn Sơn");
        System.out.println(kyBinh2);
        System.out.println(kyBinh);
    }
}
