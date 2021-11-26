package br.com.utfpr.presentation.control;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.application.JogoEJBStatefullServices;
import br.com.utfpr.webservices.domainmodel.Puzzle;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.stream.Stream;
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
   
    public void buscarPorId()
    {jogador = jogoEJBStatefullServices.consultarPorId(jogador.getId(), jogador);}
    
    public void removerJogador()
    {jogoEJBStatefullServices.remover(jogador);}
    
    public void gerarNumeroRandomico()
    {
        puzzle.setValor1(jogoEJBStatefullServices.gerarNumeroRandomico());  
        puzzle.setValor2(jogoEJBStatefullServices.gerarNumeroRandomico());
        puzzle.setSoma(puzzle.getValor1() + puzzle.getValor2());
    }
    
    public void verificarPalpite()
    {puzzle = jogoEJBStatefullServices.verificarPalpite(puzzle);}
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public JogoEJBStatefullServices geteJBStatefullServices() 
    {return jogoEJBStatefullServices;}
    public void seteJBStatefullServices(JogoEJBStatefullServices jogoEJBStatefullServices) 
    {this.jogoEJBStatefullServices = jogoEJBStatefullServices;}
    public Jogador getJogador() 
    {return jogador;}
    public void setJogador(Jogador jogador) 
    {this.jogador = jogador;}
      
    
    
    
}
