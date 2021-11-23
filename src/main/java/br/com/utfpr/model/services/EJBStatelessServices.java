package br.com.utfpr.model.services;

import br.com.utfpr.model.entity.Instrucoes;
import javax.ejb.Stateless;

/**
 * @author JuniorMartins
 */
@Stateless
public class EJBStatelessServices 
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public EJBStatelessServices(){}
    
    // ------------------------- MÉTODOS DE SERVIÇO ------------------------- //    
    public Instrucoes buscarInstrucao()
    {
        Instrucoes instrucao = new Instrucoes("Olá, digite nome completo e CPF para ser direcionado ao jogo.");
        return instrucao;
    }
    
    
}





