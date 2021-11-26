package br.com.utfpr.webservices.application;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.domainmodel.Puzzle;
import br.com.utfpr.webservices.infrastructure.Ranking;
import java.util.Random;
import javax.ejb.Stateful;
import javax.inject.Inject;

/**
 * @author JuniorMartins
 */
@Stateful
public class JogoEJBStatefullServices
{ 
    // ------------------------- CONSTRUTORES ------------------------- //
    public JogoEJBStatefullServices(){}
    
    // ------------------------- MÉTODOS DE SERVIÇO ------------------------- //
    public void salvar(Jogador jogador) 
    {
        if(Ranking.getMapaJogadores().containsKey(jogador.getCpf()))
        {jogador.setPontos(jogador.getPontos() + Ranking.getMapaJogadores().get(jogador).getPontos());}
        Ranking.getMapaJogadores().put(jogador.getCpf(), jogador);
        System.out.println(jogador);
    }
    
    public Jogador consultarPorId(Long id, Jogador jogador) 
    {return Ranking.getMapaJogadores().getOrDefault(id, jogador);}
    
    public void remover(Jogador jogador) 
    {Ranking.getMapaJogadores().remove(jogador.getCpf(), jogador);}
    
    public Integer gerarNumeroRandomico()
    {
        Random ran = new Random();
        return ran.nextInt(100);
    }
    
    public Puzzle verificarPalpite(Puzzle puzzle)
    {
        if(puzzle.getPalpite() != puzzle.getSoma())
        {puzzle.setResultado("Errou");}
        else
        {puzzle.setResultado("Acertou");}
        return puzzle;
    }
}
