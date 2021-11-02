package com.example.fakeclientes.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ConsultaClienteResponseDTO {

    private long id;
    private String nome;

}
