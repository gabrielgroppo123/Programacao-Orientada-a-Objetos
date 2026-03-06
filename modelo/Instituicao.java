package poo.gestaoescolar.modelo;

public class Instituicao {
    private Long id;
    private String cnpnj;
    private String nome;
    private String endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpnj() {
        return cnpnj;
    }

    public void setCnpnj(String cnpnj) {
        this.cnpnj = cnpnj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
