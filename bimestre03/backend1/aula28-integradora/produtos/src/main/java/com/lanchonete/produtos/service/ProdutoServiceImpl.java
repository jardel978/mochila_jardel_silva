package com.lanchonete.produtos.service;

import com.lanchonete.produtos.dao.ProdutoRepository;
import com.lanchonete.produtos.entity.Produto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProdutoServiceImpl implements IGenericService<Produto, Long> {

    @Autowired
    private final ProdutoRepository produtoRepository;

    @Override
    public List<Produto> obterTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public Produto guardar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void excluir(Long id) {
        produtoRepository.deleteById(id);
    }


}
