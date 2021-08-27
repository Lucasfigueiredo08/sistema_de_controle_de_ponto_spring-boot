package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder // teste em software e quer transferir objetos
@Entity
public class Ocorrencia {
    @Id
    private Long id;
    private String nome;
    private String descricao;
}
