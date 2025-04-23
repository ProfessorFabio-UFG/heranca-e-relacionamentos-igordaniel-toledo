public class Cliente extends PessoaFisica {
    private double renda;
    private String interesses;
    private String profissao;

    public Cliente(String nome, String endereco, String telefone, String cpf, char sexo, int estadoCivil, String profissao, String interesses, double renda) {
        super(nome, endereco, telefone, cpf, sexo, estadoCivil);
        this.profissao = profissao;
        this.interesses = interesses;
        this.renda = renda;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return " =============== \nCliente: \n" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", interesses='" + interesses + '\'' +
                ", profissao='" + profissao + '\'' +
                ", estadoCivil=" + estadoCivil +
                ", renda=" + renda +
                "\n =============== \n";
    }
}

