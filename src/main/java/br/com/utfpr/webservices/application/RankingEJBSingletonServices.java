package br.com.utfpr.webservices.application;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.infrastructure.JogadorPersistencia;
import java.util.stream.Stream;
import javax.ejb.Singleton;
import javax.inject.Inject;

/**
 * @author JuniorMartins
 */
@Singleton
public class RankingEJBSingletonServices 
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @Inject
    private JogadorPersistencia jogadorPersist;
    
    // -------------------- MÉTODOS DE SERVIÇO -------------------- //
    public Stream<Jogador> buscarRanking()
    {return jogadorPersist.buscarRanking();} 




}



