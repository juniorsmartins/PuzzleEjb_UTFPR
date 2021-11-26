package br.com.utfpr.presentation.control;


import br.com.utfpr.webservices.domainmodel.Jogador;
import br.com.utfpr.webservices.infrastructure.Ranking;
import java.util.List;
import javax.annotation.Resource;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.Queue;

/**
 * @author JuniorMartins
 */
@Named(value = "produtorJSFRequestControl")
@RequestScoped
public class ProdutorJSFRequestControl 
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @Resource(lookup = "java:comp/DefaultJMSConnectionFactory")
    private ConnectionFactory connectionFactory;
    
    @Resource(lookup = "puzzleutfpr/Fila")
    private Queue fila;
    
    private String mensagem;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public ProdutorJSFRequestControl() {}

    // ------------------------- MÉTODOS CONTROLADORES ------------------------- //  
    public void send()
    {
        try
        {
            JMSContext context = connectionFactory.createContext();
            context.createProducer().send((Destination) fila, mensagem);
        }catch(Exception e)
        {System.err.println("Erro - " + e.getMessage());}
        
        mensagem = " ";
    }
    
    public void sendRanking(String resultado)
    {
        if(resultado.equalsIgnoreCase("Acertou"))
        {
            List<Jogador> rankeados = Ranking.getListaJogadores();

            for(Jogador jogador : rankeados)
            {
                String jogadores = "" + jogador.getNome() + " - " + jogador.getPontos();
                try{
                    JMSContext context = connectionFactory.createContext();
                    context.createProducer().send(fila, jogadores);
                }catch(Exception e)
                {
                    System.err.println("Erro!");
                    System.err.println(e.getMessage());
                }
            }
        }
    }
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public String getMensagem() 
    {return mensagem;}
    public void setMensagem(String mensagem) 
    {this.mensagem = mensagem;}
    public ConnectionFactory getConnectionFactory() 
    {return connectionFactory;}
    public void setConnectionFactory(ConnectionFactory connectionFactory) 
    {this.connectionFactory = connectionFactory;}
    public Queue getFila() 
    {return fila;}
    public void setFila(Queue fila) 
    {this.fila = fila;}
    
    
    
    
}


