import bai08.HoaDon;
import bai08.SanPham;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SanPham> dssp = new ArrayList<>();
        dssp.add(new SanPham("123", "hello"));
        dssp.add(new SanPham("123", "123"));
        dssp.add(new SanPham("123", "heẻwrllo"));
        dssp.add(new SanPham("123", "sadf"));
        dssp.add(new SanPham("123", "ádffsd"));
        HoaDon hoaDon = new HoaDon(123, dssp);
        System.out.println(hoaDon);
    }
}