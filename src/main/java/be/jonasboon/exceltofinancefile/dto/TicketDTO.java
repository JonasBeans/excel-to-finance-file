package be.jonasboon.exceltofinancefile.dto;

import be.jonasboon.exceltofinancefile.exception.ValidationException;
import lombok.*;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;


@Getter
@Setter
@Builder(setterPrefix = "with")
@ToString
@AllArgsConstructor
public class TicketDTO {

    private String id;
    private String firstName;
    private String lastName;
    private String status;
    private String description;

}
