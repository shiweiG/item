package com.example.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T,ID>extends JpaRepository<T,ID> {
    T refresh(T t);
}
