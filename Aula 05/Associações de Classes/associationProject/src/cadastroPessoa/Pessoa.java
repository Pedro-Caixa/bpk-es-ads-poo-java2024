package cadastroPessoa;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private Integer idade;
    private Pessoa pai;
    private Pessoa mae;
    private List<Endereco> enderecos;

    public Pessoa(String nome, Integer idade, Endereco enderecoAtual) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = new ArrayList<>();
        this.incluirIndereco(enderecoAtual);
    }

    public void incluirIndereco(Endereco enderecoAtual){
        this.enderecos.add(enderecoAtual);
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Endereco getEnderecoAtual() {
        return enderecoAtual;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }
}

@Override
public String toString() {
    return "Pessoa{" +
            "nome='" + nome + '\'' +
            ", idade='" + idade + '\'' +
            '}';
}
}

