package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder // teste em software e quer transferir objetos
@Entity
@Audited
public class CategoriaUsuario {
    @Id
    private Long id;
    private String descricao;
}
