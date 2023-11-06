
package enums;

public enum Setor {

    MEC("Mecânica"),
    ELE("Elétrica"),
    INJ("Injeção Eleterônica"),
    FUN("Funilaria e Pintura");
    
    private String descricao;

    private Setor(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
   
}
