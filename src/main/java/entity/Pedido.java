package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    private Integer id;
    private Cliente cliente;
    private LocalDate dataPedido;
    private BigDecimal total;
}
