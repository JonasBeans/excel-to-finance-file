package be.jonasboon.exceltofinancefile.model;

import lombok.Getter;

import java.util.List;
import java.util.Random;

@Getter
public class Message {

    private String message;

    private final List<String> possibleMessages = List.of(
            "I often see the time 11:11 or 12:34 on clocks.",
            "The external scars tell only part of the story.",
            "His get rich quick scheme was to grow a cactus farm.",
            "The sky is clear; the stars are twinkling.",
            "He went on a whiskey diet and immediately lost three days.",
            "The child’s favorite Christmas gift was the large box her father’s lawnmower came in.",
            "The delicious aroma from the kitchen was ruined by cigarette smoke.",
            "The rain pelted the windshield as the darkness engulfed us.",
            "He didn’t want to go to the dentist, yet he went anyway.",
            "Jason didn’t understand why his parents wouldn’t let him sell his little sister at the garage sale." );

    public Message() {
       this.message = possibleMessages.get(generateRandomNumber());
    }

    private int generateRandomNumber() {
        return new Random().nextInt(possibleMessages.size() - 1);
    }
}
