package iftm.edu.br.lista1_exer1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import iftm.edu.br.lista1_exer1.Repository.TodoListItemRepository;
import iftm.edu.br.lista1_exer1.Repository.TodoListRepository;

@SpringBootApplication
public class Lista1Exer1Application implements CommandLineRunner { 

	@Autowired
	TodoListItemRepository todoListItemRepository;

	@Autowired
	TodoListRepository todoListRepository;


	public static void main(String[] args) {
		SpringApplication.run(Lista1Exer1Application.class, args);


	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
