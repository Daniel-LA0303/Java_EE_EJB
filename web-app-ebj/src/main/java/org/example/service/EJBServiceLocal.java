package org.example.service;


import jakarta.ejb.Local;
import org.example.models.Productos;

import java.util.List;

@Local
public interface EJBServiceLocal {

    public String hello(String str);

    List<Productos> listarProductos();

    Productos crear(Productos producto);
}
