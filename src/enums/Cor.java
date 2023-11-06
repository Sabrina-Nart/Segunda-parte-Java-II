
package enums;


public enum Cor {
   
    AZ("Azul"),
    BR("Branco"),
    PR("Preto"),
    CZ("Cinza"),
    PA("Prata"),
    CU("Custom"),
    VR("Vermelho");
    
    private String descricao;

    private Cor(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
    
}
