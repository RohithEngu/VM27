/**
 * SelectActivePartition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class SelectActivePartition implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private com.vmware.vim.HostScsiDiskPartition partition;

	public SelectActivePartition() {
	}

	public SelectActivePartition(com.vmware.vim.ManagedObjectReference _this,
			com.vmware.vim.HostScsiDiskPartition partition) {
		this._this = _this;
		this.partition = partition;
	}

	/**
	 * Gets the _this value for this SelectActivePartition.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this SelectActivePartition.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the partition value for this SelectActivePartition.
	 * 
	 * @return partition
	 */
	public com.vmware.vim.HostScsiDiskPartition getPartition() {
		return partition;
	}

	/**
	 * Sets the partition value for this SelectActivePartition.
	 * 
	 * @param partition
	 */
	public void setPartition(com.vmware.vim.HostScsiDiskPartition partition) {
		this.partition = partition;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof SelectActivePartition)) {
			return false;
		}
		SelectActivePartition other = (SelectActivePartition) obj;
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
				&& ((this.partition == null && other.getPartition() == null) || (this.partition != null && this.partition
						.equals(other.getPartition())));
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
		if (getPartition() != null) {
			_hashCode += getPartition().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			SelectActivePartition.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">SelectActivePartition"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("partition");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"partition"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostScsiDiskPartition"));
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
