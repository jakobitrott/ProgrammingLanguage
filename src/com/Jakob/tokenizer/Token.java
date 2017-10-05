package com.Jakob.tokenizer;

/**
 * Created by jakob on 05/10/2017.
 */
public class Token {
    private String token;
    private TokenType type;

    public Token(String token, TokenType type){

        this.token = token;
        this.type = type;

    }


    public String getToken(){

        return token;
    }

    public TokenType getType(){

        return type;
    }
}
