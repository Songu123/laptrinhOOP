package bai12.baitap.model;

public class CungTen extends VuKhi {
    private String kieuCung;


    public CungTen(String ten, int soLuong, int satThuong, String kieuCung) {
        super(ten, soLuong, satThuong);
        this.kieuCung = kieuCung;
    }

    public String getKieuCung() {
        return kieuCung;
    }

    public void setKieuCung(String kieuCung) {
        this.kieuCung = kieuCung;
    }

    @Override
    public String toString() {
        return "CungTen{" +
                "kieuCung='" + kieuCung + '\'' +
                "} " + super.toString();
    }
}
