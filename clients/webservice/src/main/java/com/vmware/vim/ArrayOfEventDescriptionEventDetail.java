/**
 * ArrayOfEventDescriptionEventDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim;

public class ArrayOfEventDescriptionEventDetail implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.vmware.vim.EventDescriptionEventDetail[] eventDescriptionEventDetail;

	public ArrayOfEventDescriptionEventDetail() {
	}

	public ArrayOfEventDescriptionEventDetail(
			com.vmware.vim.EventDescriptionEventDetail[] eventDescriptionEventDetail) {
		this.eventDescriptionEventDetail = eventDescriptionEventDetail;
	}

	/**
	 * Gets the eventDescriptionEventDetail value for this
	 * ArrayOfEventDescriptionEventDetail.
	 * 
	 * @return eventDescriptionEventDetail
	 */
	public com.vmware.vim.EventDescriptionEventDetail[] getEventDescriptionEventDetail() {
		return eventDescriptionEventDetail;
	}

	/**
	 * Sets the eventDescriptionEventDetail value for this
	 * ArrayOfEventDescriptionEventDetail.
	 * 
	 * @param eventDescriptionEventDetail
	 */
	public void setEventDescriptionEventDetail(
			com.vmware.vim.EventDescriptionEventDetail[] eventDescriptionEventDetail) {
		this.eventDescriptionEventDetail = eventDescriptionEventDetail;
	}

	public com.vmware.vim.EventDescriptionEventDetail getEventDescriptionEventDetail(
			int i) {
		return this.eventDescriptionEventDetail[i];
	}

	public void setEventDescriptionEventDetail(int i,
			com.vmware.vim.EventDescriptionEventDetail _value) {
		this.eventDescriptionEventDetail[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	@Override
	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ArrayOfEventDescriptionEventDetail)) {
			return false;
		}
		ArrayOfEventDescriptionEventDetail other = (ArrayOfEventDescriptionEventDetail) obj;
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
		_equals = true && ((this.eventDescriptionEventDetail == null && other
				.getEventDescriptionEventDetail() == null) || (this.eventDescriptionEventDetail != null && java.util.Arrays
				.equals(this.eventDescriptionEventDetail, other
						.getEventDescriptionEventDetail())));
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
		if (getEventDescriptionEventDetail() != null) {
			for (int i = 0; i < java.lang.reflect.Array
					.getLength(getEventDescriptionEventDetail()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(
						getEventDescriptionEventDetail(), i);
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
			ArrayOfEventDescriptionEventDetail.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"ArrayOfEventDescriptionEventDetail"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("eventDescriptionEventDetail");
		elemField.setXmlName(new javax.xml.namespace.QName("urn:vim2",
				"EventDescriptionEventDetail"));
		elemField.setXmlType(new javax.xml.namespace.QName("urn:vim2",
				"EventDescriptionEventDetail"));
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
