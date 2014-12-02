import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
//import org.antlr.runtime.ANTLRStringStream;

public class MainParser
{
  public static void main(String[] args)
  {
	MainParser parseThis = new MainParser();
	parseThis.printResult();
  }
  
  private void printResult()
  {
    String file = "src/testCase.txt";
    
    try
    {
      CharStream cs = new ANTLRFileStream(file);
      PastingLexer lexer = new PastingLexer(cs);
      CommonTokenStream tokens = new CommonTokenStream(lexer); 
      PastingParser parser = new PastingParser(tokens);
      PastingParser.ProgContext psc = parser.prog();
      
      ParseTreeWalker walker = new ParseTreeWalker();
      PastingListener listener = 
    		  new PastingBaseListener();
      walker.walk(listener, psc);
    }
    
    catch (IOException e)
    {
      System.out.println("Something went wrong. :-//");
    }
  }
}
