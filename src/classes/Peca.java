
package classes;

import abstratas.Item;
import enums.Unidade;

public class Peca extends Item{
    
    private Unidade unidade;
    private double estoque;
   //
    public Peca(){
        super();
        this.setUnidade(unidade.UND);
        this.setEstoque(0);
    }
    public Peca(String nome, double valor,Unidade unidade, double estoque){
        super(nome,valor);
        this.setUnidade(unidade);
        this.setEstoque(estoque);
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }
    public Unidade getUnidade() {
        return this.unidade;
    }
    public double getEstoque() {
        return this.estoque;
    }
}
