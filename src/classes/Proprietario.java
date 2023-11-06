
package classes;

import abstratas.Pessoa;

public class Proprietario extends Pessoa{

    private String email;

    public Proprietario(){
        super();
        this.setEmail("email@dominio.com.br");
    }
    
    public Proprietario(String nome, String endereco, String CPF, String telefone, String email) {
        super(nome, endereco, CPF, telefone);
        this.setEmail(email);
    }
    
//////////////////
    
    public void setEmail(String email) {
        this.email = email.toLowerCase();
    }
    
//////////////////
    
    public String getEmail() {
        return this.email;
    }
    
//////////////////    
    
}
