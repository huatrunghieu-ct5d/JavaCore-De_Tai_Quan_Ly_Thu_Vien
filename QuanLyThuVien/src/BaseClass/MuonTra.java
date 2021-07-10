/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseClass;

import java.time.LocalDate;

/**
 *
 * @author Loi
 */
public class MuonTra {
    private String maSV;
    private LocalDate ngayMuon;
    private LocalDate hanTra;
    private String maSach; 
    private LocalDate ngayTra;

    public MuonTra() {
    }

    public MuonTra(String maSV, LocalDate ngayMuon, LocalDate hanTra, String maSach, LocalDate ngayTra) {
        this.maSV = maSV;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.maSach = maSach;
        this.ngayTra = ngayTra;
    }

    @Override
    public String toString() {
        return "MuonTra{" + "maSV=" + maSV + ", ngayMuon=" + ngayMuon + ", hanTra=" + hanTra + ", maSach=" + maSach + ", ngayTra=" + ngayTra + '}';
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public LocalDate getHanTra() {
        return hanTra;
    }

    public void setHanTra(LocalDate hanTra) {
        this.hanTra = hanTra;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }
        
}
