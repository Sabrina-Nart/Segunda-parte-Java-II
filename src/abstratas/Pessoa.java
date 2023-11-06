
package abstratas;

abstract public class Pessoa extends Dados{
    
    private String endereco;
    private String CPF;
    private String telefone;
    
    public Pessoa(){
        super();
        this.setEndereco("Vazio");
        this.setCpf("000.000.000-00");
        this.setTelefone("(00) 00000-0000");
    }

    public Pessoa(String nome, String endereco, String CPF, String telefone) {
        super(nome);
        this.setEndereco(endereco);
        this.setCpf(CPF);
        this.setTelefone(telefone);
    }
    
//////////////////
    
    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty() ? "VAZIO" : endereco;
    }

    public void setCpf(String CPF) {
        this.CPF = CPF.trim().isEmpty() ? "000.000.000-00" : CPF;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty() ? "(00) 00000-00000" : telefone;
    }
    
//////////////////
    
    public String getEndereco() {
        return this.endereco;
    }

    public String getCPF() {
        return this.CPF;
    }

    public String getTelefone() {
        return this.telefone;
    }
    
//////////////////    
    
}
