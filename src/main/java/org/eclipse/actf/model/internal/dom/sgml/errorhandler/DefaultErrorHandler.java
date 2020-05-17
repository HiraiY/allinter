/*******************************************************************************
 * Copyright (c) 1998, 2008 IBM Corporation and Others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Goh KONDOH - initial API and implementation
 *******************************************************************************/

package org.eclipse.actf.model.internal.dom.sgml.errorhandler;

import java.io.IOException;

import org.eclipse.actf.model.dom.html.IErrorHandler;
import org.eclipse.actf.model.dom.html.IParser;
import org.eclipse.actf.model.dom.html.IParserError;
import org.eclipse.actf.model.dom.html.ParseException;
import org.eclipse.actf.model.internal.dom.sgml.ISGMLParser;
import org.eclipse.actf.model.internal.dom.sgml.impl.ElementDefinition;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * An implementation of {@link IErrorHandler}
 */
public class DefaultErrorHandler implements IErrorHandler {
	/**
	 * Set appropriate context element to context if an error occurs.
	 * <ol>
	 * <li> If <code>node</code> is a singleton instance, find another element
	 * with the same name. And if the other has no attribute, merge them.
	 * <li> If current context has already an illegal children, it fails (Since
	 * ver.1.1.a7).
	 * <li> If <code>errorNode</code> is unknown element, fail. <!--
	 * <li> if <code>errorNode</code> is an element with the same name as
	 * context and has no attribute, it interpret <code>errorNode</code> as
	 * endtag.
	 * <li> If <code>node</code> is and Element and empty child element, it
	 * also fails.
	 * <li> Otherwise searches a proper parent from current context to
	 * outer-most and right-most node. -->
	 * </ol>
	 * 
	 * @param node
	 *            illegal child
	 * @return true if found, otherwise false
	 * @see ISGMLParser#getContext()
	 * @see ISGMLParser#setContext(org.w3c.dom.Element)
	 */
	public boolean handleError(int code, IParser parser, Node errorNode)
			throws ParseException, IOException, SAXException {
		if (errorNode instanceof Element) {
			Element element = (Element) errorNode;
			String elementName = element.getTagName();
			ElementDefinition ed;
			if ((ed = ((ISGMLParser)parser).getDTD().getElementDefinition(elementName)) == null) {
				return false;
			} else if (ed.isSingleton()) {
				NodeList others = parser.getDocument().getElementsByTagName(
						elementName);
				if (others.getLength() == 1) {
					Element another = (Element) others.item(0);
					if (parser.autoGenerated(another)) {
						NamedNodeMap attributes = element.getAttributes();
						for (int i = 0; i < attributes.getLength(); i++) {
							Attr attr = (Attr) attributes.item(i);
							element.removeAttributeNode(attr);
							another.setAttributeNode(attr);
						}
						parser.setCurrentNode(another);
						parser.setContext(another);
						parser.error(IParserError.ILLEGAL_CHILD, errorNode + " and " //$NON-NLS-1$
								+ another + " are duplicated."); //$NON-NLS-1$
						return true;
					}
				}
			}
		}
		return false;
	}
}
