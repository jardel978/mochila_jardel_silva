package com.lanchonete.produtos.service;

import org.apache.catalina.LifecycleState;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T, K> {

    List<T> obterTodos();
    T guardar(T t);
    void excluir(K k);
    Optional<T> buscarPorId(K k);

}
