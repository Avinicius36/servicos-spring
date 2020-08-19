package com.vinicius.servicosspring.servicosspring.domain.service;

import com.vinicius.servicosspring.servicosspring.domain.ClienteRepository;
import com.vinicius.servicosspring.servicosspring.domain.exception.NegocioException;
import com.vinicius.servicosspring.servicosspring.domain.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente)  {
        Cliente clienteExistente = clienteRepository.findByEmail(cliente.getEmail());

        if(clienteExistente != null && !clienteExistente.equals(cliente)) {
            throw new NegocioException("Já existe um cliente cadastrado com esse email");
        }

        return clienteRepository.save(cliente);
    }

    public void excluir(Long id) {
        clienteRepository.deleteById(id);
    }
}
