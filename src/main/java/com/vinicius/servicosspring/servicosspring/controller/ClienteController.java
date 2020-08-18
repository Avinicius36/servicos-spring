package com.vinicius.servicosspring.servicosspring.controller;

import com.vinicius.servicosspring.servicosspring.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setNome("Joao");
        cliente1.setEmail("joaodascouve@email.com");
        cliente1.setId(1);
        cliente1.setTelefone("31 9985445448");

        var cliente2 = new Cliente();
        cliente2.setNome("Maria");
        cliente2.setEmail("mariazinhadasilva@email.com");
        cliente2.setId(2);
        cliente2.setTelefone("31 9983466748");

        return Arrays.asList(cliente1, cliente2);

    }
}
