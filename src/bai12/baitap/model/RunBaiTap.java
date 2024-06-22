package bai12.baitap.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RunBaiTap {
    public static void main(String[] args) {

//        Nhap du lieu cho doi tuong vu khi Cung ten va Choi
        CungTen vk1 = new CungTen("Ten Cung Sung", 8, 120, "hello");
        CungTen vk2 = new CungTen("Ten Cung Dien", 10, 200, "hello");
        Choi vk3 = new Choi("Choi bay", 8, 300, "Choi bay amstrong");

        List<VuKhi> listVuKhi = new ArrayList<>();
        listVuKhi.add(vk1);
        listVuKhi.add(vk2);
        listVuKhi.add(vk3);

        System.out.println(vk1);
        System.out.println(vk2);
        System.out.println(vk3);

        for (VuKhi vk: listVuKhi){
            System.out.println(vk);
        }

//        Nhap du lieu cho doi tuong Nhan Vat
        List<NhanVat> listNhanVat = new ArrayList<>();

        NhanVat nv1 = new NhanVat("Nguyễn Văn Sơn", 453, 150);
        nv1.setListVuKhi(listVuKhi);
        NhanVat nv2 = new NhanVat("Nguyễn Văn Minh", 234, 200);
        nv2.setListVuKhi(listVuKhi);
        NhanVat nv3 = new NhanVat("Nguyễn Bảo Hành", 2000, 320);
        nv3.setListVuKhi(listVuKhi);
        listNhanVat.add(nv1);
        listNhanVat.add(nv2);
        listNhanVat.add(nv3);



//        Sap xep list Nhan Vat theo luong Mau
        Collections.sort(listNhanVat, new Comparator<NhanVat>() {
            @Override
            public int compare(NhanVat o1, NhanVat o2) {
                return Integer.compare(o1.getMau(), o2.getMau());
            }
        });

        for (NhanVat nv: listNhanVat){
            System.out.println(nv.getTen());
        }

        System.out.println("--------------------");

//        Loc Nhan vat co suc manh tren 100 va luong mau >= 100 va <= 400
        List<NhanVat> locNhanVat = listNhanVat.stream()
                .filter(nhanVat -> nhanVat.getMau() >= 100 && nhanVat.getMau() <= 400)
                .filter(nhanVat -> nhanVat.getSucManh() > 100)
                .collect(Collectors.toList());
        for (NhanVat nv: listNhanVat){
            System.out.println(nv);
        }
        System.out.println("--------------------");
//      Tìm kiếm sinh viên có tên "Nguyen Van Son"

        NhanVat target = new NhanVat("Nguyễn Bảo Hành", 453, 150); // Dummy object for comparison
        int viTriNhanVat = Collections.binarySearch(listNhanVat, target, new Comparator<NhanVat>() {
            @Override
            public int compare(NhanVat o1, NhanVat o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        if (viTriNhanVat < 0){
            System.out.println("Không tìm thấy sinh viên!");
        }else {
            System.out.println("Sinh viên nằm ở vị trí: " + viTriNhanVat);
        }

        for (VuKhi vk: nv1.getListVuKhi()){
            System.out.println(vk);
        }


//        Nhap du lieu cho doi tuong Binh Đoàn
        BinhDoan binhDoan = new BinhDoan(1200, 3000);
        binhDoan.addDoiQuan(new DoiQuan("Nguyen Van Sonw", new BinhDoan(1200, 4000)));
        binhDoan.addDoiQuan(new DoiQuan("Nguyen Tran Trung Quan", new BinhDoan(3000, 4000)));
        binhDoan.addDoiQuan(new DoiQuan("Nguyen Dinh Hoa cuong", new BinhDoan(4000, 5000)));


        NhanVat phuThuy1 = new PhuThuy("Nguyen Dinh Hoa Cuong", 1000, 2000, "Suc Manh Voi");
    }
}
