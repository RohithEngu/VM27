/**
 * UpdateInternetScsiAdvancedOptionsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class UpdateInternetScsiAdvancedOptionsRequestType implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private java.lang.String iScsiHbaDevice;

	private com.vmware.vim25.HostInternetScsiHbaTargetSet targetSet;

	private com.vmware.vim25.HostInternetScsiHbaParamValue[] options;

	public UpdateInternetScsiAdvancedOptionsRequestType() {
	}

	public UpdateInternetScsiAdvancedOptionsRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			java.lang.String iScsiHbaDevice,
			com.vmware.vim25.HostInternetScsiHbaTargetSet targetSet,
			com.vmware.vim25.HostInternetScsiHbaParamValue[] options) {
		this._this = _this;
		this.iScsiHbaDevice = iScsiHbaDevice;
		this.targetSet = targetSet;
		this.options = options;
	}

	/**
	 * Gets the _this value for this
	 * UpdateInternetScsiAdvancedOptionsRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this
	 * UpdateInternetScsiAdvancedOptionsRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the iScsiHbaDevice value for this
	 * UpdateInternetScsiAdvancedOptionsRequestType.
	 * 
	 * @return iScsiHbaDevice
	 */
	public java.lang.String getIScsiHbaDevice() {
		return iScsiHbaDevice;
	}

	/**
	 * Sets the iScsiHbaDevice value for this
	 * UpdateInternetScsiAdvancedOptionsRequestType.
	 * 
	 * @param iScsiHbaDevice
	 */
	public void setIScsiHbaDevice(java.lang.String iScsiHbaDevice) {
		this.iScsiHbaDevice = iScsiHbaDevice;
	}

	/**
	 * Gets the targetSet value for this
	 * UpdateInternetScsiAdvancedOptionsRequestType.
	 * 
	 * @return targetSet
	 */
	public com.vmware.vim25.HostInternetScsiHbaTargetSet getTargetSet() {
		return targetSet;
	}

	/**
	 * Sets the targetSet value for this
	 * UpdateInternetScsiAdvancedOptionsRequestType.
	 * 
	 * @param targetSet
	 */
	public void setTargetSet(
			com.vmware.vim25.HostInternetScsiHbaTargetSet targetSet) {
		this.targetSet = targetSet;
	}

	/**
	 * Gets the options value for this
	 * UpdateInternetScsiAdvancedOptionsRequestType.
	 * 
	 * @return options
	 */
	public com.vmware.vim25.HostInternetScsiHbaParamValue[] getOptions() {
		return options;
	}

	/**
	 * Sets the options value for this
	 * UpdateInternetScsiAdvancedOptionsRequestType.
	 * 
	 * @param options
	 */
	public void setOptions(
			com.vmware.vim25.HostInternetScsiHbaParamValue[] options) {
		this.options = options;
	}

	public com.vmware.vim25.HostInternetScsiHbaParamValue getOptions(int i) {
		return this.options[i];
	}

	public void setOptions(int i,
			com.vmware.vim25.HostInternetScsiHbaParamValue _value) {
		this.options[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof UpdateInternetScsiAdvancedOptionsRequestType)) {
			return false;
		}
		UpdateInternetScsiAdvancedOptionsRequestType other = (UpdateInternetScsiAdvancedOptionsRequestType) obj;
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
				&& ((this.iScsiHbaDevice == null && other.getIScsiHbaDevice() == null) || (this.iScsiHbaDevice != null && this.iScsiHbaDevice
						.equals(other.getIScsiHbaDevice())))
				&& ((this.targetSet == null && other.getTargetSet() == null) || (this.targetSet != null && this.targetSet
						.equals(other.getTargetSet())))
				&& ((this.options == null && other.getOptions() == null) || (this.options != null && java.util.Arrays
						.equals(this.options, other.getOptions())));
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
		if (getIScsiHbaDevice() != null) {
			_hashCode += getIScsiHbaDevice().hashCode();
		}
		if (getTargetSet() != null) {
			_hashCode += getTargetSet().hashCode();
		}
		if (getOptions() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getOptions()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getOptions(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			UpdateInternetScsiAdvancedOptionsRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"UpdateInternetScsiAdvancedOptionsRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("IScsiHbaDevice");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"iScsiHbaDevice"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("targetSet");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"targetSet"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaTargetSet"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("options");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"options"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostInternetScsiHbaParamValue"));
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
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
