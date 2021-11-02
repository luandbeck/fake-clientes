package com.example.fakeclientes.controllers;

import com.example.fakeclientes.dtos.ConsultaClienteResponseDTO;
import com.example.fakeclientes.dtos.CriaClienteRequestDTO;
import com.example.fakeclientes.usecases.ConsultaClienteUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/fake-cliente")
public class FakeClienteController {

    @Autowired
    private ConsultaClienteUseCase useCase;

    @PostMapping
    public ResponseEntity<Void> criarCliente(@RequestBody final CriaClienteRequestDTO dto) {

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{idCliente}")
    public ConsultaClienteResponseDTO getPostoCompleto(@PathVariable long idCliente) {

        return useCase.execute(idCliente);
    }
}
