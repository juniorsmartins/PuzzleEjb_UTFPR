package br.com.utfpr.webservices.application;

import java.util.Random;
import javax.ejb.Singleton;

/**
 * @author JuniorMartins
 */
@Singleton
public class NumerosRandomicosEJBSingletonServices 
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1l;
    
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public NumerosRandomicosEJBSingletonServices(){}
    
    // ------------------------- MÉTODOS DE SERVIÇO  ------------------------- //
    public Integer gerarNumeroRandomico()
    {
        Random ran = new Random();
        return ran.nextInt(100);
    }
    

}




