package br.com.utfpr.webservices.application;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.infrastructure.Ranking;
import java.util.Comparator;
import java.util.List;
import javax.ejb.Singleton;

/**
 * @author JuniorMartins
 */
@Singleton
public class RankingEJBSingletonServices 
{
    // -------------------- MÉTODOS DE SERVIÇO -------------------- //
    public List<Jogador> buscarRanking()
    {
        List<Jogador> listaOrdenada = Ranking.getListaJogadores();
        listaOrdenada.sort(Comparator.comparingInt(Jogador::getPontos).reversed());
        return listaOrdenada;
    }



}



