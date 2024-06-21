package bai12.model;

import java.util.ArrayList;
import java.util.List;

public class BoSuuTap {
    private List<HinhHoc> listHinhHoc;

    public BoSuuTap() {
        this.listHinhHoc = new ArrayList<>();
    }

    public void addHinhHoc(HinhHoc hh){
        try {
            this.listHinhHoc.add((HinhHoc) hh.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public List<HinhHoc> getListHinhHoc() {
        return listHinhHoc;
    }

    public void setListHinhHoc(List<HinhHoc> listHinhHoc) {
        this.listHinhHoc = listHinhHoc;
    }

    @Override
    public String toString() {
        return "BoSuuTap{" +
                "listHinhHoc=" + listHinhHoc +
                '}';
    }
}
