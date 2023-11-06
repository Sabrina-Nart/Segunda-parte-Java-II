
package classes;

import abstratas.Item;

public class Servico extends Item{ //Classe Polimorfica
    
    private int minutos;
    
    public Servico(){
        super();
        this.setMinutos(1);
    }

    public Servico(String nome, double valor, int minutos) {
        super();
        this.setMinutos(minutos);
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos < 1 ? 1 : minutos;
    }

    public int getMinutos() {
        return this.minutos;
    }    
    
    
}
