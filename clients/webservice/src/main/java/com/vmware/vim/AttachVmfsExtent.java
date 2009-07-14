/**
 * AttachVmfsExtent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class AttachVmfsExtent implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private com.vmware.vim.ManagedObjectReference _this;

	private java.lang.String vmfsPath;

	private com.vmware.vim.HostScsiDiskPartition extent;

	public AttachVmfsExtent() {
	}

	public AttachVmfsExtent(com.vmware.vim.ManagedObjectReference _this,
			java.lang.String vmfsPath,
			com.vmware.vim.HostScsiDiskPartition extent) {
		this._this = _this;
		this.vmfsPath = vmfsPath;
		this.extent = extent;
	}

	/**
	 * Gets the _this value for this AttachVmfsExtent.
	 * 
	 * @return _this
	 */
	public com.vmware.vim.ManagedObjectReference get_this() {
		return _this;
	}

	/**
	 * Sets the _this value for this AttachVmfsExtent.
	 * 
	 * @param _this
	 */
	public void set_this(com.vmware.vim.ManagedObjectReference _this) {
		this._this = _this;
	}

	/**
	 * Gets the vmfsPath value for this AttachVmfsExtent.
	 * 
	 * @return vmfsPath
	 */
	public java.lang.String getVmfsPath() {
		return vmfsPath;
	}

	/**
	 * Sets the vmfsPath value for this AttachVmfsExtent.
	 * 
	 * @param vmfsPath
	 */
	public void setVmfsPath(java.lang.String vmfsPath) {
		this.vmfsPath = vmfsPath;
	}

	/**
	 * Gets the extent value for this AttachVmfsExtent.
	 * 
	 * @return extent
	 */
	public com.vmware.vim.HostScsiDiskPartition getExtent() {
		return extent;
	}

	/**
	 * Sets the extent value for this AttachVmfsExtent.
	 * 
	 * @param extent
	 */
	public void setExtent(com.vmware.vim.HostScsiDiskPartition extent) {
		this.extent = extent;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AttachVmfsExtent)) {
			return false;
		}
		AttachVmfsExtent other = (AttachVmfsExtent) obj;
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
				&& ((this.vmfsPath == null && other.getVmfsPath() == null) || (this.vmfsPath != null && this.vmfsPath
						.equals(other.getVmfsPath())))
				&& ((this.extent == null && other.getExtent() == null) || (this.extent != null && this.extent
						.equals(other.getExtent())));
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
		if (getVmfsPath() != null) {
			_hashCode += getVmfsPath().hashCode();
		}
		if (getExtent() != null) {
			_hashCode += getExtent().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AttachVmfsExtent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				">AttachVmfsExtent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("_this");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "_this"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vmfsPath");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"vmfsPath"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("extent");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim2", "extent"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"HostScsiDiskPartition"));
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
