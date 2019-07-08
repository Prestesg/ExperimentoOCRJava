package backend.experimentoocrjava.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "imagens")
public class Imagens extends AbstractEntity {

    private int IDUsuario;
    private String Link ;
    private int IDImagem_Origem ;
    private int IDImagem_Destino ;

    public Imagens() {
    }

    public Imagens(int ID, int IDUsuario, String Link, int IDImagem_Origem, int IDImagem_Destino) {
        this.IDUsuario = IDUsuario;
        this.Link = Link;
        this.IDImagem_Origem = IDImagem_Origem;
        this.IDImagem_Destino = IDImagem_Destino;
    }

    public Imagens(int IDUsuario, String Link, int IDImagem_Origem, int IDImagem_Destino, ImagensTexto Imagem_texto) {
        this.IDUsuario = IDUsuario;
        this.Link = Link;
        this.IDImagem_Origem = IDImagem_Origem;
        this.IDImagem_Destino = IDImagem_Destino;
   
    }

    public int getIDUsuario() {
        return this.IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getLink() {
        return this.Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public int getIDImagem_Origem() {
        return this.IDImagem_Origem;
    }

    public void setIDImagem_Origem(int IDImagem_Origem) {
        this.IDImagem_Origem = IDImagem_Origem;
    }

    public int getIDImagem_Destino() {
        return this.IDImagem_Destino;
    }

    public void setIDImagem_Destino(int IDImagem_Destino) {
        this.IDImagem_Destino = IDImagem_Destino;
    }


    public Imagens IDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
        return this;
    }

    public Imagens Link(String Link) {
        this.Link = Link;
        return this;
    }

    public Imagens IDImagem_Origem(int IDImagem_Origem) {
        this.IDImagem_Origem = IDImagem_Origem;
        return this;
    }

    public Imagens IDImagem_Destino(int IDImagem_Destino) {
        this.IDImagem_Destino = IDImagem_Destino;
        return this;
    }
}
