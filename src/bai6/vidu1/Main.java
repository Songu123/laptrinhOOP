package bai6.vidu1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HinhTron hcn1 = new HinhTron(5);
        HinhTron hcn2 = new HinhTron(7);
        HinhTron hcn3 = new HinhTron(10);

        ArrayList<HinhTron> danhsach = new ArrayList<>();
        danhsach.add(hcn1);
        danhsach.add(hcn2);
        danhsach.add(hcn3);
        for (HinhTron hcn : danhsach){
            System.out.println(hcn.tinhChuVi() + "---" + hcn.tinhDienTich());
        }
    }
}
