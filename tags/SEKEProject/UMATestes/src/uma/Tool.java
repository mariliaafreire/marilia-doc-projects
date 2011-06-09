/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Tool is a container/aggregate for ToolMentors.  It can also provide general descriptions of the tool and its general capabilities.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.Tool#getToolMentors <em>Tool Mentors</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getTool()
 * @model
 * @generated
 */
public interface Tool extends ContentCategory {
	/**
	 * Returns the value of the '<em><b>Tool Mentors</b></em>' reference list.
	 * The list contents are of type {@link uma.ToolMentor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Mentors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Mentors</em>' reference list.
	 * @see uma.UmaPackage#getTool_ToolMentors()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ToolMentor> getToolMentors();

} // Tool
