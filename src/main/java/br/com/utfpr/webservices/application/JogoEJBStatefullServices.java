package br.com.utfpr.webservices.application;

import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.infrastructure.JogadorPersistencia;
import java.util.stream.Stream;
import javax.ejb.Stateful;
import javax.inject.Inject;

/**
 * @author JuniorMartins
 */
@Stateful
public class JogoEJBStatefullServices
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @Inject
    private JogadorPersistencia jogadorPersist;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public JogoEJBStatefullServices(){}
    
    // ------------------------- MÉTODOS DE SERVIÇO ------------------------- //
    public void salvar(Jogador jogador) 
    {
        jogadorPersist.salvar(jogador);
        System.out.println(jogador);
    }
    
    public Jogador consultarPorId(Long id, Jogador jogador) 
    {return jogadorPersist.consultarPorId(id, jogador);}
    
    public void remover(Jogador jogador) 
    {
        System.out.println("Removido: " + jogador);
        jogadorPersist.remover(jogador);
    }

    
    
    
}
