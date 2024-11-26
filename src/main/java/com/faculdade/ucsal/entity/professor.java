package com.faculdade.ucsal.entity;


import com.faculdade.ucsal.service.dadosProf;
import com.faculdade.ucsal.service.dadosUp;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="professor")
@Entity(name ="professor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private String especializacao;
    private String salario;

    public professor(dadosProf dados) {
        this.especializacao= dados.especializacao();
        this.salario= dados.salario();
        this.nome= dados.nome();
        this.email= dados.email();
        this.telefone= dados.telefone();
        this.cpf= dados.cpf();
    }


    public void update(dadosUp up) {
        if(up.email()!= null){
            this.email= up.email();
        }
        if(up.nome()!= null){
            this.nome= up.nome();
        }
        if(up.telefone()!= null){
            this.telefone= up.telefone();
        }
    }
}
