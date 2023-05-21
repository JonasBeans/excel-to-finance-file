package be.jonasboon.exceltofinancefile.service;

import be.jonasboon.exceltofinancefile.dto.exception.ValidationException;
import be.jonasboon.exceltofinancefile.dto.shape.ShapeDTO;
import be.jonasboon.exceltofinancefile.mapper.ShapeMapper;
import be.jonasboon.exceltofinancefile.model.Shape;
import be.jonasboon.exceltofinancefile.repository.ShapeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ShapeService {

    private final ShapeRepository shapeRepository;

    public ShapeService(ShapeRepository shapeRepository) {
        this.shapeRepository = shapeRepository;
    }

    public List<ShapeDTO> getAllShapes(){
        List<Shape> allShapes = shapeRepository.findAll();

        return ShapeMapper.entitiesToDTOs(allShapes);
    }

    public ResponseEntity saveStateOfShapes(List<ShapeDTO> shapes) {
        try {
            validateShapes(shapes);
        } catch(ValidationException e){
            log.error("Validation Exception during save of shapes: {}", e.getMessage());
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        List<Shape> shapeEntities = ShapeMapper.DTOtoEntities(shapes);

        shapeRepository.deleteAll();
        shapeRepository.saveAll(shapeEntities);

        return ResponseEntity.ok("saved shapes");
    }

    private void validateShapes(List<ShapeDTO> shapes) throws ValidationException {
        if(shapes.isEmpty()){
            throw new ValidationException("There are no shapes to save");
        }
        for (ShapeDTO shape : shapes) {
            shape.validateShape();
        }
    }

    public ResponseEntity deleteAllShapes() {
        shapeRepository.deleteAll();
        return ResponseEntity.ok("Successfully deleted all shapes");
    }
}
