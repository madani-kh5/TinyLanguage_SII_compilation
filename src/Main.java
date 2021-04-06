import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.annotation.processing.AbstractProcessor;
import java.awt.event.PaintEvent;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        CharStream CS = (CharStream) CharStreams.fromFileName("./exemple");
        TinyLanguage_SIILexer Lex = new TinyLanguage_SIILexer(CS);
        CommonTokenStream CTS = new CommonTokenStream(Lex);
        TinyLanguage_SIIParser parser = new TinyLanguage_SIIParser(CTS);

        TinyLanguage_SIIParser.Start_ruleContext start = parser.start_rule();
        SemanticTinyLanguage_SI listner = new SemanticTinyLanguage_SI();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listner,start);

        listner.getTable().display();


    }
}
