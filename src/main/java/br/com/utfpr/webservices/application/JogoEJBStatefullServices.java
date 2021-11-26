package br.com.utfpr.webservices.application;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.domainmodel.Puzzle;
import br.com.utfpr.webservices.infrastructure.Ranking;
import java.util.Random;
import javax.ejb.Stateful;

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
        Ranking.getListaJogadores().stream().filter(joga -> (joga.getCpf().equalsIgnoreCase(jogador.getCpf()))).map(joga -> {
            jogador.setPontos(jogador.getPontos() + joga.getPontos());
            return joga;
        }).forEachOrdered(joga -> {
            Ranking.getListaJogadores().remove(joga);
        });
        Ranking.getListaJogadores().add(jogador);
        System.out.println(jogador);
    }
    
//    public Jogador consultarPorId(Long id, Jogador jogador) 
//    {
//        return
//    )

    public void remover(Jogador jogador) 
    {
        Ranking.getListaJogadores().stream().filter(jog -> (jog.getCpf().equalsIgnoreCase(jogador.getCpf()))).forEachOrdered(jog -> {
            Ranking.getListaJogadores().remove(jogador);
        });
    }
    
    public Integer gerarNumeroRandomico()
    {
        Random ran = new Random();
        return ran.nextInt(100);
    }
    
    public Puzzle verificarPalpite(Puzzle puzzle)
    {
        if(puzzle.getPalpite() == puzzle.getSoma())
        {puzzle.setResultado("Acertou");}
        else
        {puzzle.setResultado("Errou");}
        puzzle.setPalpite(0);
        puzzle.setValor1(0);
        puzzle.setValor2(0);
        return puzzle;
    }
}
