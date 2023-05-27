package be.jonasboon.exceltofinancefile.mapper;

import be.jonasboon.exceltofinancefile.dto.shape.ShapeDTO;
import be.jonasboon.exceltofinancefile.model.Coordinates;
import be.jonasboon.exceltofinancefile.model.Shape;
import lombok.experimental.Accessors;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class ShapeMapper {

    public List<ShapeDTO> entitiesToDTOs(List<Shape> shapes){
        return shapes.stream()
                .map(ShapeMapper::entityToDTO)
                .collect(Collectors.toList());
    }

    public ShapeDTO entityToDTO(Shape shape) {
        return ShapeDTO.builder()
                .x(shape.getCoordinates().getX())
                .y(shape.getCoordinates().getY())
                .width(shape.getWidth())
                .height(shape.getHeight())
                .color(shape.getColor())
                .text(shape.getText())
                .build();
    }

    public List<Shape> DTOtoEntities(List<ShapeDTO> shapes){
        return shapes.stream()
                .map(ShapeMapper::DTOtoEntity)
                .collect(Collectors.toList());
    }

    public Shape DTOtoEntity(ShapeDTO shape) {
        Coordinates coordinates = new Coordinates(shape.getX(), shape.getY());

        return Shape.builder()
                .coordinates(coordinates)
                .height(shape.getHeight())
                .width(shape.getWidth())
                .color(shape.getColor())
                .text(shape.getText())
                .build();
    }
}
