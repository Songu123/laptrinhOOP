package bai10.business;

import bai10.model3.HinhHoc;

import java.util.Comparator;

public class DienTichComparator implements Comparator<HinhHoc> {

    @Override
    public int compare(HinhHoc o1, HinhHoc o2) {
        return Double.compare(o2.tinhDienTich(), o1.tinhDienTich());
    }
}
