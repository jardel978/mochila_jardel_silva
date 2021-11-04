package com.dh.farmacia.dao;

import com.dh.farmacia.exception.CommitException;
import com.dh.farmacia.exception.NoDataException;

public interface IGenericDao<T, K> {

//    public boolean adicionar(T entidade);
//    public T pesquisar(K id);
//    public boolean salvar(T entidade);
    public boolean remover(K id) throws NoDataException;

//    public void commit() throws CommitException;

}
