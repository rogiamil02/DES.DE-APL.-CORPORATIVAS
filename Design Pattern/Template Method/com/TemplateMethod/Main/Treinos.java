package com.TemplateMethod.Main;

/* Descrição dos Treinos
    *Treino Focado nos Membros Superiores*
Treino A -> Peitos, Trícpes e Ombros (Membros Superiores )
Treino B -> Costas, Bícipes e trapézio (Membros Superiores )
Treino C -> Membros Inferiores Completo
*/

public abstract class Treinos {

    final void TreinoInicial(){
        TreinoA();
        TreinoB();
        TreinoC();
    }

    abstract void TreinoA();
    abstract void TreinoB();

    final void TreinoC(){
        System.out.println("Treino C");
    }
}

class TreinoIntermediario extends Treinos{

    void TreinoA(){
        System.out.println("Treino A");
    }
    void TreinoB(){
        System.out.println("Treino B");
    }
}

class TreinoFinal extends Treinos{

    void TreinoA(){
        System.out.println("Treino A");
    }
    void TreinoB(){
        System.out.println("Treino B");
    }
}


