/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan31.PerkenalanMahasiswa;

/**
 *
 * @author aruma
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    
    public void perkenalkanDiri(){
        System.out.println("Hello Everyone");
        System.out.println("My NIM is "+nim);
        System.out.println("My Name is "+nama);
        System.out.println();
    }
}