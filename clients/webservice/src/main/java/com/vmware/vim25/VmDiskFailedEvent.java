/**
 * VmDiskFailedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VmDiskFailedEvent extends com.vmware.vim25.VmEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.String disk;

	private com.vmware.vim25.LocalizedMethodFault reason;

	public VmDiskFailedEvent() {
	}

	public VmDiskFailedEvent(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty, int key,
			int chainId, java.util.Calendar createdTime,
			java.lang.String userName,
			com.vmware.vim25.DatacenterEventArgument datacenter,
			com.vmware.vim25.ComputeResourceEventArgument computeResource,
			com.vmware.vim25.HostEventArgument host,
			com.vmware.vim25.VmEventArgument vm,
			com.vmware.vim25.DatastoreEventArgument ds,
			com.vmware.vim25.NetworkEventArgument net,
			com.vmware.vim25.DvsEventArgument dvs,
			java.lang.String fullFormattedMessage, java.lang.String changeTag,
			boolean template, java.lang.String disk,
			com.vmware.vim25.LocalizedMethodFault reason) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, template);
		this.disk = disk;
		this.reason = reason;
	}

	/**
	 * Gets the disk value for this VmDiskFailedEvent.
	 * 
	 * @return disk
	 */
	public java.lang.String getDisk() {
		return disk;
	}

	/**
	 * Sets the disk value for this VmDiskFailedEvent.
	 * 
	 * @param disk
	 */
	public void setDisk(java.lang.String disk) {
		this.disk = disk;
	}

	/**
	 * Gets the reason value for this VmDiskFailedEvent.
	 * 
	 * @return reason
	 */
	public com.vmware.vim25.LocalizedMethodFault getReason() {
		return reason;
	}

	/**
	 * Sets the reason value for this VmDiskFailedEvent.
	 * 
	 * @param reason
	 */
	public void setReason(com.vmware.vim25.LocalizedMethodFault reason) {
		this.reason = reason;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VmDiskFailedEvent)) {
			return false;
		}
		VmDiskFailedEvent other = (VmDiskFailedEvent) obj;
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
				&& ((this.disk == null && other.getDisk() == null) || (this.disk != null && this.disk
						.equals(other.getDisk())))
				&& ((this.reason == null && other.getReason() == null) || (this.reason != null && this.reason
						.equals(other.getReason())));
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
		if (getDisk() != null) {
			_hashCode += getDisk().hashCode();
		}
		if (getReason() != null) {
			_hashCode += getReason().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VmDiskFailedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VmDiskFailedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("disk");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "disk"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("reason");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"reason"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"LocalizedMethodFault"));
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
