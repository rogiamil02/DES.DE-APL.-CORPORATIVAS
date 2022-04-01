package br.com.biulder;

public class Livro {

        private String nome;
        private String autores;
        private String editora;
        private String ano;

        private Livro (String nome, String autores, String editora, String ano) {
            this.nome = nome;
            this.autores = autores;
            this.editora = editora;
            this.ano = ano;
        }

        public String toString() {
            return nome + ". " + autores + "," + editora + "," + ano;
        }

        public static class Builder {
            private String nome;
            private String autores;
            private String editora;
            private String ano;

            public Builder setNome(String nome) {
                this.nome = nome;
                return this;
            }

            public Builder setAutores(String autores) {
                this.autores = autores;
                return this;
            }

            public Builder setEditora(String editora) {
                this.editora = editora;
                return this;
            }

            public Builder setAno(String ano) {
                this.ano = ano;
                return this;
            }

            public Livro build() {
                return new Livro(nome, autores, editora, ano);
            }
        }
    }


