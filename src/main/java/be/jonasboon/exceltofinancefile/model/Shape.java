package be.jonasboon.exceltofinancefile.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
@AllArgsConstructor
@Builder
public class Shape {

    @Id
    String id;

    private Coordinates coordinates;
    private Integer width;
    private Integer height;
    private String color;
    private String text;
}
