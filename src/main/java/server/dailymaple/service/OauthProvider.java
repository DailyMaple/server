package server.dailymaple.service;

import server.dailymaple.constant.LoginType;
import server.dailymaple.dto.LoginRequest;

public interface OauthProvider<T, U> {
    public T getUserId(LoginRequest loginRequest);
    public U getUserInfo(LoginRequest loginRequest);

    public Long signUp(LoginRequest loginRequest, LoginType loginType);

}
