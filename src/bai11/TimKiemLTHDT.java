package bai11;

import bai11.model.SinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TimKiemLTHDT {
    public static void main(String[] args) {
//      Bước 1: Tạo dữ liệu
        List<SinhVien> listSV = new ArrayList<>();
        listSV.add(new SinhVien("Nguyễn Văn Tuấn", 4.5, 18));
        listSV.add(new SinhVien("Nguyễn Văn Sơn", 10, 19));
        listSV.add(new SinhVien("Nguyễn Đoàn Tuấn", 9, 18));
        listSV.add(new SinhVien("Nguyễn Thị Hoàng", 8, 20));

        System.out.println("Danh sách ban đầu: ");
        for (SinhVien i: listSV){
            System.out.println(i);
        }
        System.out.println("--------------------");

//      Tìm kiếm sinh viên có điểm trung binh thấp nhắt
        System.out.println("Sinh Viên có điểm thấp nhất:");
        SinhVien sinhVienMin = Collections.min(listSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getDiemTB(), o2.getDiemTB());
            }
        });

        System.out.println(sinhVienMin);

//        for (SinhVien i: listSV) {
//            System.out.println(i);
//        }
        System.out.println("--------------------");

//      Tìm kiếm sinh viên có điểm trung bình cao nhất
        System.out.println("Sinh Viên có điểm cao nhất: ");
        SinhVien sinhVienMax = Collections.max(listSV, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.getDiemTB(), o2.getDiemTB());
            }
        });
        System.out.println(sinhVienMax);

        System.out.println("--------------------");
//      Tìm kiếm sinh viên đầu tiên có tên là "Nguyễn Văn Sơn"
        int sinhVienBinh = Collections.binarySearch(listSV, new SinhVien("Nguyễn Văn Sơn", 0, 0), new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        System.out.println(sinhVienBinh);
        if (sinhVienBinh < 0){
            System.out.println("Không tìm thấy sinh viên!");
        }else {
            System.out.println("Sinh viên nằm ở vị trí: " + sinhVienBinh);
        }

//      Lọc dữ liệu sinh viên có 8<=dtb<=10 và 18<=tuoi<=20
//      Sử dụng hàm Stream và cú pháp Lambda
        System.out.println("--------------------");
        System.out.println("Cách thứ nhất sử dụng hàm stream() ");
        List<SinhVien> locSinhVien = listSV.stream()
                .filter(sinhVien -> sinhVien.getDiemTB() >= 8 && sinhVien.getDiemTB() <= 10) // Combine filters for efficiency
                .filter(sinhVien -> sinhVien.getTuoi() >= 18 && sinhVien.getTuoi() <= 20) // Corrected typo
                .collect(Collectors.toList());
        for (SinhVien i: locSinhVien){
            System.out.println(i);
        }



//      Lọc dữ liệu sử dụng Predicate
        System.out.println("--------------------");
        System.out.println("Cách thứ hai sử dụng Predicate");
        Predicate<SinhVien> dk_dtb = new Predicate<SinhVien>() {
            @Override
            public boolean test(SinhVien sinhVien) {
                return sinhVien.getDiemTB() <= 10 && sinhVien.getDiemTB() >= 8;
            }
        };

//      Lọc dữ liệu - sử dụng Predicate,
        Predicate<SinhVien> dk_tuoi = new Predicate<SinhVien>() {
            @Override
            public boolean test(SinhVien sinhVien) {
                return sinhVien.getTuoi() >= 18 && sinhVien.getTuoi() <= 20;
            }
        };

//      Phép toán OR kết hợp Stream và filter
        List<SinhVien> dskq = listSV.stream()
                .filter(dk_dtb.or(dk_tuoi))
                .collect(Collectors.toList());

        for (SinhVien i: dskq){
            System.out.println(i);
        }
    }
}
