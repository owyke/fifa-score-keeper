package com.fifascore.data;

import java.util.List;

public interface BaseDao<T> {
    public T persist(T entity);

    public List<T> getAll();


    void deleteById(Long idToDelete);

    public T merge(T entity);
}
