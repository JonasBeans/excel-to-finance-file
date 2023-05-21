package be.jonasboon.exceltofinancefile.service;

import be.jonasboon.exceltofinancefile.model.Message;
import be.jonasboon.exceltofinancefile.model.RandomNumberArray;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FuncService {

    public ResponseEntity<String> someRandomMessage(){
        Message message = new Message();
        return ResponseEntity.ok(message.getMessage());
    }

    public ResponseEntity someRandomNumbersTest(int amountOfIterations){
        if(amountOfIterations > 100_000_000)
            return ResponseEntity.badRequest().body("Amount is to large for the server to handle!");
        RandomNumberArray randomNumberArray = new RandomNumberArray();
        int[] run = randomNumberArray.run(amountOfIterations);
        return ResponseEntity.ok(run);
    }


}
