package be.jonasboon.exceltofinancefile.controller;

import be.jonasboon.exceltofinancefile.dto.shape.ShapeDTO;
import be.jonasboon.exceltofinancefile.service.ShapeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/shape")
public class ShapeController {

    ShapeService shapeService;

    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @GetMapping("/all")
    public List<ShapeDTO> getAllShape(){
        return shapeService.getAllShapes();
    }

    @PostMapping
    public ResponseEntity createShape(@RequestBody List<ShapeDTO> shape){
        return shapeService.saveStateOfShapes(shape);
    }

    @DeleteMapping("/all")
    public ResponseEntity deleteAllShapes(){
        return shapeService.deleteAllShapes();
    }
}
