package com.gp6.springboot18.exception;

public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在!");
    }
}
