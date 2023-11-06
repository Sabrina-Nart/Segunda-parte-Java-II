
package abstratas;

abstract public class Dados {
 
    private String nome;

    public Dados() {
        this.setNome("VÁZIO");
    }
    
    public Dados(String nome){
        this.setNome(nome);
    }
    
//////////////////
    
    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "VÁZIO" : nome.toUpperCase();
    }
    
//////////////////
    
    public String getNome() {
        return this.nome;
    }
    
//////////////////
    
    @Override
    public String toString() {
        return nome;
    }    
    
}
