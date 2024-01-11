package ec.edu.espam.tarea_rolando.repository;

import ec.edu.espam.tarea_rolando.domain.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepositorio extends JpaRepository<Cuenta, Long> {
}
