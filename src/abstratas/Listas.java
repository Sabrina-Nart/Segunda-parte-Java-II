
package abstratas;

import classes.Marca;
import classes.Mecanico;
import classes.Modelo;
import classes.OrdemServico;
import classes.Peca;
import classes.Proprietario;
import classes.Servico;
import classes.Veiculo;
import java.util.LinkedList;

abstract public class Listas {
    
    private static LinkedList<Marca> listaMarca = new LinkedList<>();
    private static LinkedList<Modelo> listaModelo = new LinkedList<>();
    private static LinkedList<Mecanico> listaMecanico = new LinkedList<>();
    private static LinkedList<Proprietario> listaProprietario = new LinkedList<>();
    private static LinkedList<Veiculo> listaVeiculo = new LinkedList();
    private static LinkedList<Servico> listaServico = new LinkedList();
    private static LinkedList<Peca> listaPeca = new LinkedList();
    private static LinkedList<OrdemServico> listaOrdemServico = new LinkedList();

    public static LinkedList<Marca> getListaMarca() {
        return listaMarca;
    }

    public static LinkedList<Modelo> getListaModelo() {
        return listaModelo;
    }
    
    public static LinkedList<Mecanico> getListaMecanico() {
        return listaMecanico;
    }
    
    public static LinkedList<Proprietario> getListaProprietario() {
        return listaProprietario;
    }
    
    public static LinkedList<Veiculo> getListaVeiculo() {
        return listaVeiculo;
    }
    
    public static LinkedList<Servico> getListaServico() {
        return listaServico;
    }
    
    public static LinkedList<Peca> getListaPeca() {
        return listaPeca;
    }
 
    public static LinkedList<OrdemServico> getListaOrdemServico() {
        return listaOrdemServico;
    }    
}
