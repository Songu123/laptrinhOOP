package bai11.baitapluyentap.model;

public class Laptop extends SanPham{
    private int ram;
    private String cpu;

    public Laptop(int maSanPham, String tenSanPham, int soLuong, double giaCa, int ram, String cpu) {
        this.setMaSanPham(maSanPham);
        this.setTenSanPham(tenSanPham);
        this.setSoLuong(soLuong);
        this.setGiaCa(giaCa);
        this.setRam(ram);
        this.setCpu(cpu);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", cpu='" + cpu + '\'' +
                "} " + super.toString();
    }
}
