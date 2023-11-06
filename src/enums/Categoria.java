
package enums;

public enum Categoria {
    
    HA("Hatch"),
    SE("Sedan"),
    SU("SUV"),
    SW("Station Wagon"),
    UT("Utilitário");
    
    private String descricao;

    private Categoria(String descricao) {
        this.descricao = descricao;
    }
////////////////
    
    @Override
    public String toString() {
        return descricao;
    }
 
}
