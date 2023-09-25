package com.learnkafka.domain;


public record LibraryEvent(
        Integer libraryEventId,
        LibraryEnentType libraryEnentType,
        Book book

) {

}
