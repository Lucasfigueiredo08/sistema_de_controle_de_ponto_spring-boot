package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder  // teste em software e quer transferir objetos
@Data     // cria a maioria das anotações
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
}
