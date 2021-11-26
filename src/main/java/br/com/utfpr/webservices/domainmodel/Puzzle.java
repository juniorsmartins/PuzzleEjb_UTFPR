package br.com.utfpr.webservices.domainmodel;

/**
 * @author JuniorMartins
 */
public class Puzzle 
{
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    private Integer valor1;
    private Integer valor2;
    private Integer soma;
    private Integer palpite;
    private String resultado;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public Puzzle(){}
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public Integer getValor1() 
    {return valor1;}
    public void setValor1(Integer valor1) 
    {this.valor1 = valor1;}
    public Integer getValor2() 
    {return valor2;}
    public void setValor2(Integer valor2) 
    {this.valor2 = valor2;}
    public Integer getSoma() 
    {return soma;}
    public void setSoma(Integer soma) 
    {this.soma = soma;}
    public Integer getPalpite() 
    {return palpite;}
    public void setPalpite(Integer palpite) 
    {this.palpite = palpite;}
    public String getResultado() 
    {return resultado;}
    public void setResultado(String resultado) 
    {this.resultado = resultado;}
    
    
}



