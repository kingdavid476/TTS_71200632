package com.rplbo.utsnota;

public class Kalkulator {
    private int bil1;
    private int bil2;
    private String op;


    public Kalkulator(BilanganString bilangan1, BilanganString bilangan2, Operator operator){
        this.bil1 = bilangan1.getBilangan();
        this.bil2 = bilangan2.getBilangan();
        this.op = operator.getOperatorSimbol();

    }

    public void hitung() {
        if (this.op == "+"){
            int result = bil1 + bil2;
            System.out.println(result);
        }
        if (this.op == "-"){
            int result = bil1 - bil2;
            System.out.println(result);
        }
        if (this.op == "/"){
            int result = bil1 / bil2;
            System.out.println(result);

        }
        if (this.op == "*"){
            int result = bil1 * bil2;
            System.out.println(result);

        }
        if (this.op == "**"){
            int result = (int) Math.pow(bil1,bil2);
            System.out.println(result);

        }
        else {
            System.out.println(bil1+bil2);
        }

    }
}
