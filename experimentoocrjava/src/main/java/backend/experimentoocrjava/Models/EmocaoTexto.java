package backend.experimentoocrjava.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "emocao_texto")
public class EmocaoTexto extends AbstractEntity {

    private int IDImagem_texto ;
    private int IDEmocao;

    public EmocaoTexto() {
    }

    public EmocaoTexto(int IDImagem_texto, int IDEmocao) {
        this.IDImagem_texto = IDImagem_texto;
        this.IDEmocao = IDEmocao;
    }

    public int getIDImagem_texto() {
        return this.IDImagem_texto;
    }

    public void setIDImagem_texto(int IDImagem_texto) {
        this.IDImagem_texto = IDImagem_texto;
    }

    public int getIDEmocao() {
        return this.IDEmocao;
    }

    public void setIDEmocao(int IDEmocao) {
        this.IDEmocao = IDEmocao;
    }

    public EmocaoTexto IDImagem_texto(int IDImagem_texto) {
        this.IDImagem_texto = IDImagem_texto;
        return this;
    }

    public EmocaoTexto IDEmocao(int IDEmocao) {
        this.IDEmocao = IDEmocao;
        return this;
    }
}