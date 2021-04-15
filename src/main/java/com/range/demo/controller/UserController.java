package com.range.demo.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/sqli")
public class UserController {
    @ApiOperation(value = "sqli", notes = "")
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String start()  {

        return "OK";

    }


}
