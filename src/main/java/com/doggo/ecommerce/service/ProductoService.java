package com.doggo.ecommerce.service;

import com.doggo.ecommerce.model.Producto;

import java.util.Optional;

public interface ProductoService {

    public Producto save(Producto producto);
    public Optional<Producto> get(Integer id);
    public void update(Producto producto);
    public void delete(Integer id);
}
