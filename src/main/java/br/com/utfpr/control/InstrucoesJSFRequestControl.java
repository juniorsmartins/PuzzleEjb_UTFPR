package br.com.utfpr.control;

import br.com.utfpr.model.services.InstrucoesEJBStatelessServices;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 * @author JuniorMartins
 */
@Named(value = "instrucoesJSFRequestControl")
@RequestScoped
public class InstrucoesJSFRequestControl implements Serializable
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1l;

    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @EJB
    InstrucoesEJBStatelessServices instrucoesEJBStatelessServices;

    // ------------------------- CONSTRUTORES ------------------------- //
    public InstrucoesJSFRequestControl(){}

    // ------------------------- MÉTODOS CONTROLADORES ------------------------- //
    public String buscarInstrucoes(Integer num)
    {return instrucoesEJBStatelessServices.buscarInstrucoes(num);}
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO --------------------
    public InstrucoesEJBStatelessServices getInstrucoesEJBStatelessServices() 
    {return instrucoesEJBStatelessServices;}
    public void setInstrucoesEJBStatelessServices(InstrucoesEJBStatelessServices instrucoesEJBStatelessServices) 
    {this.instrucoesEJBStatelessServices = instrucoesEJBStatelessServices;}
  
    
    
}





