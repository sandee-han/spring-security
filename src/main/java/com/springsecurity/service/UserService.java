package com.springsecurity.service;

import com.springsecurity.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // secretKey 설정
    @Value("${jwt.secret}")
    private String secretKey;

    public String login(String userName, String password) {
        // 인증 과정 생략 (이전거 참고)

        // createJwt에서 secretKey는 하드 코딩하면 git에 올라가서 문제가 생길 수 있음
        // 따로 해줘야 함
        // @Value 처리해준 secretKey 부분.
        return JwtUtil.createJwt(userName, )
    }
}
