package pe.edu.upeu.sysventas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ComboBoxOption {
    String kry;
    String valus;

    @Override
    public String toString() {
        return valus;
    }
}
