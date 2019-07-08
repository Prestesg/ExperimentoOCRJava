package backend.experimentoocrjava.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "edicao_classificacao")
public class EdicaoClassificacao extends AbstractEntity {

    private int IDClassificacao_emocao ;
    private String Texto_edit ;

    public EdicaoClassificacao() {
    }

    public EdicaoClassificacao(int IDClassificacao_emocao, String Texto_edit) {
        this.IDClassificacao_emocao = IDClassificacao_emocao;
        this.Texto_edit = Texto_edit;
    }

    public int getIDClassificacao_emocao() {
        return this.IDClassificacao_emocao;
    }

    public void setIDClassificacao_emocao(int IDClassificacao_emocao) {
        this.IDClassificacao_emocao = IDClassificacao_emocao;
    }

    public String getTexto_edit() {
        return this.Texto_edit;
    }

    public void setTexto_edit(String Texto_edit) {
        this.Texto_edit = Texto_edit;
    }

    public EdicaoClassificacao IDClassificacao_emocao(int IDClassificacao_emocao) {
        this.IDClassificacao_emocao = IDClassificacao_emocao;
        return this;
    }

    public EdicaoClassificacao Texto_edit(String Texto_edit) {
        this.Texto_edit = Texto_edit;
        return this;
    }
}