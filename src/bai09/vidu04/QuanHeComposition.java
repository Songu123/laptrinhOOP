package bai09.vidu04;

public class QuanHeComposition {
    public static void main(String[] args) {
        DongCo dc = new DongCo("Dong co xang");
        XeHoi xeHoi = new XeHoi(dc);
        BanhXe bx1 = new BanhXe(1.5);
        BanhXe bx2 = new BanhXe(1.5);
        BanhXe bx3 = new BanhXe(1.5);
        BanhXe bx4 = new BanhXe(1.5);
        xeHoi.addBanhXe(bx1);
        xeHoi.addBanhXe(bx2);
        xeHoi.addBanhXe(bx3);
        xeHoi.addBanhXe(bx4);
//        Thay đổi đối tuọng có clone thì không thể thay đổi đối tượng xe
        System.out.println(xeHoi);
        dc.setLoaiDongCo("Dong co dien");
        bx1.setBanKinh(3.5);
//        Không thay đổi đối tượng có clone thì thay đổi đối tượng xe
        System.out.println(xeHoi);
    }
}
