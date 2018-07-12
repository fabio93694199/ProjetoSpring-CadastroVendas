package br.com.fabio.projeto.resource;

import br.com.fabio.projeto.model.Produto;
import br.com.fabio.projeto.repository.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

    @Autowired
    private Produtos produtos;

    @GetMapping
    public List <Produto> listar(){
        return produtos.findAll();
    }
}
