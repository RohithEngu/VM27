/**
 * EdgeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim.sms;

public class EdgeStatus implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected EdgeStatus(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _up = "up";
	public static final java.lang.String _degraded = "degraded";
	public static final java.lang.String _down = "down";
	public static final java.lang.String _unknown = "unknown";
	public static final java.lang.String _notReported = "notReported";
	public static final EdgeStatus up = new EdgeStatus(_up);
	public static final EdgeStatus degraded = new EdgeStatus(_degraded);
	public static final EdgeStatus down = new EdgeStatus(_down);
	public static final EdgeStatus unknown = new EdgeStatus(_unknown);
	public static final EdgeStatus notReported = new EdgeStatus(_notReported);

	public java.lang.String getValue() {
		return _value_;
	}

	public static EdgeStatus fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		EdgeStatus enumeration = (EdgeStatus) _table_.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static EdgeStatus fromString(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		return fromValue(value);
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public java.lang.String toString() {
		return _value_;
	}

	public java.lang.Object readResolve() throws java.io.ObjectStreamException {
		return fromValue(_value_);
	}

	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumSerializer(_javaType,
				_xmlType);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.EnumDeserializer(_javaType,
				_xmlType);
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			EdgeStatus.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sm1",
				"EdgeStatus"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
