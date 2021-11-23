package br.com.utfpr.control;

import br.com.utfpr.model.entity.Instrucoes;
import br.com.utfpr.model.services.EJBStatelessServices;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 * @author JuniorMartins
 */
@Named(value = "jSFRequestControl")
@RequestScoped
public class JSFRequestControl 
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @EJB
    private EJBStatelessServices eJBStatelessServices;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public JSFRequestControl(){}

    // ------------------------- MÉTODOS CONTROLADORES ------------------------- //
    public Instrucoes buscarInstrucao()
    {
        return eJBStatelessServices.buscarInstrucao();
    }

    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public EJBStatelessServices geteJBStatelessServices() 
    {return eJBStatelessServices;}
    public void seteJBStatelessServices(EJBStatelessServices eJBStatelessServices) 
    {this.eJBStatelessServices = eJBStatelessServices;}
    
    
    
}



