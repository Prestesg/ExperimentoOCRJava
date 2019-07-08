package backend.experimentoocrjava.Models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "emocoes")
public class Emocoes extends AbstractEntity {
    private int Nome;

    public Emocoes() {
    }

    public Emocoes(int Nome) {
        this.Nome = Nome;
    }

    public int getNome() {
        return this.Nome;
    }

    public void setNome(int Nome) {
        this.Nome = Nome;
    }

    public Emocoes Nome(int Nome) {
        this.Nome = Nome;
        return this;
    }
}