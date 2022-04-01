package br.com.strategy.service.frete;

import br.com.strategy.service.Frete;

public class Sedex implements Frete {

    public double calcularPreco(int distancia){
        return distancia *1.45 + 12;
    }
}
