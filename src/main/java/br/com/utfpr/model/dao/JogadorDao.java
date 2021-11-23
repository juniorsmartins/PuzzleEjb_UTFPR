package br.com.utfpr.model.dao;

import br.com.utfpr.model.entity.Jogador;
import javax.persistence.EntityManager;

/**
 * @author JuniorMartins
 */
public class JogadorDao 
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    private EntityManager entityManager;

    // ------------------------- CONSTRUTORES ------------------------- //
    public JogadorDao(EntityManager entityManager)
    {this.entityManager = entityManager;}
    
    // ------------------------- MÉTODOS DE PERSISTÊNCIA ------------------------- //
    public void salvar(Jogador jogador) throws Exception
    {
        if(jogador.getId() == null)
        {
            entityManager.persist(jogador);
        } else
        {
            if(!entityManager.contains(jogador))
            {
                if(entityManager.find(Jogador.class, jogador.getId()) == null)
                {throw new Exception("Erro ao atualizar");}
            }
            entityManager.merge(jogador);
        }
    }
    
    public Jogador consultarPorId(Long id)
    {return entityManager.find(Jogador.class, id);}

    public void remover(Long id)
    {
        Jogador jogador = consultarPorId(id);
        entityManager.remove(jogador);
    }
    
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    
    
    
}





