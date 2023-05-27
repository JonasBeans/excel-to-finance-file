package be.jonasboon.exceltofinancefile.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder(setterPrefix = "with")
@Document
public class Ticket {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String status;
    private String description;
}
