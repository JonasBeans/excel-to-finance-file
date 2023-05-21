package be.jonasboon.exceltofinancefile.dto.shape;

import be.jonasboon.exceltofinancefile.dto.exception.ValidationException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class ShapeDTO {

    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    private String color;
    private String text;

    public boolean validateShape() throws ValidationException {
        if(this.x == null)
            throw new ValidationException("X of coordinate is empty");
        if(this.y == null)
            throw new ValidationException("Y of coordinate is empty");
        if(this.width == null)
            throw new ValidationException("Width of is empty");
        if(this.height == null)
            throw new ValidationException("Height of shape is empty");
        return true;
    }
}
