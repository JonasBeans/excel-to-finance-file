package be.jonasboon.exceltofinancefile.dto.employee;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(setterPrefix = "with")
public class EmployeeDTO {

    private String name;
    private String surname;

}
