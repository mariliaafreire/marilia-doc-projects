/*
* generated by Xtext
*/
package br.ufrn.dimap.ase.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class Expdslv3AntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("br/ufrn/dimap/ase/dsl/parser/antlr/internal/InternalExpdslv3.tokens");
	}
}
