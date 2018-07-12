package br.com.fabio.projeto.repository;

import br.com.fabio.projeto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository <Produto, Long> {
}
