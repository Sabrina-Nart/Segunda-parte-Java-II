
package abstratas;

abstract public class Item extends Dados{
    
    private double valor;
    
    public Item(){
        super();
        this.setValor(0.01);
    }
    
    public Item(String nome, double valor){
        super(nome);
        this.setValor(valor);
    }

    public void setValor(double valor) {
        this.valor = valor <= 0 ? 0.01 : valor;
    }

    public double getValor() {
        return this.valor;
    }   
}
