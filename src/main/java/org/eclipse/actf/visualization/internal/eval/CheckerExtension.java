/*******************************************************************************
 * Copyright (c) 2007, 2008 IBM Corporation and Others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Kentarou FUKUDA - initial API and implementation
 *******************************************************************************/

package org.eclipse.actf.visualization.internal.eval;

import java.util.ArrayList;

import org.eclipse.actf.examples.adesigner.eval.html.HtmlCheckerInfoProvider;
import org.eclipse.actf.visualization.eval.IChecker;
import org.eclipse.actf.visualization.eval.ICheckerInfoProvider;
import org.eclipse.core.runtime.*;

public class CheckerExtension {
	private static final String EXTENSION_NAME = "checkers"; //$NON-NLS-1$

	private static final String CHECKER = "checker"; //$NON-NLS-1$

	private static final String ATTR_CLASS = "class"; //$NON-NLS-1$

	private static final String ATTR_INFO_PROVIDER = "infoprovider"; //$NON-NLS-1$

	private static CheckerExtension[] extensions;

	private static IChecker[] checkers = null;

	private static ICheckerInfoProvider[] infoProviders = null;

	public static IChecker[] getCheckers() {
		if (checkers != null) {
			return checkers;
		}

		CheckerExtension[] tmpExtensions = getExtensions();
		ArrayList<IChecker> tmpList = new ArrayList<IChecker>();
		if (tmpExtensions != null) {
			for (int i = 0; i < tmpExtensions.length; i++) {
				IChecker tmpChecker = tmpExtensions[i].getChecker();
				if (tmpChecker != null) {
					tmpList.add(tmpChecker);
				}
			}
		}
		checkers = new IChecker[tmpList.size()];
		tmpList.toArray(checkers);
		return checkers;
	}

	public static ICheckerInfoProvider[] getCheckerInfoProviders() {
		if (infoProviders != null) {
			return infoProviders;
		}

		CheckerExtension[] tmpExtensions = getExtensions();
		ArrayList<ICheckerInfoProvider> tmpList = new ArrayList<ICheckerInfoProvider>();
		if (tmpExtensions != null) {
			for (int i = 0; i < tmpExtensions.length; i++) {
				ICheckerInfoProvider tmpInfo = tmpExtensions[i]
						.getCheckerInfoProvider();
				if (tmpInfo != null) {
					tmpList.add(tmpInfo);
				}
			}
		}
		infoProviders = new ICheckerInfoProvider[tmpList.size()];
		tmpList.toArray(infoProviders);
		return infoProviders;
	}

//	private static CheckerExtension[] getExtensions() {
//		if (extensions != null)
//			return extensions;
//
//		IExtension[] tmpExtensions = Platform.getExtensionRegistry()
//				.getExtensionPoint(EvaluationUtil.PLUGIN_ID, EXTENSION_NAME)
//				.getExtensions();
//
//		DebugPrintUtil.devOrDebugPrintln("Checker extensions:" //$NON-NLS-1$
//				+ tmpExtensions.length);
//
//		List<CheckerExtension> l = new ArrayList<CheckerExtension>();
//		for (int i = 0; i < tmpExtensions.length; i++) {
//			IConfigurationElement[] configElements = tmpExtensions[i]
//					.getConfigurationElements();
//			for (int j = 0; j < configElements.length; j++) {
//				CheckerExtension ex = parseExtension(configElements[j]);
//				if (ex != null) {
//					l.add(ex);
//				}
//			}
//		}
//		extensions = l.toArray(new CheckerExtension[l.size()]);
//		return extensions;
//	}
	public static CheckerExtension[] getExtensions() {
		if (extensions != null)
			return extensions;

		IConfigurationElement configuration = new IConfigurationElement() {
			@Override
			public Object createExecutableExtension(String propertyName) throws CoreException {
				if (propertyName.equals(ATTR_INFO_PROVIDER)) {
					return new HtmlCheckerInfoProvider();
				}
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String getAttribute(String name) throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String getAttribute(String attrName, String locale) throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String getAttributeAsIs(String name) throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String[] getAttributeNames() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public IConfigurationElement[] getChildren() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public IConfigurationElement[] getChildren(String name) throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public IExtension getDeclaringExtension() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String getName() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public Object getParent() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String getValue() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String getValue(String locale) throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String getValueAsIs() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String getNamespace() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public String getNamespaceIdentifier() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public IContributor getContributor() throws InvalidRegistryObjectException {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public boolean isValid() {
				throw new UnsupportedOperationException("not implemented");
			}

			@Override
			public int getHandleId() {
				throw new UnsupportedOperationException("not implemented");
			}
		};

		extensions = new CheckerExtension[] { new CheckerExtension(configuration) };
		return extensions;
	}

	private static CheckerExtension parseExtension(
			IConfigurationElement configElement) {
		if (!configElement.getName().equals(CHECKER)) {
			return null;
		}
		try {
			return new CheckerExtension(configElement);
		} catch (Exception e) {
		}
		return null;
	}

	private IChecker checker = null;

	private ICheckerInfoProvider infoProvider = null;

	private IConfigurationElement configElement = null;

	private CheckerExtension(IConfigurationElement configElement) {
		this.configElement = configElement;
		try {
			this.infoProvider = (ICheckerInfoProvider) configElement
					.createExecutableExtension(ATTR_INFO_PROVIDER);
		} catch (Exception e) {
		}

	}

	private IChecker getChecker() {
		//to avoide loop
		if (this.checker == null) {
			try {
				this.checker = (IChecker) configElement
						.createExecutableExtension(ATTR_CLASS);
			} catch (Exception e) {
			}
		}
		return this.checker;
	}

	private ICheckerInfoProvider getCheckerInfoProvider() {
		return this.infoProvider;
	}

}
