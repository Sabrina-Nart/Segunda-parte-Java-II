
package classes;

import abstratas.Item;
import java.time.LocalDate;
import java.util.LinkedList;

public class OrdemServico {

    //Relacionamento muito para muitos
    private int numero; //Aquilo que é único
    private LocalDate data;
    private Veiculo veiculo;
    private Mecanico mecanico;
    private LinkedList<Item> itens = new LinkedList<>();//Cada ordem de serviço tem uma lista
    
//////////////////
    
    public OrdemServico(){
        this.setNumero(0);
        this.setData(LocalDate.now());
        this.setVeiculo(null);
        this.setMecanico(null);
    }

    public OrdemServico(int numero, LocalDate data, Veiculo veiculo, Mecanico mecanico) {
        this.setNumero(numero);
        this.setData(data);
        this.setVeiculo(veiculo);
        this.setMecanico(mecanico);
    }
    
//////////////////
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
    
//////////////////   

    public int getNumero() {
        return this.numero;
    }

    public LocalDate getData() {
        return this.data;
    }

    public Veiculo getVeiculo() {
        return this.veiculo;
    }

    public Mecanico getMecanico() {
        return this.mecanico;
    }

    public LinkedList<Item> getItens() {
        return this.itens;
    }

//////////////////      

    @Override
    public String toString() {
        return this.numero + " => " + this.data + " => " + this.veiculo;
    }
//////////////////     
}
