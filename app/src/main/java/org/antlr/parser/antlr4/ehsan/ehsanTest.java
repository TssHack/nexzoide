package org.antlr.parser.antlr4.ehsan;

import io.github.rosemoe.sora.langs.xml.analyzer.Utils;
import io.github.rosemoe.sora.text.TextAnalyzeResult;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ehsanTest {

  public static void main(TextAnalyzeResult result, String code) {
    var antlrinputstream = new ANTLRInputStream(code);
    var lexer = new ehsanLexer(antlrinputstream);
    var stream = new CommonTokenStream(lexer);
    var parser = new ehsanParser(stream);
    var base =
        new ehsanBaseListener() {
          @Override
          public void visitErrorNode(ErrorNode node) {
            int line = node.getSymbol().getLine() - 1;
            int col = node.getSymbol().getCharPositionInLine();
            Utils.setErrorSpan(result, line, col);
            super.visitErrorNode(node);
          }
        };
    var treewake = new ParseTreeWalker();
    treewake.walk(base, parser.install());
  }
}
