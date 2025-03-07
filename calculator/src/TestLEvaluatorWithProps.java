/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import LExpr.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;


public class TestLEvaluatorWithProps {
    /** Sample "calculator" using property of nodes */
    public static class EvaluatorWithProps extends LExprBaseListener {
        /** maps nodes to integers with Map<ParseTree,Integer> */
        ParseTreeProperty<Double> values = new ParseTreeProperty<Double>();

        /** Need to pass e's value out of rule s : e ; */
        public void exitS(LExprParser.SContext ctx) {
            setValue(ctx, getValue(ctx.e())); // like: int s() { return e(); }
        }

        public void exitPow(LExprParser.PowContext ctx) {
            double left = getValue(ctx.e(0));
            double right = getValue(ctx.e(1));
            setValue(ctx, Math.pow(left, right));

        }

        public void exitMultOrDiv(LExprParser.MultOrDivContext ctx) {
            double left = getValue(ctx.e(0));  // e '*' e   # Mult
            double right = getValue(ctx.e(1));
            if(ctx.op.getType() == LExprParser.MULT)
                setValue(ctx, left * right);
            else
                setValue(ctx, left / right);
        }

        public void exitAddOrMinus(LExprParser.AddOrMinusContext ctx) {
            double left = getValue(ctx.e(0)); // e '+' e   # Add
            double right = getValue(ctx.e(1));
            if(ctx.op.getType() == LExprParser.ADD)
                setValue(ctx, left + right);
            else
                setValue(ctx, left - right);
        }

        public void exitNumber(LExprParser.DoubleContext ctx) {
            String numberText = ctx.DOUBLE().getText();
            setValue(ctx, Double.parseDouble(numberText));
        }

        public void exitNegNumber(LExprParser.NegNumberContext ctx) {
            setValue(ctx, -getValue(ctx.e()));

        }


        public void exitParent(LExprParser.ParentContext ctx) {
            setValue(ctx, getValue(ctx.e())); // like: int s() { return e(); }
        }

        public void setValue(ParseTree node, double value) { values.put(node, value); }
        public double getValue(ParseTree node) { return values.get(node); }
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
            EvaluatorWithProps evalProp = new EvaluatorWithProps();
            walker.walk(evalProp, tree);
            System.out.println("properties result = " + evalProp.getValue(tree));
        }
        catch (java.io.IOException e) {
                System.out.println(e);
        }
    }

}
