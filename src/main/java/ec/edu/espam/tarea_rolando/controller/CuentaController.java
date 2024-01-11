package ec.edu.espam.tarea_rolando.controller;

import ec.edu.espam.tarea_rolando.domain.Cuenta;
import ec.edu.espam.tarea_rolando.service.CuentaServicio;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/cuentas")
public class CuentaController {

    private final CuentaServicio cuentaServicio;

    @GetMapping
    public ResponseEntity<List<Cuenta>> obtenerTodos() {
        return ResponseEntity.ok(cuentaServicio.obtenerTodos());
    }

    @PostMapping
    public ResponseEntity<Cuenta> guardar(@RequestBody @Valid Cuenta cuenta) {
        return new ResponseEntity<>(cuentaServicio.guardar(cuenta), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cuenta> editar(@PathVariable Long id, @RequestBody @Valid Cuenta cuentaActualizada) {
        Cuenta buscaCuentaActualizar = cuentaServicio.obtenerPorId(id);
        if(buscaCuentaActualizar == null) {
            return ResponseEntity.notFound().build();
        }else {
            buscaCuentaActualizar.setNumero(cuentaActualizada.getNumero());
            buscaCuentaActualizar.setTipo(cuentaActualizada.getTipo());
            buscaCuentaActualizar.setBalanceInicial(cuentaActualizada.getBalanceInicial());
            buscaCuentaActualizar.setSaldo(cuentaActualizada.getSaldo());
            buscaCuentaActualizar.setEstado(cuentaActualizada.getEstado());
            Cuenta actualizaCuenta = cuentaServicio.actualizar(buscaCuentaActualizar);
            return ResponseEntity.ok(actualizaCuenta);
        }
    }
}
