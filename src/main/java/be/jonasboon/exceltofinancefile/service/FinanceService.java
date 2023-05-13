package be.jonasboon.exceltofinancefile.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@Service
public class FinanceService {

    public ResponseEntity processFincanceFile(MultipartFile multiPartFile) {
        try{
            tryProcessFincanceFile(multiPartFile);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    private void tryProcessFincanceFile(MultipartFile multiPartFile) throws IOException {
        InputStream inputStream = multiPartFile.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        while((line = reader.readLine()) != null)
            System.out.println(line);

    }
}
