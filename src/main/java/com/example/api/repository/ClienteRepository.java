/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.api.repository;

import com.example.api.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Bruno Martins
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    Cliente findByCpf(String cpf);

}
