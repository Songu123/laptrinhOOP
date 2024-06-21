package bai12.model;

public class QuanLyHinhHoc {
    public static void main(String[] args) {
        BoSuuTap listHinhHoc = new BoSuuTap();
        listHinhHoc.addHinhHoc(new HinhTron(3.5));
        listHinhHoc.addHinhHoc(new HinhTron(4));
        for (HinhHoc hh: listHinhHoc.getListHinhHoc()){
            System.out.println(hh);
        }

        Counter counter = new Counter();
        Counter counter1 = new Counter();
        System.out.println("Có " + Counter.getCount() + " dối tượng trong bộ nhớ");

        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        System.out.println("Có " + Counter.getCount() + " dối tượng trong bộ nhớ");

    }
}
