package com.example.fakeclientes.usecases;

import com.example.fakeclientes.dtos.ConsultaClienteResponseDTO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ConsultaClienteUseCaseTest {

    @InjectMocks
    private ConsultaClienteUseCase useCase;

    @Test
    public void test(){
        final long id = 5;
        final String nomeCliente = "Fake Cliente";

        ConsultaClienteResponseDTO cliente = useCase.execute(id);

        Assert.assertEquals(id, cliente.getId());
        Assert.assertEquals(nomeCliente, cliente.getNome());
    }


}