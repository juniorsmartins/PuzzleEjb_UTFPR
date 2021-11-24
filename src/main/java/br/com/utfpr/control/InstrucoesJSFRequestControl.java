package br.com.utfpr.control;

import br.com.utfpr.model.services.InstrucoesEJBStatelessServices;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 * @author JuniorMartins
 */
@Named(value = "instrucoesJSFRequestControl")
@RequestScoped
public class InstrucoesJSFRequestControl 
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @EJB
    InstrucoesEJBStatelessServices instrucoesEJBStatelessServices;
    private String instrucoes;

    // ------------------------- CONSTRUTORES ------------------------- //
    public InstrucoesJSFRequestControl(){}

    // ------------------------- MÉTODOS CONTROLADORES ------------------------- //
    public void buscarInstrucoes(Integer num)
    {instrucoes = instrucoesEJBStatelessServices.buscarInstrucoes(num);}

    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO --------------------
    public InstrucoesEJBStatelessServices getInstrucoesEJBStatelessServices() 
    {return instrucoesEJBStatelessServices;}
    public void setInstrucoesEJBStatelessServices(InstrucoesEJBStatelessServices instrucoesEJBStatelessServices) 
    {this.instrucoesEJBStatelessServices = instrucoesEJBStatelessServices;}
    public String getInstrucoes() 
    {return instrucoes;}
    public void setInstrucoes(String instrucoes) 
    {this.instrucoes = instrucoes;}
    
    
    
}





