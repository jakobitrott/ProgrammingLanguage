package com.Jakob.tokenizer;
/**
 * Created by jakob on 05/10/2017.
 */
public enum TokenType {


    TOKEN,

    //FIRST CHAR IS A LETTER -> PROCEEDING ARE LETTERS OR NUMBERS
    IDENTIFIER,

    //ANYTHING IN DOUUBLE QUOTES
    STRING_LITERAL,

    // AN NUMBER
    INTEGER_LITERAL,

    EMPTY
}
