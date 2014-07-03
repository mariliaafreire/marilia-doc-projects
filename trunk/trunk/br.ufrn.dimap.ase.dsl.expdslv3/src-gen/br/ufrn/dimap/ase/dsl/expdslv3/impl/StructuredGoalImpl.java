/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expdslv3.impl;

import br.ufrn.dimap.ase.dsl.expdslv3.Expdslv3Package;
import br.ufrn.dimap.ase.dsl.expdslv3.StructuredGoal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredGoalImpl#getObject <em>Object</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredGoalImpl#getTechnique <em>Technique</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredGoalImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredGoalImpl#getPtView <em>Pt View</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expdslv3.impl.StructuredGoalImpl#getContextOf <em>Context Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredGoalImpl extends GoalImpl implements StructuredGoal
{
  /**
	 * The default value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
  protected static final String OBJECT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
  protected String object = OBJECT_EDEFAULT;

  /**
	 * The default value of the '{@link #getTechnique() <em>Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTechnique()
	 * @generated
	 * @ordered
	 */
  protected static final String TECHNIQUE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTechnique() <em>Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTechnique()
	 * @generated
	 * @ordered
	 */
  protected String technique = TECHNIQUE_EDEFAULT;

  /**
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
  protected static final String QUALITY_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
  protected String quality = QUALITY_EDEFAULT;

  /**
	 * The default value of the '{@link #getPtView() <em>Pt View</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPtView()
	 * @generated
	 * @ordered
	 */
  protected static final String PT_VIEW_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getPtView() <em>Pt View</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPtView()
	 * @generated
	 * @ordered
	 */
  protected String ptView = PT_VIEW_EDEFAULT;

  /**
	 * The default value of the '{@link #getContextOf() <em>Context Of</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContextOf()
	 * @generated
	 * @ordered
	 */
  protected static final String CONTEXT_OF_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getContextOf() <em>Context Of</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContextOf()
	 * @generated
	 * @ordered
	 */
  protected String contextOf = CONTEXT_OF_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected StructuredGoalImpl()
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
		return Expdslv3Package.Literals.STRUCTURED_GOAL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getObject()
  {
		return object;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setObject(String newObject)
  {
		String oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_GOAL__OBJECT, oldObject, object));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getTechnique()
  {
		return technique;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTechnique(String newTechnique)
  {
		String oldTechnique = technique;
		technique = newTechnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_GOAL__TECHNIQUE, oldTechnique, technique));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getQuality()
  {
		return quality;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setQuality(String newQuality)
  {
		String oldQuality = quality;
		quality = newQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_GOAL__QUALITY, oldQuality, quality));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getPtView()
  {
		return ptView;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPtView(String newPtView)
  {
		String oldPtView = ptView;
		ptView = newPtView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_GOAL__PT_VIEW, oldPtView, ptView));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getContextOf()
  {
		return contextOf;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setContextOf(String newContextOf)
  {
		String oldContextOf = contextOf;
		contextOf = newContextOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Expdslv3Package.STRUCTURED_GOAL__CONTEXT_OF, oldContextOf, contextOf));
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
			case Expdslv3Package.STRUCTURED_GOAL__OBJECT:
				return getObject();
			case Expdslv3Package.STRUCTURED_GOAL__TECHNIQUE:
				return getTechnique();
			case Expdslv3Package.STRUCTURED_GOAL__QUALITY:
				return getQuality();
			case Expdslv3Package.STRUCTURED_GOAL__PT_VIEW:
				return getPtView();
			case Expdslv3Package.STRUCTURED_GOAL__CONTEXT_OF:
				return getContextOf();
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
			case Expdslv3Package.STRUCTURED_GOAL__OBJECT:
				setObject((String)newValue);
				return;
			case Expdslv3Package.STRUCTURED_GOAL__TECHNIQUE:
				setTechnique((String)newValue);
				return;
			case Expdslv3Package.STRUCTURED_GOAL__QUALITY:
				setQuality((String)newValue);
				return;
			case Expdslv3Package.STRUCTURED_GOAL__PT_VIEW:
				setPtView((String)newValue);
				return;
			case Expdslv3Package.STRUCTURED_GOAL__CONTEXT_OF:
				setContextOf((String)newValue);
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
			case Expdslv3Package.STRUCTURED_GOAL__OBJECT:
				setObject(OBJECT_EDEFAULT);
				return;
			case Expdslv3Package.STRUCTURED_GOAL__TECHNIQUE:
				setTechnique(TECHNIQUE_EDEFAULT);
				return;
			case Expdslv3Package.STRUCTURED_GOAL__QUALITY:
				setQuality(QUALITY_EDEFAULT);
				return;
			case Expdslv3Package.STRUCTURED_GOAL__PT_VIEW:
				setPtView(PT_VIEW_EDEFAULT);
				return;
			case Expdslv3Package.STRUCTURED_GOAL__CONTEXT_OF:
				setContextOf(CONTEXT_OF_EDEFAULT);
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
			case Expdslv3Package.STRUCTURED_GOAL__OBJECT:
				return OBJECT_EDEFAULT == null ? object != null : !OBJECT_EDEFAULT.equals(object);
			case Expdslv3Package.STRUCTURED_GOAL__TECHNIQUE:
				return TECHNIQUE_EDEFAULT == null ? technique != null : !TECHNIQUE_EDEFAULT.equals(technique);
			case Expdslv3Package.STRUCTURED_GOAL__QUALITY:
				return QUALITY_EDEFAULT == null ? quality != null : !QUALITY_EDEFAULT.equals(quality);
			case Expdslv3Package.STRUCTURED_GOAL__PT_VIEW:
				return PT_VIEW_EDEFAULT == null ? ptView != null : !PT_VIEW_EDEFAULT.equals(ptView);
			case Expdslv3Package.STRUCTURED_GOAL__CONTEXT_OF:
				return CONTEXT_OF_EDEFAULT == null ? contextOf != null : !CONTEXT_OF_EDEFAULT.equals(contextOf);
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
		result.append(" (object: ");
		result.append(object);
		result.append(", technique: ");
		result.append(technique);
		result.append(", quality: ");
		result.append(quality);
		result.append(", ptView: ");
		result.append(ptView);
		result.append(", contextOf: ");
		result.append(contextOf);
		result.append(')');
		return result.toString();
	}

} //StructuredGoalImpl
