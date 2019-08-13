package inventarios.to;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
@ToString
public class ProductCharacteristic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    EmployeeDetail encargadoregistro;
    @OneToOne
    StorageLocation location;

    Double monetaryValue;
    String shape;
    String color;
    String size;
//    String cosas;
//    String variedad;
//    String descripcion;
//    String precio;
//    String moneda;
    String quality;
//    String vistobueno;
//    String cosa;
//    String bueno;
//    String malo;
//    String regular;
//    String sabor;
//    String creado;
//    String ensamblado;
//    String facturado;
//    String compra;
//    String venta;
}
