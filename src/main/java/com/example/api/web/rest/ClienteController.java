/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api.web.rest;

import com.example.api.domain.Cliente;
import com.example.api.service.ClienteService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bruno Martins
 */
@RestController
@RequestMapping(path = "/api/clientes")
public class ClienteController {

    private ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Cliente> loadClientAll() {

        return service.loadClientAll();
    }

    @PostMapping()
    public boolean saveClient(@RequestBody Cliente cliente) {
   
        return service.saveClient(cliente);
    }

    @PutMapping()
    public boolean deleteClient(@RequestBody Long id) {
        return service.deleteClient(id);
    }
}
