/**
 * VirtualDeviceConnectInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class VirtualDeviceConnectInfo extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean startConnected;

	private boolean allowGuestControl;

	private boolean connected;

	public VirtualDeviceConnectInfo() {
	}

	public VirtualDeviceConnectInfo(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			boolean startConnected, boolean allowGuestControl, boolean connected) {
		super(dynamicType, dynamicProperty);
		this.startConnected = startConnected;
		this.allowGuestControl = allowGuestControl;
		this.connected = connected;
	}

	/**
	 * Gets the startConnected value for this VirtualDeviceConnectInfo.
	 * 
	 * @return startConnected
	 */
	public boolean isStartConnected() {
		return startConnected;
	}

	/**
	 * Sets the startConnected value for this VirtualDeviceConnectInfo.
	 * 
	 * @param startConnected
	 */
	public void setStartConnected(boolean startConnected) {
		this.startConnected = startConnected;
	}

	/**
	 * Gets the allowGuestControl value for this VirtualDeviceConnectInfo.
	 * 
	 * @return allowGuestControl
	 */
	public boolean isAllowGuestControl() {
		return allowGuestControl;
	}

	/**
	 * Sets the allowGuestControl value for this VirtualDeviceConnectInfo.
	 * 
	 * @param allowGuestControl
	 */
	public void setAllowGuestControl(boolean allowGuestControl) {
		this.allowGuestControl = allowGuestControl;
	}

	/**
	 * Gets the connected value for this VirtualDeviceConnectInfo.
	 * 
	 * @return connected
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * Sets the connected value for this VirtualDeviceConnectInfo.
	 * 
	 * @param connected
	 */
	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualDeviceConnectInfo)) {
			return false;
		}
		VirtualDeviceConnectInfo other = (VirtualDeviceConnectInfo) obj;
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
		_equals = super.equals(obj)
				&& this.startConnected == other.isStartConnected()
				&& this.allowGuestControl == other.isAllowGuestControl()
				&& this.connected == other.isConnected();
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
		int _hashCode = super.hashCode();
		_hashCode += (isStartConnected() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isAllowGuestControl() ? Boolean.TRUE : Boolean.FALSE)
				.hashCode();
		_hashCode += (isConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualDeviceConnectInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"VirtualDeviceConnectInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("startConnected");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"startConnected"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("allowGuestControl");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"allowGuestControl"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("connected");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"connected"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "boolean"));
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
