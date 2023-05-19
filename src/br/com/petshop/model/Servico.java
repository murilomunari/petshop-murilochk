package br.com.petshop.model;

public class Servico {

        private int id;

        private String nome;

        private double valor;

        private String descricao;

        private String observacao;

        public Servico() {
        }

        public Servico(int id, String nome, double valor, String descricao, String observacao) {
            this.id = id;
            this.nome = nome;
            this.valor = valor;
            this.descricao = descricao;
            this.observacao = observacao;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getObservacao() {
            return observacao;
        }

        public void setObservacao(String observacao) {
            this.observacao = observacao;
        }

        @Override
        public String toString() {
            return "Servico{" +
                    "id=" + id +
                    ", nome='" + nome + '\'' +
                    ", valor=" + valor +
                    ", descricao='" + descricao + '\'' +
                    ", observacao='" + observacao + '\'' +
                    '}';
        }
    }

