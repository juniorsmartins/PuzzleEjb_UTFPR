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
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public static List<Jogador> getListaJogadores() 
    {return listaJogadores;}
    public static void setListaJogadores(List<Jogador> listaJogadores) 
    {Ranking.listaJogadores = listaJogadores;}
    
    
}



