package be.jonasboon.exceltofinancefile.repository;

import be.jonasboon.exceltofinancefile.model.Shape;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShapeRepository extends MongoRepository<Shape, Integer> {
}
