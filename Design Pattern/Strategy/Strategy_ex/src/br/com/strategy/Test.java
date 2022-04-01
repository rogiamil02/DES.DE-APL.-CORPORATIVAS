package br.com.strategy;

import br.com.strategy.service.Frete;
import br.com.strategy.service.frete.Normal;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)){
            System.out.print("Informe a distancia");
            int distancia = entrada.nextInt();
            System.out.print("Qual o tipo de frete (1) Normal, (2) Sedex");
            int opcaoFrete = entrada.nextInt();
            TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete -1];

            Frete frete = tipoFrete.obterFrete();
            double preco = frete.calcularPreco(distancia);
            System.out.printf("O valor total é de R$.2f", preco);
        }
    }
}
