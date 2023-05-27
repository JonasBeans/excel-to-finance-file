package be.jonasboon.exceltofinancefile.mapper;

import be.jonasboon.exceltofinancefile.dto.TicketDTO;
import be.jonasboon.exceltofinancefile.model.Ticket;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TicketMapper {

    public Ticket toEntity(TicketDTO ticketDTO){
        return Ticket.builder()
                .withFirstName(ticketDTO.getFirstName())
                .withLastName(ticketDTO.getLastName())
                .withStatus(ticketDTO.getStatus())
                .withDescription(ticketDTO.getDescription())
                .build();
    }

    public TicketDTO toDTO(Ticket ticket){
        return TicketDTO.builder()
                .withId(ticket.getId())
                .withFirstName(ticket.getFirstName())
                .withLastName(ticket.getLastName())
                .withStatus(ticket.getStatus())
                .withDescription(ticket.getDescription())
                .build();
    }
}
