package com.dio.live.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder // teste em software e quer transferir objetos
@Entity
public class Localidade {
    @Id
    private Long id;
    // relacionamneto muitos para um
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
