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

public class TestLEvalVisitor {
    // a4 -visitor Expr.g4
    /** Visitor "calculator" */
    public static class EvalVisitor extends LExprBaseVisitor<Double> {
        public Double visitMultOrDiv(LExprParser.MultOrDivContext ctx) {
            if (ctx.op.getType() == LExprParser.MULT)
                return visit(ctx.e(0)) * visit(ctx.e(1));
            else
                return visit(ctx.e(0)) / visit(ctx.e(1));
        }

        public Double visitNegNumber(LExprParser.NegNumberContext ctx) {
            return -visit(ctx.e());
        }

        public Double visitAddOrMinus(LExprParser.AddOrMinusContext ctx) {
            if (ctx.op.getType() == LExprParser.ADD)
                return visit(ctx.e(0)) + visit(ctx.e(1));
            else
                return visit(ctx.e(0)) - visit(ctx.e(1));
        }

        public Double visitPow(LExprParser.PowContext ctx) {
            return Math.pow(visit(ctx.e(0)), visit(ctx.e(1)));
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
            EvalVisitor evalVisitor = new EvalVisitor();
            double result = evalVisitor.visit(tree);
            System.out.println("visitor result = " + result);
        }
        catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}
