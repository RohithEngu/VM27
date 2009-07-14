/**
 * VAppOvfSectionSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class VAppOvfSectionSpec extends com.vmware.vim25.ArrayUpdateSpec
		implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim25.VAppOvfSectionInfo info;

	public VAppOvfSectionSpec() {
	}

	public VAppOvfSectionSpec(java.lang.String dynamicType,
			com.vmware.vim25.DynamicProperty[] dynamicProperty,
			com.vmware.vim25.ArrayUpdateOperation operation,
			java.lang.Object removeKey, com.vmware.vim25.VAppOvfSectionInfo info) {
		super(dynamicType, dynamicProperty, operation, removeKey);
		this.info = info;
	}

	/**
	 * Gets the info value for this VAppOvfSectionSpec.
	 * 
	 * @return info
	 */
	public com.vmware.vim25.VAppOvfSectionInfo getInfo() {
		return info;
	}

	/**
	 * Sets the info value for this VAppOvfSectionSpec.
	 * 
	 * @param info
	 */
	public void setInfo(com.vmware.vim25.VAppOvfSectionInfo info) {
		this.info = info;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof VAppOvfSectionSpec)) {
			return false;
		}
		VAppOvfSectionSpec other = (VAppOvfSectionSpec) obj;
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
				&& ((this.info == null && other.getInfo() == null) || (this.info != null && this.info
						.equals(other.getInfo())));
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
		if (getInfo() != null) {
			_hashCode += getInfo().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			VAppOvfSectionSpec.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VAppOvfSectionSpec"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("info");
		elemField
				.setXmlName(new javax.xml.namespace.QName("urn:vim25", "info"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"VAppOvfSectionInfo"));
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
