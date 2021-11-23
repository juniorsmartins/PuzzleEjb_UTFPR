package br.com.utfpr.control;

import br.com.utfpr.model.services.EJBStatelessServices;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

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


    
}



