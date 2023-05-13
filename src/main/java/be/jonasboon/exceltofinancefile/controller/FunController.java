package be.jonasboon.exceltofinancefile.controller;

import be.jonasboon.exceltofinancefile.service.FuncService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

@RestController
@RequestMapping("api/v1/fun-stuff")
public class FunController {

    private final FuncService funService;

    public FunController(FuncService funcService) {
        this.funService = funcService;
    }

    @GetMapping("/random-sentence")
    public ResponseEntity<String> getMessage(){
        return funService.someRandomMessage();
    }

    @GetMapping("/random-numbers-test-result")
    public ResponseEntity getRandomNumberTestResult(@RequestParam String amountOfIterations){
        return funService.someRandomNumbersTest(parseInt(amountOfIterations));
    }
}
