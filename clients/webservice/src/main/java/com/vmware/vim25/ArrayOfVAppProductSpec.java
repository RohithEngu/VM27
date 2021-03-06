/**
 * ArrayOfVAppProductSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfVAppProductSpec implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.VAppProductSpec[] VAppProductSpec;

	public ArrayOfVAppProductSpec() {
	}

	public ArrayOfVAppProductSpec(
			com.vmware.vim25.VAppProductSpec[] VAppProductSpec) {
		this.VAppProductSpec = VAppProductSpec;
	}

	/**
	 * Gets the VAppProductSpec value for this ArrayOfVAppProductSpec.
	 * 
	 * @return VAppProductSpec
	 */
	public com.vmware.vim25.VAppProductSpec[] getVAppProductSpec() {
		return VAppProductSpec;
	}

	/**
	 * Sets the VAppProductSpec value for this ArrayOfVAppProductSpec.
	 * 
	 * @param VAppProductSpec
	 */
	public void setVAppProductSpec(
			com.vmware.vim25.VAppProductSpec[] VAppProductSpec) {
		this.VAppProductSpec = VAppProductSpec;
	}

	public com.vmware.vim25.VAppProductSpec getVAppProductSpec(int i) {
		return this.VAppProductSpec[i];
	}

	public void setVAppProductSpec(int i,
			com.vmware.vim25.VAppProductSpec _value) {
		this.VAppProductSpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfVAppProductSpec)) {
			return false;
		}
		ArrayOfVAppProductSpec other = (ArrayOfVAppProductSpec) obj;
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
		_equals = true && ((this.VAppProductSpec == null && other
				.getVAppProductSpec() == null) || (this.VAppProductSpec != null && java.util.Arrays
				.equals(this.VAppProductSpec, other.getVAppProductSpec())));
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
		if (getVAppProductSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getVAppProductSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getVAppProductSpec(), i);
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
			ArrayOfVAppProductSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfVAppProductSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("VAppProductSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"VAppProductSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VAppProductSpec"));
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
