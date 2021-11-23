package br.com.utfpr.control;

import br.com.utfpr.model.entity.Jogador;
import br.com.utfpr.model.services.EJBStatefullServices;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Inject;

/**
 * @author JuniorMartins
 */
@Named(value = "jSFSessionControl")
@SessionScoped
public class JSFSessionControl implements Serializable 
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1l;
    
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @EJB
    private EJBStatefullServices eJBStatefullServices;
    @Inject
    private Jogador jogador;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public JSFSessionControl(){}
    
    // ------------------------- MÉTODOS CONTROLADORES ------------------------- //
    public void salvarJogador()
    {
        eJBStatefullServices.salvarJogador(jogador.getCpf(), jogador.getNome());
    }
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public EJBStatefullServices geteJBStatefullServices() 
    {return eJBStatefullServices;}
    public void seteJBStatefullServices(EJBStatefullServices eJBStatefullServices) 
    {this.eJBStatefullServices = eJBStatefullServices;}
    public Jogador getJogador() 
    {return jogador;}
    public void setJogador(Jogador jogador) 
    {this.jogador = jogador;}
      
    
    
    
}
