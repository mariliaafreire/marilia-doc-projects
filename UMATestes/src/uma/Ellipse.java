/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ellipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uma.Ellipse#getCenter <em>Center</em>}</li>
 *   <li>{@link uma.Ellipse#getRadiusX <em>Radius X</em>}</li>
 *   <li>{@link uma.Ellipse#getRadiusY <em>Radius Y</em>}</li>
 *   <li>{@link uma.Ellipse#getRotation <em>Rotation</em>}</li>
 *   <li>{@link uma.Ellipse#getStartAngle <em>Start Angle</em>}</li>
 *   <li>{@link uma.Ellipse#getEndAngle <em>End Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see uma.UmaPackage#getEllipse()
 * @model
 * @generated
 */
public interface Ellipse extends GraphicPrimitive {
	/**
	 * Returns the value of the '<em><b>Center</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' reference.
	 * @see #setCenter(Point)
	 * @see uma.UmaPackage#getEllipse_Center()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link uma.Ellipse#getCenter <em>Center</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' reference.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

	/**
	 * Returns the value of the '<em><b>Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius X</em>' attribute.
	 * @see #setRadiusX(Double)
	 * @see uma.UmaPackage#getEllipse_RadiusX()
	 * @model dataType="uma.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getRadiusX();

	/**
	 * Sets the value of the '{@link uma.Ellipse#getRadiusX <em>Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius X</em>' attribute.
	 * @see #getRadiusX()
	 * @generated
	 */
	void setRadiusX(Double value);

	/**
	 * Returns the value of the '<em><b>Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius Y</em>' attribute.
	 * @see #setRadiusY(Double)
	 * @see uma.UmaPackage#getEllipse_RadiusY()
	 * @model dataType="uma.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getRadiusY();

	/**
	 * Sets the value of the '{@link uma.Ellipse#getRadiusY <em>Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius Y</em>' attribute.
	 * @see #getRadiusY()
	 * @generated
	 */
	void setRadiusY(Double value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(Double)
	 * @see uma.UmaPackage#getEllipse_Rotation()
	 * @model dataType="uma.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getRotation();

	/**
	 * Sets the value of the '{@link uma.Ellipse#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(Double value);

	/**
	 * Returns the value of the '<em><b>Start Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Angle</em>' attribute.
	 * @see #setStartAngle(Double)
	 * @see uma.UmaPackage#getEllipse_StartAngle()
	 * @model dataType="uma.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getStartAngle();

	/**
	 * Sets the value of the '{@link uma.Ellipse#getStartAngle <em>Start Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Angle</em>' attribute.
	 * @see #getStartAngle()
	 * @generated
	 */
	void setStartAngle(Double value);

	/**
	 * Returns the value of the '<em><b>End Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Angle</em>' attribute.
	 * @see #setEndAngle(Double)
	 * @see uma.UmaPackage#getEllipse_EndAngle()
	 * @model dataType="uma.Double" required="true" ordered="false"
	 * @generated
	 */
	Double getEndAngle();

	/**
	 * Sets the value of the '{@link uma.Ellipse#getEndAngle <em>End Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Angle</em>' attribute.
	 * @see #getEndAngle()
	 * @generated
	 */
	void setEndAngle(Double value);

} // Ellipse
