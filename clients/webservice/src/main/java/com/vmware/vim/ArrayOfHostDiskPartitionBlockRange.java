/**
 * ArrayOfHostDiskPartitionBlockRange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfHostDiskPartitionBlockRange implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.HostDiskPartitionBlockRange[] hostDiskPartitionBlockRange;

	public ArrayOfHostDiskPartitionBlockRange() {
	}

	public ArrayOfHostDiskPartitionBlockRange(
			com.vmware.vim.HostDiskPartitionBlockRange[] hostDiskPartitionBlockRange) {
		this.hostDiskPartitionBlockRange = hostDiskPartitionBlockRange;
	}

	/**
	 * Gets the hostDiskPartitionBlockRange value for this
	 * ArrayOfHostDiskPartitionBlockRange.
	 * 
	 * @return hostDiskPartitionBlockRange
	 */
	public com.vmware.vim.HostDiskPartitionBlockRange[] getHostDiskPartitionBlockRange() {
		return hostDiskPartitionBlockRange;
	}

	/**
	 * Sets the hostDiskPartitionBlockRange value for this
	 * ArrayOfHostDiskPartitionBlockRange.
	 * 
	 * @param hostDiskPartitionBlockRange
	 */
	public void setHostDiskPartitionBlockRange(
			com.vmware.vim.HostDiskPartitionBlockRange[] hostDiskPartitionBlockRange) {
		this.hostDiskPartitionBlockRange = hostDiskPartitionBlockRange;
	}

	public com.vmware.vim.HostDiskPartitionBlockRange getHostDiskPartitionBlockRange(
			int i) {
		return this.hostDiskPartitionBlockRange[i];
	}

	public void setHostDiskPartitionBlockRange(int i,
			com.vmware.vim.HostDiskPartitionBlockRange _value) {
		this.hostDiskPartitionBlockRange[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfHostDiskPartitionBlockRange)) {
			return false;
		}
		ArrayOfHostDiskPartitionBlockRange other = (ArrayOfHostDiskPartitionBlockRange) obj;
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
		_equals = true && ((this.hostDiskPartitionBlockRange == null && other
				.getHostDiskPartitionBlockRange() == null) || (this.hostDiskPartitionBlockRange != null && java.util.Arrays
				.equals(this.hostDiskPartitionBlockRange, other
						.getHostDiskPartitionBlockRange())));
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
		if (getHostDiskPartitionBlockRange() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getHostDiskPartitionBlockRange()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getHostDiskPartitionBlockRange(), i);
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
			ArrayOfHostDiskPartitionBlockRange.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfHostDiskPartitionBlockRange"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostDiskPartitionBlockRange");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskPartitionBlockRange"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskPartitionBlockRange"));
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
