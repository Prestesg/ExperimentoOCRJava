    package backend.experimentoocrjava.Models;

    import javax.persistence.Entity;
    import javax.persistence.Table;
    
    @Entity
    @Table(name = "classificacao_emocao")
    public class ClassificacaoEmocao extends AbstractEntity {
    
        private int IDTexto_emocao ;
        private int IDUsuario ;
        private int Nota ;
    

    public ClassificacaoEmocao() {
    }

    public ClassificacaoEmocao(int IDTexto_emocao, int IDUsuario, int Nota) {
        this.IDTexto_emocao = IDTexto_emocao;
        this.IDUsuario = IDUsuario;
        this.Nota = Nota;
    }

    public int getIDTexto_emocao() {
        return this.IDTexto_emocao;
    }

    public void setIDTexto_emocao(int IDTexto_emocao) {
        this.IDTexto_emocao = IDTexto_emocao;
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

    public ClassificacaoEmocao IDTexto_emocao(int IDTexto_emocao) {
        this.IDTexto_emocao = IDTexto_emocao;
        return this;
    }

    public ClassificacaoEmocao IDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
        return this;
    }

    public ClassificacaoEmocao Nota(int Nota) {
        this.Nota = Nota;
        return this;
    }

}