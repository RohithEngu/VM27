/**
 * RoleUpdatedEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class RoleUpdatedEvent extends com.vmware.vim25.RoleEvent implements
		java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String[] privilegeList;

	public RoleUpdatedEvent() {
	}

	public RoleUpdatedEvent(java.lang.String dynamicType,
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
			com.vmware.vim25.RoleEventArgument role,
			java.lang.String[] privilegeList) {
		super(dynamicType, dynamicProperty, key, chainId, createdTime,
				userName, datacenter, computeResource, host, vm, ds, net, dvs,
				fullFormattedMessage, changeTag, role);
		this.privilegeList = privilegeList;
	}

	/**
	 * Gets the privilegeList value for this RoleUpdatedEvent.
	 * 
	 * @return privilegeList
	 */
	public java.lang.String[] getPrivilegeList() {
		return privilegeList;
	}

	/**
	 * Sets the privilegeList value for this RoleUpdatedEvent.
	 * 
	 * @param privilegeList
	 */
	public void setPrivilegeList(java.lang.String[] privilegeList) {
		this.privilegeList = privilegeList;
	}

	public java.lang.String getPrivilegeList(int i) {
		return this.privilegeList[i];
	}

	public void setPrivilegeList(int i, java.lang.String _value) {
		this.privilegeList[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof RoleUpdatedEvent)) {
			return false;
		}
		RoleUpdatedEvent other = (RoleUpdatedEvent) obj;
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
				&& ((this.privilegeList == null && other.getPrivilegeList() == null) || (this.privilegeList != null && java.util.Arrays
						.equals(this.privilegeList, other.getPrivilegeList())));
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
		if (getPrivilegeList() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getPrivilegeList()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getPrivilegeList(), i);
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
			RoleUpdatedEvent.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"RoleUpdatedEvent"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("privilegeList");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25",
				"privilegeList"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
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
