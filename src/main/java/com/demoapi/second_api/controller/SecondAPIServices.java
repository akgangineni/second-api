package com.demoapi.second_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoapi.second_api.model.SecondAPI;

@RestController
@RequestMapping("/SecondAPI")
public class SecondAPIServices {
    
    SecondAPI secondAPI;
    @GetMapping("{secondId}")
    public SecondAPI getSecondAPIDetails(String secondId){
        return secondAPI;
        //new SecondAPI("S1","Ajay");
    }



    @PostMapping
    public String createSecondAPIDetails( @RequestBody SecondAPI secondAPI){
        this.secondAPI = secondAPI;
        return "Created APIS";

    }

    
    @PutMapping
    public String updateSecondAPIDetails( @RequestBody SecondAPI secondAPI){
        this.secondAPI = secondAPI;
        return "Updated APIS";

    }


}
