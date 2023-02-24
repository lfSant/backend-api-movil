package edu.septimo.factura.factura.modelo;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.geo.Point;

import java.util.Date;



@Entity
@Table(name = "bache")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double latitud;
    private double longitud;
    @Column(columnDefinition = "geometry(Point,4326)")
    private Point posicion;
    private String descripcion;
    @Column(length = 10000000)
    private String foto;
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public void setPosicion() {
       this.posicion = new Point(47.65100, -122.34900);
    }

}
