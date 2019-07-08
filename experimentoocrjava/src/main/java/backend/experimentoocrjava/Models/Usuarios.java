package backend.experimentoocrjava.Models;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios extends AbstractEntity {

    private String nome  ;
    private String email  ;
    private String senha  ;
    private String imagem ;
    
    public Usuarios() {
    }

    public Usuarios(String nome, String email, String senha, String imagem) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.imagem = imagem;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Usuarios nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Usuarios email(String email) {
        this.email = email;
        return this;
    }

    public Usuarios senha(String senha) {
        this.senha = senha;
        return this;
    }

    public Usuarios imagem(String imagem) {
        this.imagem = imagem;
        return this;
    }
}