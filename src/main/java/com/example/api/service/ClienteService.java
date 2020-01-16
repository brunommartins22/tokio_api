/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api.service;

import com.example.api.domain.Cliente;
import com.example.api.repository.ClienteRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Bruno Martins
 */
@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> loadClientAll() {
        return (List<Cliente>) repository.findAll();
    }

    public boolean saveClient(Cliente cliente) {


        if (cliente.getId() == null && repository.findByCpf(cliente.getCpf()) != null) {
            return false;
        }

        repository.save(cliente);
        return true;
    }

    public boolean deleteClient(Long id) {

        repository.deleteById(id);

        return true;
    }

}
