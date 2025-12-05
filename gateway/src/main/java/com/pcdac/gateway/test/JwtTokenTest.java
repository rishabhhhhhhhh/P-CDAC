package com.pcdac.gateway.test;

public class JwtTokenTest {
    public static void main(String[] args) {
        String token = com.pcdac.gateway.util.JwtUtil.generateToken("my-super-secret-key-that-is-32bytes!");
        System.out.println(token);
    }
}

