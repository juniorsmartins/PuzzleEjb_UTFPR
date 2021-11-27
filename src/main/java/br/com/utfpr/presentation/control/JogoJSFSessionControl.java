package br.com.utfpr.presentation.control;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.application.JogoEJBStatefullServices;
import br.com.utfpr.webservices.domainmodel.Puzzle;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Inject;

/**
 * @author JuniorMartins
 */
@Named(value = "jogoJSFSessionControl")
@SessionScoped
public class JogoJSFSessionControl implements Serializable 
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1l;
    
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @EJB
    private JogoEJBStatefullServices jogoEJBStatefullServices;
    @Inject
    private Jogador jogador;
    @Inject
    private Puzzle puzzle;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public JogoJSFSessionControl(){}
    
    // ------------------------- MÉTODOS CONTROLADORES ------------------------- //
    public String salvarJogador()
    {
        jogoEJBStatefullServices.salvar(jogador);
        return "puzzle";
    }
    
    public void removerJogador()
    {jogoEJBStatefullServices.remover(jogador);}
    
    public void gerarNumeroRandomico()
    {
        puzzle.setValor1(jogoEJBStatefullServices.gerarNumeroRandomico());  
        puzzle.setValor2(jogoEJBStatefullServices.gerarNumeroRandomico());
        puzzle.setSoma(puzzle.getValor1() + puzzle.getValor2());
        puzzle.setResultado(" ");
    }
    
    public void verificarPalpite()
    {
        puzzle = jogoEJBStatefullServices.verificarPalpite(puzzle);
        if(puzzle.getResultado().equalsIgnoreCase("Correto"))
        {jogador.setPontos(jogador.getPontos() + 1);}
    }
    
    public String sairSessao()
    {return jogoEJBStatefullServices.sairSessao();}
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public JogoEJBStatefullServices getJogoEJBStatefullServices() 
    {return jogoEJBStatefullServices;}
    public void setJogoEJBStatefullServices(JogoEJBStatefullServices jogoEJBStatefullServices) 
    {this.jogoEJBStatefullServices = jogoEJBStatefullServices;}
    public Jogador getJogador() 
    {return jogador;}
    public void setJogador(Jogador jogador) 
    {this.jogador = jogador;}
    public Puzzle getPuzzle() 
    {return puzzle;}
    public void setPuzzle(Puzzle puzzle) 
    {this.puzzle = puzzle;}
        
    
    
    
}
