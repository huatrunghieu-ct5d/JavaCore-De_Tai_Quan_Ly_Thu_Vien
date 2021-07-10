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
public class Sach {

    private String maS;
    private String tenS;
    private String loaiS;
    private String tenTG;
    private String nhaXB;
    private int namXB;
    private int soL;

    public Sach() {
    }

    public Sach(String maS, String tenS, String loaiS, String tenTG, String nhaXB, int namXB, int soL) {
        this.maS = maS;
        this.tenS = tenS;
        this.loaiS = loaiS;
        this.tenTG = tenTG;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
        this.soL = soL;
    }

    public int getSoL() {
        return soL;
    }

    public void setSoL(int soL) {
        this.soL = soL;
    }

    public String getmaS() {
        return maS;
    }

    public void setmaS(String maS) {
        this.maS = maS;
    }

    public String gettenS() {
        return tenS;
    }

    public void settenS(String tenS) {
        this.tenS = tenS;
    }

    public String getloaiS() {
        return loaiS;
    }

    public void setloaiS(String loaiS) {
        this.loaiS = loaiS;
    }

    public String gettenTG() {
        return tenTG;
    }

    public void settenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public String getnhaXB() {
        return nhaXB;
    }

    public void setnhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getnamXB() {
        return namXB;
    }

    public void setnamXB(int namXB) {
        this.namXB = namXB;
    }

    @Override
    public String toString() {
        return "Sach{" + "maS=" + maS + ", tenS=" + tenS + ", loaiS=" + loaiS + ", tenTG=" + tenTG + ", nhaXB=" + nhaXB + ", namXB=" + namXB + ", soL=" + soL + '}';
    }
}
