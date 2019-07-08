package backend.experimentoocrjava.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "classificacao_texto")
public class ClassificacaoTexto extends AbstractEntity {

    private int IDImagem_texto ;
    private int IDUsuario ;
    private int Nota ;

    public ClassificacaoTexto() {
    }

    public ClassificacaoTexto(int IDImagem_texto, int IDUsuario, int Nota) {
        this.IDImagem_texto = IDImagem_texto;
        this.IDUsuario = IDUsuario;
        this.Nota = Nota;
    }

    public int getIDImagem_texto() {
        return this.IDImagem_texto;
    }

    public void setIDImagem_texto(int IDImagem_texto) {
        this.IDImagem_texto = IDImagem_texto;
    }

    public int getIDUsuario() {
        return this.IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public int getNota() {
        return this.Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }

    public ClassificacaoTexto IDImagem_texto(int IDImagem_texto) {
        this.IDImagem_texto = IDImagem_texto;
        return this;
    }

    public ClassificacaoTexto IDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
        return this;
    }

    public ClassificacaoTexto Nota(int Nota) {
        this.Nota = Nota;
        return this;
    }


}