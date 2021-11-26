package br.com.utfpr.webservices.application;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.infrastructure.Ranking;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.ejb.Singleton;

/**
 * @author JuniorMartins
 */
@Singleton
public class RankingEJBSingletonServices 
{
    // -------------------- MÉTODOS DE SERVIÇO -------------------- //
    public Stream<Jogador> buscarRanking()
    {return Ranking.getMapaJogadores().values().stream().sorted(Comparator.comparing(Jogador::getPontos));}



}



