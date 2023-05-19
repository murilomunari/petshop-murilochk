import br.com.pessoa.model.PessoaFisica;
import br.com.pessoa.model.PessoaJuridica;

import java.time.LocalDate;

public class Main {
    public static PessoaFisica novaPessoa(Long id, String nome, LocalDate nascimento, String cpf) {
        PessoaFisica pf = new PessoaFisica();
        pf.setId(id);
        pf.setNome(nome);
        pf.setCPF(cpf);

        return pf;
    }
    public static PessoaJuridica novaPessoaJuridica(Long id, String nome, String CNPJ){
        PessoaJuridica pj = new PessoaJuridica();
        pj.setId(id);
        pj.setNome(nome);
        pj.setCNPJ(CNPJ);
        return pj;
    }



}