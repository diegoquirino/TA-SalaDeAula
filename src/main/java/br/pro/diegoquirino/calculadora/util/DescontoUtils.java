package br.pro.diegoquirino.calculadora.util;

public class DescontoUtils {

    public double calcularFatorDeDesconto(String tipoCliente, int quant) {
        double desc = 0;
        switch(tipoCliente) {
            case "A":
                if(quant < 10) {
                    desc = 1.00;
                } else if (quant >= 10 && quant < 100) {
                    desc = 0.95;
                } else {
                    desc = 0.90;
                }
                break;
            case "B":
                if(quant < 10) {
                    desc = 0.95;
                } else if (quant >= 10 && quant < 100) {
                    desc = 0.85;
                } else {
                    desc = 0.75;
                }
                break;
            case "C":
                if(quant < 10) {
                    desc = 1.00;
                } else if (quant >= 10 && quant < 100) {
                    desc = 0.80;
                } else {
                    desc = 0.75;
                }
                break;
        }
        return desc;
    }

}
