package bai09.vidu05;

public class QuanHeCompositionVersion2 {
    public static void main(String[] args) {
        DongCo dc = new DongCo("Dong co xag");
        BanhXe bx1 = new BanhXe(4.5);
        XeHoi xeHoi = new XeHoi(dc);
        xeHoi.addBanhXe(bx1);

        System.out.println(xeHoi);
        dc.setLoaiDongCo("Dong co dien");
        bx1.setBanKinh(5.6);
        System.out.println(xeHoi);
    }
}
