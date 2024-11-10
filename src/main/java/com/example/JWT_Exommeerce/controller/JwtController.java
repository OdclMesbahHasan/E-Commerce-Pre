package com.example.JWT_Exommeerce.controller;

import com.example.JWT_Exommeerce.entity.JwtRequest;
import com.example.JWT_Exommeerce.entity.JwtResponse;
import com.example.JWT_Exommeerce.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtController {
    @Autowired
    private JwtService jwtService;

    @PostMapping({"/authenticate"})
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }
}
