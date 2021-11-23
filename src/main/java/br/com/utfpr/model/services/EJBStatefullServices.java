package br.com.utfpr.model.services;

import br.com.utfpr.model.entity.Jogador;
import javax.ejb.Stateful;
import javax.inject.Inject;

/**
 * @author JuniorMartins
 */
@Stateful
public class EJBStatefullServices 
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //

    // ------------------------- CONSTRUTORES ------------------------- //
    public EJBStatefullServices(){}

    // ------------------------- MÉTODOS DE SERVIÇO ------------------------- //
    public void salvarJogador(String cpf, String nome)
    {
        Jogador jogador = new Jogador(cpf, nome);
        System.out.println(jogador);
    }
    
    
    
}
