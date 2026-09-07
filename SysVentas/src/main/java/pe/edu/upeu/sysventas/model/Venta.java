package pe.edu.upeu.sysventas.model;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Venta extends DocumentoComercial {
    LocalDateTime fechaGener;
    Cliente dniruc;
    Usuario idUsuario;
    VentaDetalle detalleVenta;


}
