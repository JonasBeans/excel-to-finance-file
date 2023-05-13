package be.jonasboon.exceltofinancefile.controller;

import be.jonasboon.exceltofinancefile.service.FinanceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class FileController {

    FinanceService financeService;

    @PostMapping("upload")
    public ResponseEntity uploadFile(@RequestPart MultipartFile multiPartFile){
        return financeService.processFincanceFile(multiPartFile);
    }
}
