package be.jonasboon.exceltofinancefile.repository;

import be.jonasboon.exceltofinancefile.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket,Integer> {
}
