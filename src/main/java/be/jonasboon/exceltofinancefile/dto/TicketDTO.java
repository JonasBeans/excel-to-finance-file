package be.jonasboon.exceltofinancefile.dto;

import lombok.*;


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
