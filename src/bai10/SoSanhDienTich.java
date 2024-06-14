package bai10;

import bai10.business.DienTichComparator;
import bai10.model3.HinhHoc;
import bai10.model3.HinhTron;
import bai10.model3.HinhVuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SoSanhDienTich {
    public static void main(String[] args) {
        List<HinhHoc> dshh = new ArrayList<>();
        dshh.add(new HinhVuong(4));
        dshh.add(new HinhTron(4.4));
        dshh.add(new HinhTron(3.4));
        dshh.add(new HinhTron(5.4));
        dshh.add(new HinhTron(2.4));
        dshh.add(new HinhTron(7.4));

        System.out.println("Sắp xếp hình theo diện tích tăng dần: ");
        Collections.sort(dshh, new  DienTichComparator());
        for (HinhHoc hinhHoc: dshh){
            System.out.println(hinhHoc);
        }
    }
}
