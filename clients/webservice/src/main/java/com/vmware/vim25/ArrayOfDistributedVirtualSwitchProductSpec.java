/**
 * ArrayOfDistributedVirtualSwitchProductSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ArrayOfDistributedVirtualSwitchProductSpec implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.DistributedVirtualSwitchProductSpec[] distributedVirtualSwitchProductSpec;

	public ArrayOfDistributedVirtualSwitchProductSpec() {
	}

	public ArrayOfDistributedVirtualSwitchProductSpec(
			com.vmware.vim25.DistributedVirtualSwitchProductSpec[] distributedVirtualSwitchProductSpec) {
		this.distributedVirtualSwitchProductSpec = distributedVirtualSwitchProductSpec;
	}

	/**
	 * Gets the distributedVirtualSwitchProductSpec value for this
	 * ArrayOfDistributedVirtualSwitchProductSpec.
	 * 
	 * @return distributedVirtualSwitchProductSpec
	 */
	public com.vmware.vim25.DistributedVirtualSwitchProductSpec[] getDistributedVirtualSwitchProductSpec() {
		return distributedVirtualSwitchProductSpec;
	}

	/**
	 * Sets the distributedVirtualSwitchProductSpec value for this
	 * ArrayOfDistributedVirtualSwitchProductSpec.
	 * 
	 * @param distributedVirtualSwitchProductSpec
	 */
	public void setDistributedVirtualSwitchProductSpec(
			com.vmware.vim25.DistributedVirtualSwitchProductSpec[] distributedVirtualSwitchProductSpec) {
		this.distributedVirtualSwitchProductSpec = distributedVirtualSwitchProductSpec;
	}

	public com.vmware.vim25.DistributedVirtualSwitchProductSpec getDistributedVirtualSwitchProductSpec(
			int i) {
		return this.distributedVirtualSwitchProductSpec[i];
	}

	public void setDistributedVirtualSwitchProductSpec(int i,
			com.vmware.vim25.DistributedVirtualSwitchProductSpec _value) {
		this.distributedVirtualSwitchProductSpec[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfDistributedVirtualSwitchProductSpec)) {
			return false;
		}
		ArrayOfDistributedVirtualSwitchProductSpec other = (ArrayOfDistributedVirtualSwitchProductSpec) obj;
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
		_equals = true && ((this.distributedVirtualSwitchProductSpec == null && other
				.getDistributedVirtualSwitchProductSpec() == null) || (this.distributedVirtualSwitchProductSpec != null && java.util.Arrays
				.equals(this.distributedVirtualSwitchProductSpec, other
						.getDistributedVirtualSwitchProductSpec())));
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
		if (getDistributedVirtualSwitchProductSpec() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getDistributedVirtualSwitchProductSpec()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getDistributedVirtualSwitchProductSpec(), i);
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
			ArrayOfDistributedVirtualSwitchProductSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ArrayOfDistributedVirtualSwitchProductSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("distributedVirtualSwitchProductSpec");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchProductSpec"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DistributedVirtualSwitchProductSpec"));
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
