package br.com.biulder;

public class Main {

    public static void main(String [] args) {
            Livro esm = new Livro.Builder()
                    .setNome("Engenharia Soft Moderna")
                    .setEditora("UFMG")
                    .setAno("2020")
                    .build();
            System.out.println("Livro 1: " + esm.toString());

            Livro gof = new Livro.Builder()
                    .setNome("Design Patterns")
                    .setAutores("GoF")
                    .setAno("1995")
                    .build();
            System.out.println("Livro 2: " + gof.toString());
    }
}


