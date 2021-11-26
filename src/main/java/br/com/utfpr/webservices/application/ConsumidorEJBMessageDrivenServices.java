package br.com.utfpr.webservices.application;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author JuniorMartins
 */
@MessageDriven(activationConfig = 
{
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "puzzleutfpr/Fila"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ConsumidorEJBMessageDrivenServices implements MessageListener
{
    @Override
    public void onMessage(Message msg) 
    {
        try
        {
            TextMessage tm = (TextMessage) msg;
            System.out.println(tm.getText());
        }catch(Exception e)
        {System.err.println("Exceção! Message-drigen");}
        
    }
    
}
