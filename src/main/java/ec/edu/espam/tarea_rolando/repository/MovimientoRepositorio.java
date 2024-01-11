package ec.edu.espam.tarea_rolando.repository;

import ec.edu.espam.tarea_rolando.domain.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepositorio extends JpaRepository<Movimiento, Long> {
}
