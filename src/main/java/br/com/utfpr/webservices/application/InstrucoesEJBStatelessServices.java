package br.com.utfpr.webservices.application;

import java.util.HashMap;
import java.util.Map;
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
    {
        gerarBaseDadosInstrucoes();
        return mapaInstrucoes.get(num);
    }
      
    // ------------------------- MÉTODOS AUXILIARES ------------------------- //
    public void gerarBaseDadosInstrucoes()
    {
        mapaInstrucoes = new HashMap<>();
        mapaInstrucoes.put(1, "Registre-se: digite o CPF e o nome completo e depois clique no botão 'Carregar jogo'. ");
        mapaInstrucoes.put(2, "1) Clique no botão sortear números para começar o jogo; ");
        mapaInstrucoes.put(3, "2) Digite a soma deles na área de palpite; ");
        mapaInstrucoes.put(4, "3) Clique no botão verificar palpite; ");
        mapaInstrucoes.put(5, "4) Veja qual o resultado e ganhe 1 ponto em caso de acerto; ");
        mapaInstrucoes.put(6, "5) Clique no botão sortear números para jogar de novo. ");
    }

}





