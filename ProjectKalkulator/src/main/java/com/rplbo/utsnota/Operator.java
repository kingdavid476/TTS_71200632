package com.rplbo.utsnota;

public class Operator {
    private String operatorString;
    private String operatorSimbol;

    public Operator(String operator){
        operator = operator.toString().toLowerCase();
        if (operator == "kali"){
            this.operatorSimbol = "*";
        }
        if (operator == "bagi"){
            this.operatorSimbol = "/";
        }
        if (operator == "tambah"){
            this.operatorSimbol = "+";
        }
        if (operator == "kurang"){
            this.operatorSimbol = "-";
        }
        if (operator == "pangkat"){
            this.operatorSimbol = "**";
        }
    }

    public String getOperatorSimbol() {
        return operatorSimbol;
    }
}
