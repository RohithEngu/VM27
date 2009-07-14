/**
 * SetTaskStateRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class SetTaskStateRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.TaskInfoState state;

	private java.lang.Object result;

	private com.vmware.vim25.LocalizedMethodFault fault;

	public SetTaskStateRequestType() {
	}

	public SetTaskStateRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.TaskInfoState state, java.lang.Object result,
			com.vmware.vim25.LocalizedMethodFault fault) {
		this._this = _this;
		this.state = state;
		this.result = result;
		this.fault = fault;
	}

	/**
	 * Gets the _this value for this SetTaskStateRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this SetTaskStateRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the state value for this SetTaskStateRequestType.
	 * 
	 * @return state
	 */
	public com.vmware.vim25.TaskInfoState getState() {
		return state;
	}

	/**
	 * Sets the state value for this SetTaskStateRequestType.
	 * 
	 * @param state
	 */
	public void setState(com.vmware.vim25.TaskInfoState state) {
		this.state = state;
	}

	/**
	 * Gets the result value for this SetTaskStateRequestType.
	 * 
	 * @return result
	 */
	public java.lang.Object getResult() {
		return result;
	}

	/**
	 * Sets the result value for this SetTaskStateRequestType.
	 * 
	 * @param result
	 */
	public void setResult(java.lang.Object result) {
		this.result = result;
	}

	/**
	 * Gets the fault value for this SetTaskStateRequestType.
	 * 
	 * @return fault
	 */
	public com.vmware.vim25.LocalizedMethodFault getFault() {
		return fault;
	}

	/**
	 * Sets the fault value for this SetTaskStateRequestType.
	 * 
	 * @param fault
	 */
	public void setFault(com.vmware.vim25.LocalizedMethodFault fault) {
		this.fault = fault;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SetTaskStateRequestType)) {
			return false;
		}
		SetTaskStateRequestType other = (SetTaskStateRequestType) obj;
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
				&& ((this.state == null && other.getState() == null) || (this.state != null && this.state
						.equals(other.getState())))
				&& ((this.result == null && other.getResult() == null) || (this.result != null && this.result
						.equals(other.getResult())))
				&& ((this.fault == null && other.getFault() == null) || (this.fault != null && this.fault
						.equals(other.getFault())));
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
		if (getState() != null) {
			_hashCode += getState().hashCode();
		}
		if (getResult() != null) {
			_hashCode += getResult().hashCode();
		}
		if (getFault() != null) {
			_hashCode += getFault().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			SetTaskStateRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"SetTaskStateRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("state");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "state"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"TaskInfoState"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("result");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"result"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "anyType"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("fault");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "fault"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizedMethodFault"));
		elemField.setMinOccurs(0);
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
