/*******************************************************************************
 * Copyright (c) 2018 Tasktop Technologies.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Kevin de Vlaming - initial API and implementation
 *******************************************************************************/

package org.eclipse.mylyn.internal.wikitext.creole.tests.documentbuilder;

import org.eclipse.mylyn.wikitext.parser.Attributes;
import org.eclipse.mylyn.wikitext.parser.DocumentBuilder.SpanType;

/**
 * @see http://www.wikicreole.org/wiki/Elements
 * @author Kevin de Vlaming
 */
public class CreoleDocumentBuilderSpanTest extends AbstractCreoleDocumentBuilderTest {

	public void testItalic() {
		builder.beginDocument();
		builder.beginSpan(SpanType.ITALIC, new Attributes());
		builder.characters("italic");
		builder.endSpan();
		builder.endDocument();
		assertMarkup("//italic//\n\n");
	}

	public void testEmphasis() {
		builder.beginDocument();
		builder.beginSpan(SpanType.EMPHASIS, new Attributes());
		builder.characters("emphasis");
		builder.endSpan();
		builder.endDocument();
		assertMarkup("//emphasis//\n\n");
	}

	public void testMark() {
		builder.beginDocument();
		builder.beginSpan(SpanType.MARK, new Attributes());
		builder.characters("mark");
		builder.endSpan();
		builder.endDocument();
		assertMarkup("//mark//\n\n");
	}

	public void testBold() {
		builder.beginDocument();
		builder.beginSpan(SpanType.BOLD, new Attributes());
		builder.characters("bold");
		builder.endSpan();
		builder.endDocument();
		assertMarkup("**bold**\n\n");
	}

	public void testStrong() {
		builder.beginDocument();
		builder.beginSpan(SpanType.STRONG, new Attributes());
		builder.characters("strong");
		builder.endSpan();
		builder.endDocument();
		assertMarkup("**strong**\n\n");
	}

	public void testDeleted() {
		builder.beginDocument();
		builder.beginSpan(SpanType.DELETED, new Attributes());
		builder.characters("deleted");
		builder.endSpan();
		builder.endDocument();
		assertMarkup("--deleted--\n\n");
	}

	public void testUnderlined() {
		builder.beginDocument();
		builder.beginSpan(SpanType.UNDERLINED, new Attributes());
		builder.characters("underlined");
		builder.endSpan();
		builder.endDocument();
		assertMarkup("__underlined__\n\n");
	}

	public void testEmptySpan() {
		builder.beginDocument();
		builder.characters("prefix");
		builder.beginSpan(SpanType.BOLD, new Attributes());
		builder.endSpan();
		builder.characters(" suffix");
		builder.endDocument();
		assertMarkup("prefix suffix\n\n");
	}

	public void testUnsupportedSpan() {
		builder.beginDocument();
		builder.beginSpan(SpanType.INSERTED, new Attributes());
		builder.characters("unsupported");
		builder.endSpan();
		builder.endDocument();
		assertMarkup("unsupported\n\n");
	}

}