package bai08.vd4;

import bai08.HoaDon;
import bai08.SanPham;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        ArrayList<bai08.SanPham> dssp = new ArrayList<>();
        dssp.add(new bai08.SanPham("123", "hello"));
        dssp.add(new bai08.SanPham("123", "123"));
        dssp.add(new bai08.SanPham("123", "heẻwrllo"));
        dssp.add(new bai08.SanPham("123", "sadf"));
        dssp.add(new SanPham("123", "ádffsd"));
        bai08.HoaDon hoaDon = new HoaDon(123, dssp);
        System.out.println(hoaDon);
    }
}
