package com.mycompany.menu_minuman_oop;
public class Nutrisari_Jeruk extends Menu_Minuman_OOP{
    int jml1;
    
    public int getjml1(){
        return jml1;
    }
    public void setjml1(int jml1){
        this.jml1 = jml1;
    }
    public double getT1() {
        double total1 = 3000 * jml1;
        return total1;
    }

    public void Infodaftarmenu() {
    }

    public void setNama(String string) {
    }
}
