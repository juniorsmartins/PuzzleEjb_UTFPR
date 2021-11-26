package br.com.utfpr.webservices.infrastructure;

import br.com.utfpr.webservices.domainmodel.Jogador;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author JuniorMartins
 */
public class Ranking
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    private static Map<String, Jogador> mapaJogadores = new TreeMap<>();
     
    // ------------------------- MÉTODOS AUXILIARES ------------------------- //
    public static void gerarBaseDadosJogadores()
    {
        Jogador j1 = new Jogador("999.999.999-99", "Pedro");
        j1.setPontos(8);
        mapaJogadores.put(j1.getCpf(), j1);

        Jogador j2 = new Jogador("444.555.777-66", "Maria");
        j2.setPontos(8);
        mapaJogadores.put(j2.getCpf(), j2);

        Jogador j3 = new Jogador("888.111.222-77", "Karla");
        j3.setPontos(8);
        mapaJogadores.put(j3.getCpf(), j3);
    }
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public static Map<String, Jogador> getMapaJogadores() 
    {return mapaJogadores;}
    public static void setMapaJogadores(Map<String, Jogador> mapaJogadores) 
    {Ranking.mapaJogadores = mapaJogadores;}
    
    
    
}



