package br.com.strategy;

import br.com.strategy.service.Frete;
import br.com.strategy.service.frete.Normal;
import br.com.strategy.service.frete.Sedex;

public enum TipoFrete {
    NORMAL{
        @Override
        public Frete obeterFrete(){
            return new Normal();
        }
    },
    SEDEX {
        @Override
        public Frete obeterFrete(){
            return new Sedex();
        }
    };

    public abstract Frete obterFrete();
}
