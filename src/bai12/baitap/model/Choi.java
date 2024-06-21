package bai12.baitap.model;

public class Choi extends VuKhi{
    private String kieuChoi;

    public Choi(String ten, int soLuong, int satThuong, String kieuChoi) {
        super(ten, soLuong, satThuong);
        this.kieuChoi = kieuChoi;
    }

    public String getKieuCung() {
        return kieuChoi;
    }

    public void setKieuCung(String kieuChoi) {
        this.kieuChoi = kieuChoi;
    }

    @Override
    public String toString() {
        return "Choi{" +
                "kieuChoi='" + kieuChoi + '\'' +
                "} " + super.toString();
    }
}
