package com.example.clonecoding.dto;

import com.example.clonecoding.enums.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto<T> {
    boolean success;
    T data;
    Error error;

    public ResponseDto(T data, ErrorCode errorCode) {
        if (data != null) {
            this.success = true;
        } else {
            this.success = false;
            this.error = new Error(errorCode);
        }

        this.data = data;
        this.error = new Error(errorCode);
    }

    public ResponseDto(T data) {
        this.success = true;
        this.data = data;
        this.error = null;
    }


    @Getter
    public static class Error {

        private String code;
        private String message;

        public Error(ErrorCode errorCode) {
            this.code = errorCode.getCode();
            this.message = errorCode.getMessage();
        }
    }

}