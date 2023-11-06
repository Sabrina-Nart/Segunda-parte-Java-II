
package classes;

import enums.Cor;

public class Veiculo {

    private String placa;
    private String chassi;
    private int anoModelo;
    private int odometro;
    private Cor cor;
    private Modelo modelo;
    private Proprietario proprietario;

    public Veiculo() {
        this.setPlaca("AAA0000");
        this.setChassi("00000000000000000");
        this.setAnoModelo(1920);
        this.setOdometro(0);
        this.setCor(Cor.CZ);
        this.setModelo(null);
        this.setProprietario(null);
    }
    
    public Veiculo(String placa, String chassi, int anoModelo, int odometro, Cor cor, Modelo modelo, Proprietario proprietario) {
        this.setPlaca(placa);//Quando deixa sem set e etc, nada impede que venha um valor negativo, por exemplo
        this.setChassi(chassi);//Se quer realmente ter validação
        this.setAnoModelo(anoModelo);
        this.setOdometro(odometro);
        this.setCor(cor);
        this.setModelo(modelo);
        this.setProprietario(proprietario);
    }

    public void setPlaca(String placa) {
        this.placa = placa.trim().isEmpty() ? "AAA0000" : placa.toUpperCase();
    }

    public void setChassi(String chassi) {
        this.chassi = chassi.trim().isEmpty() ? "00000000000000000" : chassi.toUpperCase();
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo < 1920 ? 1920 : anoModelo;
    }

    public void setOdometro(int odometro) {
        this.odometro = odometro < 0 ? 0 : odometro;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void setModelo(Modelo modelo) {//Dois possíveis estados de um objeto
        this.modelo = modelo == null ? new Modelo() : modelo;//Ou é nulo ou diferente de nulo
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario == null ? new Proprietario() : proprietario;
    }
    
////////////////

    public String getPlaca() {
        return this.placa;
    }

    public String getChassi() {
        return this.chassi;
    }

    public int getAnoModelo() {
        return this.anoModelo;
    }

    public int getOdometro() {
        return this.odometro;
    }

    public Cor getCor() {
        return this.cor;
    }

    public Modelo getModelo() {
        return this.modelo;
    }

    public Proprietario getProprietario() {
        return this.proprietario;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", modelo=" + modelo + ", proprietario=" + proprietario + '}';
    }
    
////////////////
    
}
