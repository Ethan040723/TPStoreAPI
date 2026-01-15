package com.example.demo.StoreAPI.bo;

public class ReponseCode<T> {

    public String code;
    public String message;
    public T data;

    public ReponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ReponseCode (String code, String message, T data ) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


}

