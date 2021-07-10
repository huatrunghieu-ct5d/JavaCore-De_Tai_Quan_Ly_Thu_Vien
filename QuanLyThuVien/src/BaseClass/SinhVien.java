/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClass;

/**
 *
 * @author Loi
 */
public class SinhVien {

    private String maSV;
    private String maLop;
    private String tenSV;
    private String SDT;
    private String diaC;

    public SinhVien() {
    }

    public SinhVien(String maSV, String maLop, String tenSV, String SDT, String diaC) {
        this.maSV = maSV;
        this.maLop = maLop;
        this.tenSV = tenSV;
        this.SDT = SDT;
        this.diaC = diaC;
    }

    public String getDiaC() {
        return diaC;
    }

    public void setDiaC(String diaC) {
        this.diaC = diaC;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "maSV=" + maSV + ", maLop=" + maLop + ", tenSV=" + tenSV + ", SDT=" + SDT + ", diaC=" + diaC + '}';
    }

}
