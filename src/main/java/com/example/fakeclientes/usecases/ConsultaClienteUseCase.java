package com.example.fakeclientes.usecases;

import com.example.fakeclientes.dtos.ConsultaClienteResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class ConsultaClienteUseCase {

    public ConsultaClienteResponseDTO execute(final long id) {

        return ConsultaClienteResponseDTO.builder()
                .id(id)
                .nome("Fake Cliente")
                .build();
    }
}
