/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ph39919_final;

import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Meo {

    private String loaiMeo;
    private String mauSac;

    public String getLoaiMeo() {
        return loaiMeo;
    }

    public void setLoaiMeo(String loaiMeo) {
        this.loaiMeo = loaiMeo;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public Meo() {
    }

    public Meo(String loaiMeo, String mauSac) {
        this.loaiMeo = loaiMeo;
        this.mauSac = mauSac;
    }
    
    
}
