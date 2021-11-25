package br.com.utfpr.mvc.control;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.application.JogadorEJBStatefullServices;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Inject;

/**
 * @author JuniorMartins
 */
@Named(value = "jogadorJSFSessionControl")
@SessionScoped
public class JogadorJSFSessionControl implements Serializable 
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1l;
    
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @EJB
    private JogadorEJBStatefullServices jogadorEJBStatefullServices;
    @Inject
    private Jogador jogador;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public JogadorJSFSessionControl(){}
    
    // ------------------------- MÉTODOS CONTROLADORES ------------------------- //
    public void salvarJogador()
    {jogadorEJBStatefullServices.salvar(jogador);}
    
    public void buscarPorId()
    {jogador = jogadorEJBStatefullServices.consultarPorId(jogador.getId(), jogador);}
    
    public void removerJogador()
    {jogadorEJBStatefullServices.remover(jogador);}
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public JogadorEJBStatefullServices geteJBStatefullServices() 
    {return jogadorEJBStatefullServices;}
    public void seteJBStatefullServices(JogadorEJBStatefullServices jogadorEJBStatefullServices) 
    {this.jogadorEJBStatefullServices = jogadorEJBStatefullServices;}
    public Jogador getJogador() 
    {return jogador;}
    public void setJogador(Jogador jogador) 
    {this.jogador = jogador;}
      
    
    
    
}
