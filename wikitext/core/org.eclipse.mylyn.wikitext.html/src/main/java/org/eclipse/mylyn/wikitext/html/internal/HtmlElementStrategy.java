/*******************************************************************************
 * Copyright (c) 2014 Tasktop Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     David Green - initial API and implementation
 *******************************************************************************/

package org.eclipse.mylyn.wikitext.html.internal;

import static java.util.Objects.requireNonNull;

public class HtmlElementStrategy<ElementType extends Enum<ElementType>> {

	private final ElementMatcher<ElementType> matcher;

	protected HtmlElementStrategy(ElementMatcher<ElementType> matcher) {
		this.matcher = requireNonNull(matcher);
	}

	public ElementMatcher<ElementType> matcher() {
		return matcher;
	}

}
