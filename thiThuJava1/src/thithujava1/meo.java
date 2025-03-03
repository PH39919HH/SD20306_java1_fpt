/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thithujava1;

/**
 *
 * @author Admin
 */
public class meo extends DongVat{
    private String tiengKeu;

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public meo() {
    }

    public meo(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public meo(String tiengKeu, String maDongVat, String TenDongVat, String NoiSong, int canNang) {
        super(maDongVat, TenDongVat, NoiSong, canNang);
        this.tiengKeu = tiengKeu;
    }
    public void inThongTIn(){
        super.inThongTin();
        System.out.println("tieng keu: "+tiengKeu);
    }
}
