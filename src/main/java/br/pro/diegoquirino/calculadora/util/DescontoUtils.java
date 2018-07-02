package br.pro.diegoquirino.calculadora.util;

public class DescontoUtils {

    public double calcularFatorDeDesconto(String tipoCliente, int quant) {
        double desc = 0;
        switch(tipoCliente) {
            case "A":
                if(quant < 100) {
                    desc = 0.90;
                } else if (quant >= 100 && quant < 1000) {
                    desc = 0.95;
                } else {
                    desc = 1.00;
                }
                break;
            case "B":
                if(quant < 100) {
                    desc = 0.85;
                } else if (quant >= 100 && quant < 1000) {
                    desc = 0.90;
                } else {
                    desc = 0.95;
                }
                break;
            case "C":
                if(quant < 100) {
                    desc = 0.80;
                } else if (quant >= 100 && quant < 1000) {
                    desc = 0.85;
                } else {
                    desc = 0.90;
                }
                break;
        }
        return desc;
    }

}
