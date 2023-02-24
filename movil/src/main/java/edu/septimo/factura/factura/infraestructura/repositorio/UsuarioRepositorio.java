package edu.septimo.factura.factura.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.septimo.factura.factura.modelo.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
}
