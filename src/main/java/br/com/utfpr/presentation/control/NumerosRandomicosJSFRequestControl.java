package br.com.utfpr.presentation.control;

import br.com.utfpr.webservices.application.NumerosRandomicosEJBSingletonServices;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 * @author JuniorMartins
 */
@Named(value = "numerosRandomicosJSFRequestControl")
@RequestScoped
public class NumerosRandomicosJSFRequestControl implements Serializable
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1l;
    
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @EJB
    private NumerosRandomicosEJBSingletonServices numerosRandomicosEJBSingletonServices;
    private Integer valor1;
    private Integer valor2;
    private Integer soma;
    private Integer palpite;
    private String resultado;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public NumerosRandomicosJSFRequestControl(){}
    
    // ------------------------- MÉTODOS CONTROLADORES ------------------------- //
    public void gerarNumeroRandomico()
    {
        valor1 = numerosRandomicosEJBSingletonServices.gerarNumeroRandomico();
        valor2 = numerosRandomicosEJBSingletonServices.gerarNumeroRandomico();
        soma = valor1 + valor2;
    }
    
    public void verificarPalpite()
    {
        if(palpite != soma)
        {resultado = "Errou";}
        else
        {resultado = "Acertou";}
    }

    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public Integer getValor1() 
    {return valor1;}
    public void setValor1(Integer valor1) 
    {this.valor1 = valor1;}
    public Integer getValor2() 
    {return valor2;}
    public void setValor2(Integer valor2) 
    {this.valor2 = valor2;}
     public Integer getPalpite() 
    {return palpite;}
    public void setPalpite(Integer palpite) 
    {this.palpite = palpite;}
    public Integer getSoma() 
    {return soma;}
    public void setSoma(Integer soma) 
    {this.soma = soma;}
    public String getResultado() 
    {return resultado;}
    public void setResultado(String resultado) 
    {this.resultado = resultado;}
    
    
}



