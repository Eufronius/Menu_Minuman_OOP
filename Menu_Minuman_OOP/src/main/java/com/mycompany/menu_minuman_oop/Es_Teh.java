package com.mycompany.menu_minuman_oop;
public class Es_Teh extends Menu_Minuman_OOP{
    int jml2;
    public int getjml2() {
        return jml2;
    }
    public void setjml2(int jml2) {
        this.jml2 = jml2;
    }

    public double getT2() {
        double total2 = 3000 * jml2;
        return total2;
    }

    public void Infodaftarmenu() {
    }

    public void setNama(String string) {
    }
}
