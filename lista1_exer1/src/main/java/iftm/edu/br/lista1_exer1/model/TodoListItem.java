package iftm.edu.br.lista1_exer1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TodoListItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomeDoItem;
    private Integer id;

    @OneToMany(mappedBy = "todoListItem")
    private List<TodoList> telefones = new ArrayList<TodoList>();

    public TodoListItem() {
    }

    public TodoListItem(String nomeDoItem, Integer id) {
        this.nomeDoItem = nomeDoItem;
        this.id = id;
    }


    public String getNomeDoItem() {
        return this.nomeDoItem;
    }

    public void setNomeDoItem(String nomeDoItem) {
        this.nomeDoItem = nomeDoItem;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
}
