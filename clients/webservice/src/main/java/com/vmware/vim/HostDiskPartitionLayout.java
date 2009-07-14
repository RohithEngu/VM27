/**
 * HostDiskPartitionLayout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class HostDiskPartitionLayout extends com.vmware.vim.DynamicData
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.HostDiskDimensionsLba total;

	private com.vmware.vim.HostDiskPartitionBlockRange[] partition;

	public HostDiskPartitionLayout() {
	}

	public HostDiskPartitionLayout(java.lang.String dynamicType,
			com.vmware.vim.DynamicProperty[] dynamicProperty,
			com.vmware.vim.HostDiskDimensionsLba total,
			com.vmware.vim.HostDiskPartitionBlockRange[] partition) {
		super(dynamicType, dynamicProperty);
		this.total = total;
		this.partition = partition;
	}

	/**
	 * Gets the total value for this HostDiskPartitionLayout.
	 * 
	 * @return total
	 */
	public com.vmware.vim.HostDiskDimensionsLba getTotal() {
		return total;
	}

	/**
	 * Sets the total value for this HostDiskPartitionLayout.
	 * 
	 * @param total
	 */
	public void setTotal(com.vmware.vim.HostDiskDimensionsLba total) {
		this.total = total;
	}

	/**
	 * Gets the partition value for this HostDiskPartitionLayout.
	 * 
	 * @return partition
	 */
	public com.vmware.vim.HostDiskPartitionBlockRange[] getPartition() {
		return partition;
	}

	/**
	 * Sets the partition value for this HostDiskPartitionLayout.
	 * 
	 * @param partition
	 */
	public void setPartition(
			com.vmware.vim.HostDiskPartitionBlockRange[] partition) {
		this.partition = partition;
	}

	public com.vmware.vim.HostDiskPartitionBlockRange getPartition(int i) {
		return this.partition[i];
	}

	public void setPartition(int i,
			com.vmware.vim.HostDiskPartitionBlockRange _value) {
		this.partition[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof HostDiskPartitionLayout)) {
			return false;
		}
		HostDiskPartitionLayout other = (HostDiskPartitionLayout) obj;
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
				&& ((this.total == null && other.getTotal() == null) || (this.total != null && this.total
						.equals(other.getTotal())))
				&& ((this.partition == null && other.getPartition() == null) || (this.partition != null && java.util.Arrays
						.equals(this.partition, other.getPartition())));
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
		if (getTotal() != null) {
			_hashCode += getTotal().hashCode();
		}
		if (getPartition() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPartition()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPartition(), i);
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
			HostDiskPartitionLayout.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskPartitionLayout"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("total");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "total"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskDimensionsLba"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("partition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"partition"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostDiskPartitionBlockRange"));
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
