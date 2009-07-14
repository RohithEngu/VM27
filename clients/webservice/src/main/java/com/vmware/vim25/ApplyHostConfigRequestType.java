/**
 * ApplyHostConfigRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ApplyHostConfigRequestType implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim25.ManagedObjectReference _this;

	private com.vmware.vim25.ManagedObjectReference host;

	private com.vmware.vim25.HostConfigSpec configSpec;

	public ApplyHostConfigRequestType() {
	}

	public ApplyHostConfigRequestType(
			com.vmware.vim25.ManagedObjectReference _this,
			com.vmware.vim25.ManagedObjectReference host,
			com.vmware.vim25.HostConfigSpec configSpec) {
		this._this = _this;
		this.host = host;
		this.configSpec = configSpec;
	}

	/**
	 * Gets the _this value for this ApplyHostConfigRequestType.
	 * 
	 * @return _this
	 */
	public com.vmware.vim25.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this ApplyHostConfigRequestType.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim25.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the host value for this ApplyHostConfigRequestType.
	 * 
	 * @return host
	 */
	public com.vmware.vim25.ManagedObjectReference getHost() {
		return host;
	}

	/**
	 * Sets the host value for this ApplyHostConfigRequestType.
	 * 
	 * @param host
	 */
	public void setHost(com.vmware.vim25.ManagedObjectReference host) {
		this.host = host;
	}

	/**
	 * Gets the configSpec value for this ApplyHostConfigRequestType.
	 * 
	 * @return configSpec
	 */
	public com.vmware.vim25.HostConfigSpec getConfigSpec() {
		return configSpec;
	}

	/**
	 * Sets the configSpec value for this ApplyHostConfigRequestType.
	 * 
	 * @param configSpec
	 */
	public void setConfigSpec(com.vmware.vim25.HostConfigSpec configSpec) {
		this.configSpec = configSpec;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ApplyHostConfigRequestType)) {
			return false;
		}
		ApplyHostConfigRequestType other = (ApplyHostConfigRequestType) obj;
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
				&& ((this.host == null && other.getHost() == null) || (this.host != null && this.host
						.equals(other.getHost())))
				&& ((this.configSpec == null && other.getConfigSpec() == null) || (this.configSpec != null && this.configSpec
						.equals(other.getConfigSpec())));
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
		if (getHost() != null) {
			_hashCode += getHost().hashCode();
		}
		if (getConfigSpec() != null) {
			_hashCode += getConfigSpec().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ApplyHostConfigRequestType.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ApplyHostConfigRequestType"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("host");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "host"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("configSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"configSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostConfigSpec"));
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
