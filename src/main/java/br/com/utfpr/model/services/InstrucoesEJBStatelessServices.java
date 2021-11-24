package br.com.utfpr.model.services;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 * @author JuniorMartins
 */
@Stateless
public class InstrucoesEJBStatelessServices 
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    private Map<Integer, String> mapaInstrucoes;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public InstrucoesEJBStatelessServices(){}
    
    // ------------------------- MÉTODOS DE SERVIÇO ------------------------- //    
    public String buscarInstrucoes(Integer num)
    {return mapaInstrucoes.get(num);}
    
    // ------------------------- MÉTODOS AUXILIARES ------------------------- //
    @PostConstruct
    public void gerarBaseDadosInstrucoes()
    {
        mapaInstrucoes = new HashMap<>();
        mapaInstrucoes.put(1, "Registre-se com CPF e nome e depois clique em ´Carregar jogo´");
        mapaInstrucoes.put(2, "Instrucao 2");
        mapaInstrucoes.put(3, "Instrucao 3");
    }
}





