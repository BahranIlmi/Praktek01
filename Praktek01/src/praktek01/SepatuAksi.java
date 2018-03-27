/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author ilmi
 */
public class SepatuAksi {
    public static void main(String[] args) {
        Sepatu Vans = new Sepatu();
        Sepatu Nike = new Sepatu();
        Sepatu Adidas = new Sepatu();
        
        Vans.JenisSepatu="Sneakers";
        Vans.Warna="Hitam";
        Vans.Kualitas="Original";
        Vans.UkuranSepatu="40";
        Vans.TempatPembuatan="China";
        
        Nike.JenisSepatu="Running";
        Nike.Warna="Navy";
        Nike.Kualitas="Premium";
        Nike.UkuranSepatu="39";
        Nike.TempatPembuatan="Vietnam";
        
        Adidas.JenisSepatu="Boots";
        Adidas.Warna="Coklat";
        Adidas.Kualitas="Original";
        Adidas.UkuranSepatu="41";
        Adidas.TempatPembuatan="Indonesia";
    }
}
