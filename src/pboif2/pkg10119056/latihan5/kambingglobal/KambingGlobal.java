/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan5.kambingglobal;

/**
 *
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan variabel global
 */


public class KambingGlobal {
    
    int jumlahKambing = 88;
    
    public void getJumlahKambing(){
    System.out.println("Jumlah Kambing: " + jumlahKambing);
}
    public void tambahKambing(){
        jumlahKambing =jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah:" + jumlahKambing);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        kambingSusu.getJumlahKambing();
        
        kambingSusu.tambahKambing();
        
        kambingSusu.getJumlahKambing();        
                
    }
    
}
