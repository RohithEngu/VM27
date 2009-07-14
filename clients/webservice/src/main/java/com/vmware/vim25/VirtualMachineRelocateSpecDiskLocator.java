/**
 * VirtualMachineRelocateSpecDiskLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VirtualMachineRelocateSpecDiskLocator extends
		com.vmware.vim25.DynamicData implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int diskId;

	private com.vmware.vim25.ManagedObjectReference datastore;

	private java.lang.String diskMoveType;

	public VirtualMachineRelocateSpecDiskLocator() {
	}

	public VirtualMachineRelocateSpecDiskLocator(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int diskId,
			com.vmware.vim25.ManagedObjectReference datastore,
			java.lang.String diskMoveType) {
		super(dynamicType, dynamicProperty);
		this.diskId = diskId;
		this.datastore = datastore;
		this.diskMoveType = diskMoveType;
	}

	/**
	 * Gets the diskId value for this VirtualMachineRelocateSpecDiskLocator.
	 * 
	 * @return diskId
	 */
	public int getDiskId() {
		return diskId;
	}

	/**
	 * Sets the diskId value for this VirtualMachineRelocateSpecDiskLocator.
	 * 
	 * @param diskId
	 */
	public void setDiskId(int diskId) {
		this.diskId = diskId;
	}

	/**
	 * Gets the datastore value for this VirtualMachineRelocateSpecDiskLocator.
	 * 
	 * @return datastore
	 */
	public com.vmware.vim25.ManagedObjectReference getDatastore() {
		return datastore;
	}

	/**
	 * Sets the datastore value for this VirtualMachineRelocateSpecDiskLocator.
	 * 
	 * @param datastore
	 */
	public void setDatastore(com.vmware.vim25.ManagedObjectReference datastore) {
		this.datastore = datastore;
	}

	/**
	 * Gets the diskMoveType value for this
	 * VirtualMachineRelocateSpecDiskLocator.
	 * 
	 * @return diskMoveType
	 */
	public java.lang.String getDiskMoveType() {
		return diskMoveType;
	}

	/**
	 * Sets the diskMoveType value for this
	 * VirtualMachineRelocateSpecDiskLocator.
	 * 
	 * @param diskMoveType
	 */
	public void setDiskMoveType(java.lang.String diskMoveType) {
		this.diskMoveType = diskMoveType;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VirtualMachineRelocateSpecDiskLocator)) {
			return false;
		}
		VirtualMachineRelocateSpecDiskLocator other = (VirtualMachineRelocateSpecDiskLocator) obj;
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
				&& this.diskId == other.getDiskId()
				&& ((this.datastore == null && other.getDatastore() == null) || (this.datastore != null && this.datastore
						.equals(other.getDatastore())))
				&& ((this.diskMoveType == null && other.getDiskMoveType() == null) || (this.diskMoveType != null && this.diskMoveType
						.equals(other.getDiskMoveType())));
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
		_hashCode += getDiskId();
		if (getDatastore() != null) {
			_hashCode += getDatastore().hashCode();
		}
		if (getDiskMoveType() != null) {
			_hashCode += getDiskMoveType().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VirtualMachineRelocateSpecDiskLocator.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VirtualMachineRelocateSpecDiskLocator"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskId");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"diskId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("datastore");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"datastore"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"ManagedObjectReference"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("diskMoveType");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"diskMoveType"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
