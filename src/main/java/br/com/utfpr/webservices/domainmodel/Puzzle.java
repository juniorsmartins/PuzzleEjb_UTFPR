package br.com.utfpr.webservices.domainmodel;

import java.io.Serializable;

/**
 * @author JuniorMartins
 */
public class Puzzle implements Serializable
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1L;
    
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    private int valor1;
    private int valor2;
    private int soma;
    private int palpite;
    private String resultado;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public Puzzle(){}
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public int getValor1() 
    {return valor1;}
    public void setValor1(int valor1) 
    {this.valor1 = valor1;}
    public int getValor2() 
    {return valor2;}
    public void setValor2(int valor2) 
    {this.valor2 = valor2;}
    public int getSoma() 
    {return soma;}
    public void setSoma(int soma) 
    {this.soma = soma;}
    public int getPalpite() 
    {return palpite;}
    public void setPalpite(int palpite) 
    {this.palpite = palpite;}
    public String getResultado() 
    {return resultado;}
    public void setResultado(String resultado) 
    {this.resultado = resultado;}

    
    
}



