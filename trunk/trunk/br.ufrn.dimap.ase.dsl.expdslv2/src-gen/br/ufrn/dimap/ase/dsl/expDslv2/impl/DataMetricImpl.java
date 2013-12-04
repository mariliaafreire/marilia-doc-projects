/**
 * <copyright>
 * </copyright>
 *

 */
package br.ufrn.dimap.ase.dsl.expDslv2.impl;

import br.ufrn.dimap.ase.dsl.expDslv2.Artefact;
import br.ufrn.dimap.ase.dsl.expDslv2.CollectedData;
import br.ufrn.dimap.ase.dsl.expDslv2.DataMetric;
import br.ufrn.dimap.ase.dsl.expDslv2.DataType;
import br.ufrn.dimap.ase.dsl.expDslv2.ExpDslv2Package;
import br.ufrn.dimap.ase.dsl.expDslv2.Questionnaire;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DataMetricImpl#getCollectedData <em>Collected Data</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DataMetricImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DataMetricImpl#getArtefacts <em>Artefacts</em>}</li>
 *   <li>{@link br.ufrn.dimap.ase.dsl.expDslv2.impl.DataMetricImpl#getQuestionnaires <em>Questionnaires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataMetricImpl extends DetailImpl implements DataMetric
{
  /**
	 * The cached value of the '{@link #getCollectedData() <em>Collected Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCollectedData()
	 * @generated
	 * @ordered
	 */
  protected EList<CollectedData> collectedData;

  /**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
  protected EList<DataType> dataType;

  /**
	 * The cached value of the '{@link #getArtefacts() <em>Artefacts</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getArtefacts()
	 * @generated
	 * @ordered
	 */
  protected EList<Artefact> artefacts;

  /**
	 * The cached value of the '{@link #getQuestionnaires() <em>Questionnaires</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getQuestionnaires()
	 * @generated
	 * @ordered
	 */
  protected EList<Questionnaire> questionnaires;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DataMetricImpl()
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
		return ExpDslv2Package.Literals.DATA_METRIC;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<CollectedData> getCollectedData()
  {
		if (collectedData == null) {
			collectedData = new EObjectContainmentEList<CollectedData>(CollectedData.class, this, ExpDslv2Package.DATA_METRIC__COLLECTED_DATA);
		}
		return collectedData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<DataType> getDataType()
  {
		if (dataType == null) {
			dataType = new EDataTypeEList<DataType>(DataType.class, this, ExpDslv2Package.DATA_METRIC__DATA_TYPE);
		}
		return dataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Artefact> getArtefacts()
  {
		if (artefacts == null) {
			artefacts = new EObjectResolvingEList<Artefact>(Artefact.class, this, ExpDslv2Package.DATA_METRIC__ARTEFACTS);
		}
		return artefacts;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Questionnaire> getQuestionnaires()
  {
		if (questionnaires == null) {
			questionnaires = new EObjectResolvingEList<Questionnaire>(Questionnaire.class, this, ExpDslv2Package.DATA_METRIC__QUESTIONNAIRES);
		}
		return questionnaires;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ExpDslv2Package.DATA_METRIC__COLLECTED_DATA:
				return ((InternalEList<?>)getCollectedData()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ExpDslv2Package.DATA_METRIC__COLLECTED_DATA:
				return getCollectedData();
			case ExpDslv2Package.DATA_METRIC__DATA_TYPE:
				return getDataType();
			case ExpDslv2Package.DATA_METRIC__ARTEFACTS:
				return getArtefacts();
			case ExpDslv2Package.DATA_METRIC__QUESTIONNAIRES:
				return getQuestionnaires();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ExpDslv2Package.DATA_METRIC__COLLECTED_DATA:
				getCollectedData().clear();
				getCollectedData().addAll((Collection<? extends CollectedData>)newValue);
				return;
			case ExpDslv2Package.DATA_METRIC__DATA_TYPE:
				getDataType().clear();
				getDataType().addAll((Collection<? extends DataType>)newValue);
				return;
			case ExpDslv2Package.DATA_METRIC__ARTEFACTS:
				getArtefacts().clear();
				getArtefacts().addAll((Collection<? extends Artefact>)newValue);
				return;
			case ExpDslv2Package.DATA_METRIC__QUESTIONNAIRES:
				getQuestionnaires().clear();
				getQuestionnaires().addAll((Collection<? extends Questionnaire>)newValue);
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
			case ExpDslv2Package.DATA_METRIC__COLLECTED_DATA:
				getCollectedData().clear();
				return;
			case ExpDslv2Package.DATA_METRIC__DATA_TYPE:
				getDataType().clear();
				return;
			case ExpDslv2Package.DATA_METRIC__ARTEFACTS:
				getArtefacts().clear();
				return;
			case ExpDslv2Package.DATA_METRIC__QUESTIONNAIRES:
				getQuestionnaires().clear();
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
			case ExpDslv2Package.DATA_METRIC__COLLECTED_DATA:
				return collectedData != null && !collectedData.isEmpty();
			case ExpDslv2Package.DATA_METRIC__DATA_TYPE:
				return dataType != null && !dataType.isEmpty();
			case ExpDslv2Package.DATA_METRIC__ARTEFACTS:
				return artefacts != null && !artefacts.isEmpty();
			case ExpDslv2Package.DATA_METRIC__QUESTIONNAIRES:
				return questionnaires != null && !questionnaires.isEmpty();
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
		result.append(" (dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //DataMetricImpl
