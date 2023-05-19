package br.com.pessoa.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa {

    private String CPF;

    private Collection<Pessoa> filhos = new Vector<>();

    public PessoaFisica addFilho(PessoaFisica filho) {
        this.filhos.add(filho);
        return this;
    }

    public  PessoaFisica removeFilho(PessoaFisica filho){
        this.filhos.remove(filho);
        return this;
    }

    public Collection<Pessoa> getFilhos(){
        return Collections.unmodifiableCollection(this.filhos);
    }

    public PessoaFisica() {
    }

    public PessoaFisica(Long id, String nome, String CPF) {
        super(id, nome);
        this.CPF = CPF;
    }


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                '}';
    }
}

