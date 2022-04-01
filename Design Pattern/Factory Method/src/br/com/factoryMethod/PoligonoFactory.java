package br.com.factoryMethod;

public class PoligonoFactory {

    public static Poligono getPoligono(int NumeroLados){
        if (NumeroLados == 3) {
            return new Triangulo();
        }
        else if (NumeroLados == 4){
            return  new  Quadrado();
        }
        else if (NumeroLados == 5){
            return  new Pentagono();
        }
        return null;
    }
}
