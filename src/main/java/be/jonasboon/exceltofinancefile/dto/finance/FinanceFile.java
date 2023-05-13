package be.jonasboon.exceltofinancefile.dto.finance;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class FinanceFile {

    private LocalDate bookingDate;
    private String description;
    private Double amount;

}
