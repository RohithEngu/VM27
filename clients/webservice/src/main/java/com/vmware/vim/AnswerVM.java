/**
 * AnswerVM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AnswerVM implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private java.lang.String questionId;

	private java.lang.String answerChoice;

	public AnswerVM() {
	}

	public AnswerVM(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String questionId, java.lang.String answerChoice) {
		this._this = _this;
		this.questionId = questionId;
		this.answerChoice = answerChoice;
	}

	/**
	 * Gets the _this value for this AnswerVM.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this AnswerVM.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the questionId value for this AnswerVM.
	 * 
	 * @return questionId
	 */
	public java.lang.String getQuestionId() {
		return questionId;
	}

	/**
	 * Sets the questionId value for this AnswerVM.
	 * 
	 * @param questionId
	 */
	public void setQuestionId(java.lang.String questionId) {
		this.questionId = questionId;
	}

	/**
	 * Gets the answerChoice value for this AnswerVM.
	 * 
	 * @return answerChoice
	 */
	public java.lang.String getAnswerChoice() {
		return answerChoice;
	}

	/**
	 * Sets the answerChoice value for this AnswerVM.
	 * 
	 * @param answerChoice
	 */
	public void setAnswerChoice(java.lang.String answerChoice) {
		this.answerChoice = answerChoice;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AnswerVM)) {
			return false;
		}
		AnswerVM other = (AnswerVM) obj;
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this._this == null && other.get_this() == null) || (this._this != null && this._this
						.equals(other.get_this())))
				&& ((this.questionId == null && other.getQuestionId() == null) || (this.questionId != null && this.questionId
						.equals(other.getQuestionId())))
				&& ((this.answerChoice == null && other.getAnswerChoice() == null) || (this.answerChoice != null && this.answerChoice
						.equals(other.getAnswerChoice())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	@Override
	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (get_this() != null) {
			_hashCode += get_this().hashCode();
		}
		if (getQuestionId() != null) {
			_hashCode += getQuestionId().hashCode();
		}
		if (getAnswerChoice() != null) {
			_hashCode += getAnswerChoice().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AnswerVM.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">AnswerVM"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("questionId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"questionId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("answerChoice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"answerChoice"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
