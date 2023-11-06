
package classes;

import abstratas.Dados;
import enums.Categoria;

public class Modelo extends Dados{

    private Marca marca; //porque todo modelo vai pertencer a uma marca
    private Categoria categoria;
    
    
    public Modelo(){
        super();
        this.setMarca(null);
        this.setCategoria(Categoria.HA);
    }

    public Modelo(String nome, Marca marca, Categoria categoria) {
        this.setNome(nome);
        this.setMarca(marca);
        this.setCategoria(categoria);
    }
    
//////////////////
    
    public void setMarca(Marca marca) {//Objetos ou são null ou não
        this.marca = marca==null ? new Marca() : marca;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
//////////////////
    
    public Marca getMarca() {
        return this.marca;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }
    
}
