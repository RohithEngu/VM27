/**
 * ArrayOfHostUnresolvedVmfsVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfHostUnresolvedVmfsVolume implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.HostUnresolvedVmfsVolume[] hostUnresolvedVmfsVolume;

	public ArrayOfHostUnresolvedVmfsVolume() {
	}

	public ArrayOfHostUnresolvedVmfsVolume(
			com.vmware.vim25.HostUnresolvedVmfsVolume[] hostUnresolvedVmfsVolume) {
		this.hostUnresolvedVmfsVolume = hostUnresolvedVmfsVolume;
	}

	/**
	 * Gets the hostUnresolvedVmfsVolume value for this
	 * ArrayOfHostUnresolvedVmfsVolume.
	 * 
	 * @return hostUnresolvedVmfsVolume
	 */
	public com.vmware.vim25.HostUnresolvedVmfsVolume[] getHostUnresolvedVmfsVolume() {
		return hostUnresolvedVmfsVolume;
	}

	/**
	 * Sets the hostUnresolvedVmfsVolume value for this
	 * ArrayOfHostUnresolvedVmfsVolume.
	 * 
	 * @param hostUnresolvedVmfsVolume
	 */
	public void setHostUnresolvedVmfsVolume(
			com.vmware.vim25.HostUnresolvedVmfsVolume[] hostUnresolvedVmfsVolume) {
		this.hostUnresolvedVmfsVolume = hostUnresolvedVmfsVolume;
	}

	public com.vmware.vim25.HostUnresolvedVmfsVolume getHostUnresolvedVmfsVolume(
			int i) {
		return this.hostUnresolvedVmfsVolume[i];
	}

	public void setHostUnresolvedVmfsVolume(int i,
			com.vmware.vim25.HostUnresolvedVmfsVolume _value) {
		this.hostUnresolvedVmfsVolume[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostUnresolvedVmfsVolume)) {
			return false;
		}
		ArrayOfHostUnresolvedVmfsVolume other = (ArrayOfHostUnresolvedVmfsVolume) obj;
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
		_equals = true && ((this.hostUnresolvedVmfsVolume == null && other
				.getHostUnresolvedVmfsVolume() == null) || (this.hostUnresolvedVmfsVolume != null && java.util.Arrays
				.equals(this.hostUnresolvedVmfsVolume, other
						.getHostUnresolvedVmfsVolume())));
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
		if (getHostUnresolvedVmfsVolume() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostUnresolvedVmfsVolume()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostUnresolvedVmfsVolume(), i);
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
			ArrayOfHostUnresolvedVmfsVolume.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfHostUnresolvedVmfsVolume"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostUnresolvedVmfsVolume");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"HostUnresolvedVmfsVolume"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostUnresolvedVmfsVolume"));
		elemField.setMinOccurs(0);
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
