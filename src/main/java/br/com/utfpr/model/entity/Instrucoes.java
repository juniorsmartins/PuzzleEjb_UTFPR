package br.com.utfpr.model.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author JuniorMartins
 */
@Entity
@Table(name = "instrucoes")
public class Instrucoes implements Serializable
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1L;
    
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String texto;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public Instrucoes(){}
    public Instrucoes(String texto)
    {this.texto = texto;}
    
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public Long getId() 
    {return id;}
    public String getTexto() 
    {return texto;}
    public void setTexto(String texto) 
    {this.texto = texto;}
    
    // ------------------------- MÉTODOS SOBRESCRITOS ------------------------- //
    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instrucoes other = (Instrucoes) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    

}

// ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
// ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
// ------------------------- CONSTRUTORES ------------------------- //
// ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
// ------------------------- MÉTODOS SOBRESCRITOS ------------------------- //


