package com.example.mysqlproject;
import com.example.mysqlproject.RequestData;
import com.example.mysqlproject.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/application")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @RequestMapping(value = "/get-text", method = RequestMethod.GET)
    public ResponseEntity<List<RequestData>> getTextPath() throws IOException {
        ResponseEntity<List<RequestData>> responseEntity = applicationService.getTextData();
        return responseEntity;
    }
}
