package com.jupging.jupgingServer.user.controller;

import com.jupging.jupgingServer.user.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

//    @PutMapping("/sign-up")
//    public BaseResponse<SignUpRes> signup(@RequestBody SignUpReq signUpReq) {
//        // TODO : JWT 인증
//        // loginUser : Long? User?
//        SignUpRes signUpRes = authService.signUp(loginUser, signUpReq);
//    }
}
