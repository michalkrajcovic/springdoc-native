package com.example.springdocnative.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdocnative.web.model.ErrorResponse;
import com.example.springdocnative.web.model.GreetingsResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "validation error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
})
@RestController
public class GreetingsController {

    @Operation(summary = "Greetings", description = "The greetings endpoint", tags = { "greetings" })
    @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = GreetingsResponse.class)))
    @GetMapping(path = "/greetings", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GreetingsResponse> create(@RequestParam(name = "name") String name) {
        if (!(StringUtils.hasText(name) && Character.isUpperCase(name.charAt(0)))) {
            throw new GreetingsException("Char at 0 must be upper case");
        }
        return new ResponseEntity<>(new GreetingsResponse(String.format("Hello %s !", name)), HttpStatus.OK);
    }
}
