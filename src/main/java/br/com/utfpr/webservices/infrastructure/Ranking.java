package br.com.utfpr.webservices.infrastructure;

import br.com.utfpr.webservices.domainmodel.Jogador;
import java.util.LinkedList;
import java.util.List;

/**
 * @author JuniorMartins
 */
public class Ranking
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    private static List<Jogador> listaJogadores = new LinkedList<>();
     
    // ------------------------- MÉTODOS AUXILIARES ------------------------- //
    public static void gerarBaseDadosJogadores()
    {
        Jogador j1 = new Jogador("999.999.999-99", "Pedro");
        j1.setPontos(8);
        listaJogadores.stream().filter(jog -> (!jog.getCpf().equalsIgnoreCase(j1.getCpf()))).forEachOrdered(item -> {
            listaJogadores.add(j1);
        });

        Jogador j2 = new Jogador("444.555.777-66", "Maria");
        j2.setPontos(8);
        listaJogadores.stream().filter(jo -> (!jo.getCpf().equalsIgnoreCase(j2.getCpf()))).forEachOrdered(_item -> {
            listaJogadores.add(j2);
        });

        Jogador j3 = new Jogador("888.111.222-77", "Karla");
        j3.setPontos(8);
        listaJogadores.stream().filter(j -> (!j.getCpf().equalsIgnoreCase(j3.getCpf()))).forEachOrdered(__item -> {
            listaJogadores.add(j3);
        });
    }
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public static List<Jogador> getListaJogadores() 
    {return listaJogadores;}
    public static void setListaJogadores(List<Jogador> listaJogadores) 
    {Ranking.listaJogadores = listaJogadores;}
    
    
}



