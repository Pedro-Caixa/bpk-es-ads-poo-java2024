package cadastroPessoa;

public class Endereco {
    private Integer cep;
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }
    public Integer getCep() {
        return cep;
    }

    public void Integer setNumero(Integer numero) {
        if(numero != null && !numero.isEmpty()){
            this.numero = numero;
        }else{
            System.out.println("Numero inválido");
        }
    }

    public void Integer setCep(Integer cep) {
        if(cep != null && !cep.isEmpty()){
            this.cep = cep;
        }else{
            System.out.println("CEP inválido");
        }
    }
    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }

}
