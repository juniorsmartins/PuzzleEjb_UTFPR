package br.com.utfpr.control;

import br.com.utfpr.model.services.EJBStatefullServices;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;

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
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public JSFSessionControl(){}
    
}
