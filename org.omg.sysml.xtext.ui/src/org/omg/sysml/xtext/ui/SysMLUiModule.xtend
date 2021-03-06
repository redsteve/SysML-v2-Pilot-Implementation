/*
 * generated by Xtext 2.18.0.M3
 */
package org.omg.sysml.xtext.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.omg.kerml.xtext.ui.contentassist.KerMLPrefixMatcher
import org.eclipse.xtext.ui.shared.Access

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class SysMLUiModule extends AbstractSysMLUiModule {
	override bindPrefixMatcher() {
		KerMLPrefixMatcher
	}
	
	override provideIAllContainersState() {
		// Replaces the JDT-aware project state implementation with one that handles dependencies via project references
		Access.workspaceProjectsState
	}
}
