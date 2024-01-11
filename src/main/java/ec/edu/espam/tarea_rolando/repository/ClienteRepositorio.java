package ec.edu.espam.tarea_rolando.repository;

import ec.edu.espam.tarea_rolando.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
