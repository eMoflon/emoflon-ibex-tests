/*
 * generated by Xtext 2.25.0
 */
package org.emoflon.express.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ExpressAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/emoflon/express/parser/antlr/internal/InternalExpress.tokens");
	}
}