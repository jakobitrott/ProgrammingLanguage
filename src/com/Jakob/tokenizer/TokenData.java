package com.Jakob.tokenizer;

import java.util.regex.Pattern;

/**
 * Created by jakob on 05/10/2017.
 */
public class TokenData {

    private Pattern pattern; //pattern represents a regular expression inside of a clss
    private TokenType type;

    public TokenData(Pattern pattern, TokenType type){
        this.pattern = pattern;
        this.type = type;

    }


    public Pattern getPattern() {
        return pattern;
    }

    public TokenType getType() {
        return type;
    }
}
