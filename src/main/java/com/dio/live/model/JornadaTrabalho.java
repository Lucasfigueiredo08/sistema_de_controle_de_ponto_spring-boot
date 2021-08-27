package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder  // teste em software e quer transferir objetos
@Data     // cria a maioria das anotações
@Entity
public class JornadaTrabalho {
    @Id
    private Long id;
    private String descricao;

    //    As anotações substituem o codigo
// construtor
//    public jornadaTrabalho(long id, String descricao) {
//        this.id = id;
//        this.descricao = descricao;
//    }

//    public jornadaTrabalho(){}


    //    getters and setters
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }

//    equals and hashcode
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        jornadaTrabalho that = (jornadaTrabalho) o;
//        return id == that.id && Objects.equals(descricao, that.descricao);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, descricao);
//    }
}
