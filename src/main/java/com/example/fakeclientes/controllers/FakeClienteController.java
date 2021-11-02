package com.example.fakeclientes.controllers;

import com.example.fakeclientes.dtos.ConsultaClienteResponseDTO;
import com.example.fakeclientes.dtos.CriaClienteRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fake-cliente")
public class FakeClienteController {

    @PostMapping
    public ResponseEntity<Void> criarCliente(@RequestBody final CriaClienteRequestDTO dto) {

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{idCliente}")
    public ConsultaClienteResponseDTO getPostoCompleto(@PathVariable long idCliente) {

        return ConsultaClienteResponseDTO.builder()
                .id(idCliente)
                .nome("Fake Cliente")
                .build();
    }
}
