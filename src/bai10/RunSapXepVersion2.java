package bai10;

import bai10.model2.SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunSapXepVersion2 {
    public static void main(String[] args) {
        List<bai10.model2.SinhVien> list = new ArrayList<>();
        bai10.model2.SinhVien sv1 = new bai10.model2.SinhVien("Nguyễn Văn Sơn", 6.5, 29);
        bai10.model2.SinhVien sv2 = new bai10.model2.SinhVien("Nguyễn Chánh Đạt", 7.5, 10);
        bai10.model2.SinhVien sv3 = new bai10.model2.SinhVien("Lê Quang Vinh", 8.5, 21);
        bai10.model2.SinhVien sv4 = new bai10.model2.SinhVien("Nguyễn Văn Hiệp", 9, 22);
        list.add(sv1);
        list.add(sv2);
        list.add(sv3);
        list.add(sv4);

        list.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTuoi() - o2.getTuoi();
            }
        });

        for(SinhVien sv: list){
            System.out.println(sv);
        }
    }
}
