package br.com.strategy.service.frete;

import br.com.strategy.service.Frete;

public class Normal implements Frete {

    public double calcularPreco(int distancia){
        return distancia * 1.25 + 10;

    }
}