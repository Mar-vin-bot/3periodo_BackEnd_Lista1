package iftm.edu.br.list1_exer2.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Integer id;
    private String nome;

    @ManyToOne
    private Library library_id;


    public Book() {
    }
    
    public Library getLibrary_id() {
        return library_id;
    }

    public void setLibrary_id(Library library_id) {
        this.library_id = library_id;
    }

    public Book(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
