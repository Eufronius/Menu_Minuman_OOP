package com.mycompany.menu_minuman_oop;
public class Dring_Bengbeng extends Menu_Minuman_OOP{
    int jml5;
    
    public int getjml5() {
        return jml5;
    }
    public void setjml5(int jml5) {
        this.jml5 = jml5;
    }

    public double getT5() {
        double total5 = 4000 * jml5;
        return total5;
    }

    public void Infodaftarmenu() {
    }

    public void setNama(String string) {
    }
}
