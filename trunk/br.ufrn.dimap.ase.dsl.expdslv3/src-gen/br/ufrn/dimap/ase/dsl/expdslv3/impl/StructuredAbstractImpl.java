/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.StructuredAbstract;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Abstract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl#getResults <em>Results</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl#getLimitations <em>Limitations</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredAbstractImpl#getConclusions <em>Conclusions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredAbstractImpl extends AbstractImpl implements StructuredAbstract
{
  /**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
  protected static final String BACKGROUND_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
  protected String background = BACKGROUND_EDEFAULT;

  /**
	 * The default value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
  protected static final String OBJECTIVE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
  protected String objective = OBJECTIVE_EDEFAULT;

  /**
	 * The default value of the '{@link #getMethods() <em>Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
  protected static final String METHODS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
  protected String methods = METHODS_EDEFAULT;

  /**
	 * The default value of the '{@link #getResults() <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
  protected static final String RESULTS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
  protected String results = RESULTS_EDEFAULT;

  /**
	 * The default value of the '{@link #getLimitations() <em>Limitations</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLimitations()
	 * @generated
	 * @ordered
	 */
  protected static final String LIMITATIONS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getLimitations() <em>Limitations</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getLimitations()
	 * @generated
	 * @ordered
	 */
  protected String limitations = LIMITATIONS_EDEFAULT;

  /**
	 * The default value of the '{@link #getConclusions() <em>Conclusions</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConclusions()
	 * @generated
	 * @ordered
	 */
  protected static final String CONCLUSIONS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getConclusions() <em>Conclusions</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConclusions()
	 * @generated
	 * @ordered
	 */
  protected String conclusions = CONCLUSIONS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StructuredAbstractImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Expdslv3Package.Literals.STRUCTURED_ABSTRACT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getBackground()
  {
		return background;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setBackground(String newBackground)
  {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_ABSTRACT__BACKGROUND, oldBackground, background));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getObjective()
  {
		return objective;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setObjective(String newObjective)
  {
		String oldObjective = objective;
		objective = newObjective;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_ABSTRACT__OBJECTIVE, oldObjective, objective));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getMethods()
  {
		return methods;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMethods(String newMethods)
  {
		String oldMethods = methods;
		methods = newMethods;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_ABSTRACT__METHODS, oldMethods, methods));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getResults()
  {
		return results;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResults(String newResults)
  {
		String oldResults = results;
		results = newResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_ABSTRACT__RESULTS, oldResults, results));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLimitations()
  {
		return limitations;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setLimitations(String newLimitations)
  {
		String oldLimitations = limitations;
		limitations = newLimitations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_ABSTRACT__LIMITATIONS, oldLimitations, limitations));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getConclusions()
  {
		return conclusions;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setConclusions(String newConclusions)
  {
		String oldConclusions = conclusions;
		conclusions = newConclusions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_ABSTRACT__CONCLUSIONS, oldConclusions, conclusions));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case Expdslv3Package.STRUCTURED_ABSTRACT__BACKGROUND:
				return getBackground();
			case Expdslv3Package.STRUCTURED_ABSTRACT__OBJECTIVE:
				return getObjective();
			case Expdslv3Package.STRUCTURED_ABSTRACT__METHODS:
				return getMethods();
			case Expdslv3Package.STRUCTURED_ABSTRACT__RESULTS:
				return getResults();
			case Expdslv3Package.STRUCTURED_ABSTRACT__LIMITATIONS:
				return getLimitations();
			case Expdslv3Package.STRUCTURED_ABSTRACT__CONCLUSIONS:
				return getConclusions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case Expdslv3Package.STRUCTURED_ABSTRACT__BACKGROUND:
				setBackground((String)newValue);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__OBJECTIVE:
				setObjective((String)newValue);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__METHODS:
				setMethods((String)newValue);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__RESULTS:
				setResults((String)newValue);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__LIMITATIONS:
				setLimitations((String)newValue);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__CONCLUSIONS:
				setConclusions((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case Expdslv3Package.STRUCTURED_ABSTRACT__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__OBJECTIVE:
				setObjective(OBJECTIVE_EDEFAULT);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__METHODS:
				setMethods(METHODS_EDEFAULT);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__RESULTS:
				setResults(RESULTS_EDEFAULT);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__LIMITATIONS:
				setLimitations(LIMITATIONS_EDEFAULT);
				return;
			case Expdslv3Package.STRUCTURED_ABSTRACT__CONCLUSIONS:
				setConclusions(CONCLUSIONS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case Expdslv3Package.STRUCTURED_ABSTRACT__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case Expdslv3Package.STRUCTURED_ABSTRACT__OBJECTIVE:
				return OBJECTIVE_EDEFAULT == null ? objective != null : !OBJECTIVE_EDEFAULT.equals(objective);
			case Expdslv3Package.STRUCTURED_ABSTRACT__METHODS:
				return METHODS_EDEFAULT == null ? methods != null : !METHODS_EDEFAULT.equals(methods);
			case Expdslv3Package.STRUCTURED_ABSTRACT__RESULTS:
				return RESULTS_EDEFAULT == null ? results != null : !RESULTS_EDEFAULT.equals(results);
			case Expdslv3Package.STRUCTURED_ABSTRACT__LIMITATIONS:
				return LIMITATIONS_EDEFAULT == null ? limitations != null : !LIMITATIONS_EDEFAULT.equals(limitations);
			case Expdslv3Package.STRUCTURED_ABSTRACT__CONCLUSIONS:
				return CONCLUSIONS_EDEFAULT == null ? conclusions != null : !CONCLUSIONS_EDEFAULT.equals(conclusions);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (background: ");
		result.append(background);
		result.append(", objective: ");
		result.append(objective);
		result.append(", methods: ");
		result.append(methods);
		result.append(", results: ");
		result.append(results);
		result.append(", limitations: ");
		result.append(limitations);
		result.append(", conclusions: ");
		result.append(conclusions);
		result.append(')');
		return result.toString();
	}

} //StructuredAbstractImpl
