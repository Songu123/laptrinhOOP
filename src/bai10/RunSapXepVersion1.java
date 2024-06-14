package bai10;

import bai10.model.SinhVien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class RunSapXepVersion1 {
    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        SinhVien sv1 = new SinhVien("Nguyễn Văn Sơn", 6.5, 29);
        SinhVien sv2 = new SinhVien("Nguyễn Chánh Đạt", 7.5, 10);
        SinhVien sv3 = new SinhVien("Lê Quang Vinh", 8.5, 21);
        SinhVien sv4 = new SinhVien("Nguyễn Văn Hiệp", 9,   22);
        list.add(sv1);
        list.add(sv2);
        list.add(sv3);
        list.add(sv4);

        Collections.sort(list);
        for (SinhVien sv: list){
            String lastWord = sv.getHoTen().substring(sv.getHoTen().lastIndexOf(" ")+1);
            System.out.println(sv);
            System.out.println(lastWord);
        }
    }
}
