package br.com.utfpr.model.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ranking")
public class Ranking implements Serializable 
{
    // ------------------------- ATRIBUTOS DE CLASSE ------------------------- //
    private static final long serialVersionUID = 1L;
    
    // ------------------------- ATRIBUTOS DE INSTÂNCIA ------------------------- //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int pontos;
    @OneToMany(mappedBy = "ranking")
    private Set<Jogador> rankingJogadores;
    
    // ------------------------- CONSTRUTORES ------------------------- //
    public Ranking(){}

    // ------------------------- MÉTODOS DE ACESSO E MODIFICAÇÃO ------------------------- //
    public Long getId() 
    {return id;}


    // ------------------------- MÉTODOS SOBRESCRITOS ------------------------- //

    
    
    
    
}

