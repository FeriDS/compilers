/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import LExpr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

public class TestLEvaluator {
    /** Sample "calculator" */
    public static class Evaluator extends LExprBaseListener {
        Stack<Double> stack = new Stack<Double>();

        public void exitMultOrDiv(LExprParser.MultOrDivContext ctx) {
            double right = stack.pop();
            double left = stack.pop();
            if (ctx.op.getType() == LExprParser.MULT)
                stack.push(left * right);
            else
                stack.push(left / right);
        }

        public void exitNegNumber(LExprParser.NegNumberContext ctx) {
            stack.push(-stack.pop());
        }

        public void exitPow(LExprParser.PowContext ctx) {
            double right = stack.pop();
            double left = stack.pop();
            stack.push(Math.pow(left, right));
        }


        public void exitAddOrMinus(LExprParser.AddOrMinusContext ctx) {
            double right = stack.pop();
            double left = stack.pop();
            if (ctx.op.getType() == LExprParser.ADD)
                stack.push(left + right);
            else
                stack.push(left - right);
        }

        public void exitNumber(LExprParser.NumberContext ctx) {
            stack.push(Double.parseDouble(ctx.NUMBER().getText()));
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        try {
            if (inputFile != null) is = new FileInputStream(inputFile);
            CharStream input = CharStreams.fromStream(is);
            LExprLexer lexer = new LExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            LExprParser parser = new LExprParser(tokens);
            ParseTree tree = parser.s();
            ParseTreeWalker walker = new ParseTreeWalker();
            Evaluator eval = new Evaluator();
            walker.walk(eval, tree);
            System.out.println("Input = " + input);
            System.out.println("stack result = " + eval.stack.pop());
        }
        catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
