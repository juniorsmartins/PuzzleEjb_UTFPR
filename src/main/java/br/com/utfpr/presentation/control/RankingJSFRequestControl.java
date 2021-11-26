package br.com.utfpr.presentation.control;

import br.com.utfpr.webservices.application.RankingEJBSingletonServices;
import br.com.utfpr.webservices.domainmodel.Jogador;
import java.io.Serializable;
import java.util.stream.Stream;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 * @author JuniorMartins
 */
@Named(value = "rankingJSFRequestControl")
@RequestScoped
public class RankingJSFRequestControl implements Serializable
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1l;
    
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @EJB
    private RankingEJBSingletonServices rankingEJBSingletonServices;   
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public RankingJSFRequestControl() {}
    
    // ------------------------- MÉTODOS CONTROLADORES ------------------------- //
    public Stream<Jogador> buscarRanking()
    {return rankingEJBSingletonServices.buscarRanking();}
}
