package bai10;

import bai10.model3.HinhHoc;
import bai10.model3.HinhTron;
import bai10.model3.HinhVuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SoSanhDienTichVer1 {
    public static void main(String[] args) {
        List<HinhHoc> dshh = new ArrayList<>();
        dshh.add(new HinhVuong(4));
        dshh.add(new HinhTron(4.4));
        dshh.add(new HinhTron(3.4));
        dshh.add(new HinhTron(5.4));
        dshh.add(new HinhTron(2.4));
        dshh.add(new HinhTron(7.4));

        Collections.sort(dshh, new Comparator<HinhHoc>() {
            @Override
            public int compare(HinhHoc o1, HinhHoc o2) {
                return Double.compare(o1.tinhDienTich(), o2.tinhDienTich());
            }
        });
        for (HinhHoc hinhHoc: dshh){
            System.out.println(hinhHoc);
        }
    }
}
