
package abstratas;

import classes.Marca;
import classes.Mecanico;
import classes.Modelo;
import classes.Peca;
import classes.Proprietario;
import classes.Servico;
import classes.Veiculo;
import enums.Categoria;
import enums.Cor;
import enums.Setor;
import enums.Unidade;
import java.time.LocalDate;
import java.time.Month;

abstract public class popularListas {

    public static void addObjetos(){
        //Método pronto para ser usado
        //cria objetos do t5ipo marca e toda vez que chamar, já existe valores
        
        //CRIAR OBJETOS MARCA
        Marca marca1 = new Marca("ford");
        Marca marca2 = new Marca("volks");
        Marca marca3 = new Marca("fiat");
        Marca marca4 = new Marca("honda");
        Marca marca5 = new Marca("gm");
        Marca marca6 = new Marca("chevrolet");
        Marca marca7 = new Marca("mitsubishi");
        
        //Para hora que estiver criando os modelos, saber a marca
        //Tudo o que estiver fazendo aqui, não vai precissar fazer depois
        Modelo modelo1 = new Modelo("ka", marca1, Categoria.HA);
        Modelo modelo2 = new Modelo("uno", marca3, Categoria.HA);
        Modelo modelo3 = new Modelo("onix", marca5, Categoria.SE);
        Modelo modelo4 = new Modelo("civic", marca4, Categoria.SE);
        Modelo modelo5 = new Modelo("tracker", marca5, Categoria.SU);
        
        //criar objetos Mecanico
        Mecanico mecanico1 = new Mecanico("José", "Nova Veneza", "589.895.854-86", "(48)98556-58521", LocalDate.of(2000, 10, 15), Setor.ELE);
        Mecanico mecanico2 = new Mecanico("Algusto", "Caravaggio", "859.895.552-55", "(48)98556-5891", LocalDate.of(2010, 07, 04), Setor.FUN);
        Mecanico mecanico3 = new Mecanico("Bernardo", "Siderópolis", "999.895.854-58", "(48)98556-5889", LocalDate.of(2011, 02, 03), Setor.INJ);
        Mecanico mecanico4 = new Mecanico("Mário", "Criciúma", "666.777.854-25", "(48)98556-5858", LocalDate.of(2000, 10, 15), Setor.MEC);
        Mecanico mecanico5 = new Mecanico("Enzo", "Rincão", "555.895.658-85", "(48)98556-5484", LocalDate.of(2003, 11, 11), Setor.INJ);
        
        //criar objetos do tipo Proprietario
        Proprietario p1 = new Proprietario("Mário de Andrade", "Nova Veneza", "589.255.555-58", "(48)25658-5895", "mario@gmail.com");
        Proprietario p2 = new Proprietario("Bernado", "Caravaggio", "222.255.888-58", "(48)85812-2825", "Bernardo@gmail.com");
        Proprietario p3 = new Proprietario("Ricardo", "Siderópolis", "589.255.555-58", "(48)37825-5482", "ricardo@gmail.com"); 
        Proprietario p4 = new Proprietario("Mária Joaquina", "Criciúma", "554.785.358-58", "(48)24895-2458", "mariaJoaquina@gmail.com");
        Proprietario p5 = new Proprietario("Frederico", "Rincão", "589.255.555-99", "(48)28952-5898", "frederico@gmail.com");

        Veiculo v1 = new Veiculo("AAA0000", "1234567890123456", 2020, 61000, Cor.AZ, modelo1, p1);
        Veiculo v2 = new Veiculo("BBB0000", "1234567890123456", 2021, 62000, Cor.CU, modelo2, p2);
        Veiculo v3 = new Veiculo("CCC0000", "1234567890123456", 2022, 63000, Cor.PA, modelo3, p3);
        Veiculo v4 = new Veiculo("DDD0000", "1234567890123456", 2023, 64000, Cor.BR, modelo4, p4);
        Veiculo v5 = new Veiculo("EEE0000", "1234567890123456", 2019, 65000, Cor.PR, modelo5, p5);
        
        Servico s1 = new Servico("SERVICO 1", 1560.51, 40);
        Servico s2 = new Servico("SERVICO 2", 1550.51, 50);
        Servico s3 = new Servico("SERVICO 3", 1540.51, 60);
        Servico s4 = new Servico("SERVICO 4", 1530.51, 70);
        Servico s5 = new Servico("SERVICO 5", 1520.51, 80);
        
        Peca pe1 = new Peca("oleo",20,Unidade.LT,20); //String nome, double valor,Unidade unidade, double estoque
        Peca pe2 = new Peca("motor",1500,Unidade.UND,60);
        Peca pe3 = new Peca("palheta",60,Unidade.LT,40);
        Peca pe4 = new Peca("estopa",5,Unidade.LT,100);
        Peca pe5 = new Peca("parabrisa",200,Unidade.LT,15);
        
        //Adicionar os objetos nas listas
        Listas.getListaMarca().add(marca1);
        Listas.getListaMarca().add(marca2);
        Listas.getListaMarca().add(marca3);
        Listas.getListaMarca().add(marca4);
        Listas.getListaMarca().add(marca5);
        Listas.getListaMarca().add(marca6);
        Listas.getListaMarca().add(marca7); 
        
        //Assim estão todos armazenados
        Listas.getListaModelo().add(modelo1);
        Listas.getListaModelo().add(modelo2);
        Listas.getListaModelo().add(modelo3);
        Listas.getListaModelo().add(modelo4);
        Listas.getListaModelo().add(modelo5);   
        
        Listas.getListaMecanico().add(mecanico1);
        Listas.getListaMecanico().add(mecanico2);
        Listas.getListaMecanico().add(mecanico3);
        Listas.getListaMecanico().add(mecanico4);
        Listas.getListaMecanico().add(mecanico5);
        
        Listas.getListaProprietario().add(p1);
        Listas.getListaProprietario().add(p2);
        Listas.getListaProprietario().add(p3);
        Listas.getListaProprietario().add(p4);
        Listas.getListaProprietario().add(p5);
        
        Listas.getListaVeiculo().add(v1);
        Listas.getListaVeiculo().add(v2);
        Listas.getListaVeiculo().add(v3);
        Listas.getListaVeiculo().add(v4);
        Listas.getListaVeiculo().add(v5);
        
        Listas.getListaServico().add(s1);
        Listas.getListaServico().add(s2);
        Listas.getListaServico().add(s3);
        Listas.getListaServico().add(s4);
        Listas.getListaServico().add(s5);
        
        Listas.getListaPeca().add(pe1);
        Listas.getListaPeca().add(pe2);
        Listas.getListaPeca().add(pe3);
        Listas.getListaPeca().add(pe4);
        Listas.getListaPeca().add(pe5);
    }
    
}
