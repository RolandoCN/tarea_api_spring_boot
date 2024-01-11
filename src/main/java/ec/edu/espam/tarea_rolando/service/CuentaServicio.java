package ec.edu.espam.tarea_rolando.service;

import ec.edu.espam.tarea_rolando.domain.Cuenta;

import java.util.List;

public interface CuentaServicio {
    List<Cuenta> obtenerTodos();

    Cuenta guardar(Cuenta cuenta);

    Cuenta actualizar(Cuenta cuenta);

    Cuenta obtenerPorId(Long id);
}
