package parser;

import com.Jakob.tokenizer.Tokenizer;
import jdk.nashorn.internal.ir.Block;

/**
 * Created by jakob on 05/10/2017.
 */
public abstract class Parser<T extends Block> {


    //Takes a line and checks to see if it is for this parser

    public abstract boolean shouldParse(String line);

    //Take the superBlock and the tokenizer for the line and return a block of this parsers type

    public abstract T parse(Block superBlock, Tokenizer tokenizer);


}
