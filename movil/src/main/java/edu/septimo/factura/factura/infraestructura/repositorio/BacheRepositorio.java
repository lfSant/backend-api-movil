package edu.septimo.factura.factura.infraestructura.repositorio;

import edu.septimo.factura.factura.modelo.Bache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BacheRepositorio extends JpaRepository<Bache, Integer> {
}
