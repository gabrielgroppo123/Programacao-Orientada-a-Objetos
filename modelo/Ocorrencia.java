package poo.gestaoescolar.modelo;

import java.util.Calendar;

public class Ocorrencia {
    private Aluno aluno;
    private Long id;
    private Funcionario relator;
    private TipoAcao acao;
    private TipoOcorrencia tipo;
    private Boolean privada;
    private Calendar data;
    private String descricao;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getRelator() {
        return relator;
    }

    public void setRelator(Funcionario relator) {
        this.relator = relator;
    }

    public TipoAcao getAcao() {
        return acao;
    }

    public void setAcao(TipoAcao acao) {
        this.acao = acao;
    }

    public TipoOcorrencia getTipo() {
        return tipo;
    }

    public void setTipo(TipoOcorrencia tipo) {
        this.tipo = tipo;
    }

    public Boolean getPrivada() {
        return privada;
    }

    public void setPrivada(Boolean privada) {
        this.privada = privada;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
