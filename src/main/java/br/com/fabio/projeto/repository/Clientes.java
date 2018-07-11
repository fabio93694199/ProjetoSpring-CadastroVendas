package br.com.fabio.projeto.repository;

import br.com.fabio.projeto.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository <Cliente, Long> {
}