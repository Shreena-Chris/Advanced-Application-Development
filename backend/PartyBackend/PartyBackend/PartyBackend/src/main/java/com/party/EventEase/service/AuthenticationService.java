package com.party.EventEase.service;

import java.io.IOException;

import com.party.EventEase.dto.request.LoginRequest;
import com.party.EventEase.dto.request.RegisterRequest;
import com.party.EventEase.dto.response.LoginResponse;
import com.party.EventEase.dto.response.RegisterResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface AuthenticationService {
    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
