package com.liutongjun.repository;

import com.liutongjun.entity.Menu;
import com.liutongjun.entity.Type;

import java.util.List;

public interface TypeRepository {
    public Type findById(String id);
    public List<Type> findAll();
}
