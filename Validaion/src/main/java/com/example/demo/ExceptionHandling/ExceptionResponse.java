package com.example.demo.ExceptionHandling;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

    private String message;
    private boolean isFoundRecord;
    private LocalDateTime dateTime;
    
     
}
