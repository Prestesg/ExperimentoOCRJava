package backend.experimentoocrjava.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "imagens_texto")
public class ImagensTexto extends AbstractEntity {

    private String Texto ;
    private int Parte_texto ;
    private int IDImagem ;
    
    public ImagensTexto() {
    }

    public ImagensTexto(String Texto, int Parte_texto, int IDImagem, Imagens imagem) {
        this.Texto = Texto;
        this.Parte_texto = Parte_texto;
        this.IDImagem = IDImagem;
    }

    public String getTexto() {
        return this.Texto;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }

    public int getParte_texto() {
        return this.Parte_texto;
    }

    public void setParte_texto(int Parte_texto) {
        this.Parte_texto = Parte_texto;
    }

    public int getIDImagem() {
        return this.IDImagem;
    }

    public void setIDImagem(int IDImagem) {
        this.IDImagem = IDImagem;
    }

    public ImagensTexto Texto(String Texto) {
        this.Texto = Texto;
        return this;
    }

    public ImagensTexto Parte_texto(int Parte_texto) {
        this.Parte_texto = Parte_texto;
        return this;
    }

    public ImagensTexto IDImagem(int IDImagem) {
        this.IDImagem = IDImagem;
        return this;
    }

}