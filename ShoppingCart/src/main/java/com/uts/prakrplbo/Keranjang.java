package com.uts.prakrplbo;

import java.util.ArrayList;

public class Keranjang {
    private ArrayList<Buah> daftarBuah;

    public void tambahProduk(Buah buah){
        daftarBuah.add(buah);
    }
    public void hapusProduk(Buah buah){
        daftarBuah.remove(buah);
    }
    public ArrayList<Buah> getKeranjang(){
        return daftarBuah;
    }
}
