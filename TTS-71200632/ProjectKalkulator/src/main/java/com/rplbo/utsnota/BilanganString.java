package com.rplbo.utsnota;

public class BilanganString {
    private String bilanganstring;
    private int bilangan = 0;

    public BilanganString (String bilanganstring){
        bilanganstring = bilanganstring.toString().toLowerCase();
        if ((bilanganstring.contains("satu")) == true){
            this.bilangan = 1;
        }
        if ((bilanganstring.contains("dua"))== true){
            this.bilangan = 2;
        }
        if ((bilanganstring.contains("tiga"))== true){
            this.bilangan = 3;
        }
        if ((bilanganstring.contains("empat"))== true){
            this.bilangan = 4;
        }
        if ((bilanganstring.contains("lima"))== true){
            this.bilangan = 5;
        }
        if ((bilanganstring.contains("enam"))== true){
            this.bilangan = 6;
        }
        if ((bilanganstring.contains("tuju"))== true){
            this.bilangan = 7;
        }
        if ((bilanganstring.contains("delapan"))== true){
            this.bilangan = 8;
        }
        if ((bilanganstring.contains("sembilan"))== true){
            this.bilangan = 9;
        }
        if ((bilanganstring.contains("sepuluh"))== true){
            this.bilangan = 1;
        }
        if ((bilanganstring.contains("belas"))== true){
            this.bilangan += 10;
        }
        if ((bilanganstring.contains("puluh"))== true) {
            this.bilangan = this.bilangan * 10;
        }
    }

    public boolean apakahDuaDigit(){
        if (bilangan < 10){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean apakahLebihDari10(){
        if (bilangan < 10){
            return false;
        }
        else{
            return true;
        }
    }

    public int getBilangan() {
        return bilangan;
    }
}
