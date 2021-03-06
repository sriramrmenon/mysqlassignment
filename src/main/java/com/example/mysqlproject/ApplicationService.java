package com.example.mysqlproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.mysqlproject.RequestData;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationDao applicationDao;


    public ResponseEntity<List<RequestData>> getTextData() throws IOException {
        List<RequestData> requestData = (List<RequestData>) applicationDao.findAll();


//        RandomAccessFile f = new RandomAccessFile(s, "r");
//        byte[] b = new byte[(int) f.length()];
//        f.readFully(b);
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<List<RequestData>>(requestData, headers, HttpStatus.CREATED);
    }

}
