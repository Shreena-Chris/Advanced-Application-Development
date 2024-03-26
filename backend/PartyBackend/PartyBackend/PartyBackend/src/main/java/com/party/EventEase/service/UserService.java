package com.party.EventEase.service;

import java.security.Principal;

import com.party.EventEase.dto.request.PasswordRequest;

public interface UserService {

    void forgotPassword(PasswordRequest request, Principal principal);

}
