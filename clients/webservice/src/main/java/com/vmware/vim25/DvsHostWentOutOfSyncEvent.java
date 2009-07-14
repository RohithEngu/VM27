/**
 * DvsHostWentOutOfSyncEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DvsHostWentOutOfSyncEvent extends com.vmware.vim25.DvsEvent
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.DvsOutOfSyncHostArgument hostOutOfSync;

	public DvsHostWentOutOfSyncEvent() {
	}

	public DvsHostWentOutOfSyncEvent(java.lang.String dynamicType,
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
			com.vmware.vim25.DvsOutOfSyncHostArgument hostOutOfSync) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag);
		this.hostOutOfSync = hostOutOfSync;
	}

	/**
	 * Gets the hostOutOfSync value for this DvsHostWentOutOfSyncEvent.
	 * 
	 * @return hostOutOfSync
	 */
	public com.vmware.vim25.DvsOutOfSyncHostArgument getHostOutOfSync() {
		return hostOutOfSync;
	}

	/**
	 * Sets the hostOutOfSync value for this DvsHostWentOutOfSyncEvent.
	 * 
	 * @param hostOutOfSync
	 */
	public void setHostOutOfSync(
			com.vmware.vim25.DvsOutOfSyncHostArgument hostOutOfSync) {
		this.hostOutOfSync = hostOutOfSync;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DvsHostWentOutOfSyncEvent)) {
			return false;
		}
		DvsHostWentOutOfSyncEvent other = (DvsHostWentOutOfSyncEvent) obj;
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
				&& ((this.hostOutOfSync == null && other.getHostOutOfSync() == null) || (this.hostOutOfSync != null && this.hostOutOfSync
						.equals(other.getHostOutOfSync())));
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
		if (getHostOutOfSync() != null) {
			_hashCode += getHostOutOfSync().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DvsHostWentOutOfSyncEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DvsHostWentOutOfSyncEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("hostOutOfSync");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"hostOutOfSync"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DvsOutOfSyncHostArgument"));
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
