package bai09.vidu02;

public class RunAggregation {
    public static void main(String[] args) {
        SanPham sp = new SanPham(123, "cafe");
        HoaDon hoaDon = new HoaDon(3);
        hoaDon.addHoaDon(sp);
        System.out.println(hoaDon);
        sp.setMaSanPham(890);
        System.out.println(hoaDon);
    }
}
