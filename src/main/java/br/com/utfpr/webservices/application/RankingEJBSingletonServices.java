package br.com.utfpr.webservices.application;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.infrastructure.Ranking;
import java.util.Comparator;
import java.util.LinkedList;
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
    {return (List<Jogador>) Ranking.getListaJogadores().stream().sorted(Comparator.comparing(Jogador::getPontos));}



}



