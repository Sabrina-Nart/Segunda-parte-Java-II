
package classes;

import abstratas.Pessoa;
import enums.Setor;
import java.time.LocalDate;
import java.time.Month;

public class Mecanico extends Pessoa{

    private LocalDate admissao;
    private Setor setor;

    public Mecanico(){
        this.setAdmissao(null);
        this.setSetor(setor.ELE);
    }
    
    public Mecanico(String nome, String endereco, String CPF, String telefone, LocalDate admissao, Setor setor) {
        super(nome, endereco, CPF, telefone);
        this.setAdmissao(admissao);
        this.setSetor(setor);
    }
    
//////////////////
    
    public void setAdmissao(LocalDate admissao) {
        this.admissao = admissao == null ? LocalDate.of(1980, Month.JANUARY, 1) : admissao; 
        //Todo mundo tem uma dada de admissão, mas nem todo mundo tem uma de demissão
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    
//////////////////
    
    public LocalDate getAdmissao() {
        return this.admissao;
    }

    public Setor getSetor() {
        return this.setor;
    }
    
//////////////////
    
    @Override
    public String toString(){
        return super.getNome() + "->" + this.setor;
    }
}
