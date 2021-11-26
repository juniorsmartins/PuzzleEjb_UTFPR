package br.com.utfpr.webservices.infrastructure;

import br.com.utfpr.webservices.domainmodel.Jogador;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;

/**
 * @author JuniorMartins
 */
public class JogadorPersistencia 
{
   // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    private Map<String, Jogador> mapaJogadores;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public JogadorPersistencia(){}
    
    // ------------------------- MÉTODOS DE "PERSISTÊNCIA" ------------------------- // 
    public void salvar(Jogador jogador) 
    {
        if(mapaJogadores.containsKey(jogador.getCpf()))
        {jogador.setPontos(jogador.getPontos() + mapaJogadores.get(jogador).getPontos());}
        mapaJogadores.put(jogador.getCpf(), jogador);
    }
    
    public Stream<Jogador> buscarRanking()
    {return mapaJogadores.values().stream().sorted(Jogador::getPontos);}
    
    public Jogador consultarPorId(Long id, Jogador jogador) 
    {return mapaJogadores.getOrDefault(id, jogador);}
    
    public void remover(Jogador jogador) 
    {mapaJogadores.remove(jogador.getCpf(), jogador);}
    
    // ------------------------- MÉTODOS AUXILIARES ------------------------- //
    @PostConstruct
    public void gerarBaseDadosJogadores()
    {
        mapaJogadores = new TreeMap<>();

        Jogador j1 = new Jogador("999.999.999-99", "Pedro");
        j1.setPontos(8);
        mapaJogadores.put(j1.getCpf(), j1);

        Jogador j2 = new Jogador("444.555.777-66", "Maria");
        j2.setPontos(8);
        mapaJogadores.put(j2.getCpf(), j2);

        Jogador j3 = new Jogador("888.111.222-77", "Karla");
        j3.setPontos(8);
        mapaJogadores.put(j3.getCpf(), j3);
    }
    
    
    
    
}



