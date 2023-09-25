package com.learnkafka.controller;

import com.learnkafka.domain.LibraryEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // == @controller + @responesbody
@Slf4j //log function
public class LibraryEventsController {

    @PostMapping("/v1/libraryevent")
    public ResponseEntity<LibraryEvent> postLibraryEvent(
            @RequestBody LibraryEvent libraryEvent
    ){
        log.info("libraryEvent : {} ", libraryEvent);
        //invoke the kafka producer

        return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
    }
}