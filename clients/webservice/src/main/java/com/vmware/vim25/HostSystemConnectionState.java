/**
 * HostSystemConnectionState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class HostSystemConnectionState implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private java.lang.String _value_;
	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor
	protected HostSystemConnectionState(java.lang.String value) {
		_value_ = value;
		_table_.put(_value_, this);
	}

	public static final java.lang.String _connected = "connected";
	public static final java.lang.String _notResponding = "notResponding";
	public static final java.lang.String _disconnected = "disconnected";
	public static final HostSystemConnectionState connected = new HostSystemConnectionState(
			_connected);
	public static final HostSystemConnectionState notResponding = new HostSystemConnectionState(
			_notResponding);
	public static final HostSystemConnectionState disconnected = new HostSystemConnectionState(
			_disconnected);

	public java.lang.String getValue() {
		return _value_;
	}

	public static HostSystemConnectionState fromValue(java.lang.String value)
			throws java.lang.IllegalArgumentException {
		HostSystemConnectionState enumeration = (HostSystemConnectionState) _table_
				.get(value);
		if (enumeration == null) {
			throw new java.lang.IllegalArgumentException();
		}
		return enumeration;
	}

	public static HostSystemConnectionState fromString(java.lang.String value)
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
			HostSystemConnectionState.class);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25",
				"HostSystemConnectionState"));
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

}
