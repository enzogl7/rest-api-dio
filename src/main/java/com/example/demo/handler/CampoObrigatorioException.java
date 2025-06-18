package com.example.demo.handler;

public class CampoObrigatorioException extends BusinessException{

    public CampoObrigatorioException(String message) {
        super("O campo %s é obrigatorio", message);
    }

}
