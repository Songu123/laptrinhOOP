package bai12.baitap.model;

public class DoiQuan {
    private String tenDoiQuan;
    private BinhDoan binhDoan;

    public DoiQuan(String tenDoiQuan, BinhDoan binhDoan) {
        this.tenDoiQuan = tenDoiQuan;
        this.binhDoan = binhDoan;
    }

    public String getTenDoiQuan() {
        return tenDoiQuan;
    }

    public void setTenDoiQuan(String tenDoiQuan) {
        this.tenDoiQuan = tenDoiQuan;
    }

    public BinhDoan getBinhDoan() {
        return binhDoan;
    }

    public void setBinhDoan(BinhDoan binhDoan) {
        this.binhDoan = binhDoan;
    }

    @Override
    public String toString() {
        return "DoiQuan{" +
                "tenDoiQuan='" + tenDoiQuan + '\'' +
                ", binhDoan=" + binhDoan +
                '}';
    }
}
