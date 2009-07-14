/**
 * DvsPortBlockedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class DvsPortBlockedEvent extends com.vmware.vim25.DvsEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String portKey;

	public DvsPortBlockedEvent() {
	}

	public DvsPortBlockedEvent(java.lang.String dynamicType,
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
			java.lang.String portKey) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag);
		this.portKey = portKey;
	}

	/**
	 * Gets the portKey value for this DvsPortBlockedEvent.
	 * 
	 * @return portKey
	 */
	public java.lang.String getPortKey() {
		return portKey;
	}

	/**
	 * Sets the portKey value for this DvsPortBlockedEvent.
	 * 
	 * @param portKey
	 */
	public void setPortKey(java.lang.String portKey) {
		this.portKey = portKey;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof DvsPortBlockedEvent)) {
			return false;
		}
		DvsPortBlockedEvent other = (DvsPortBlockedEvent) obj;
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
				&& ((this.portKey == null && other.getPortKey() == null) || (this.portKey != null && this.portKey
						.equals(other.getPortKey())));
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
		if (getPortKey() != null) {
			_hashCode += getPortKey().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			DvsPortBlockedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"DvsPortBlockedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("portKey");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"portKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
