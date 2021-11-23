package br.com.utfpr.model.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jogador")
public class Jogador implements Serializable 
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1L;

    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    private String cpf;
    
    @ManyToOne
    @JoinColumn(name = "ranking_id")
    private Ranking ranking;

    // ------------------------- CONSTRUTORES ------------------------- //
    public Jogador(){}
    public Jogador(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }
        
    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public Long getId() 
    {return id;}
    public String getNome() 
    {return nome;}
    public void setNome(String nome) 
    {this.nome = nome;}
    public String getCpf() 
    {return cpf;}
    public void setCpf(String cpf) 
    {this.cpf = cpf;}
    public Ranking getRanking() 
    {return ranking;}
    public void setRanking(Ranking ranking) 
    {this.ranking = ranking;}

    // ------------------------- MÉTODOS SOBRESCRITOS ------------------------- //
    @Override
    public String toString() 
    {return "Jogador { Nome = " + nome + " / CPF = " + cpf + " }";}

    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.cpf);
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
        final Jogador other = (Jogador) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
