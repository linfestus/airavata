/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.data.movement;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Data Movement through Secured Copy
 * 
 * alternativeSCPHostName:
 *  If the login to scp is different than the hostname itself, specify it here
 * 
 * sshPort:
 *  If a non-default port needs to used, specify it.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-07-07")
public class SCPDataMovement implements org.apache.thrift.TBase<SCPDataMovement, SCPDataMovement._Fields>, java.io.Serializable, Cloneable, Comparable<SCPDataMovement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SCPDataMovement");

  private static final org.apache.thrift.protocol.TField DATA_MOVEMENT_INTERFACE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("dataMovementInterfaceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SECURITY_PROTOCOL_FIELD_DESC = new org.apache.thrift.protocol.TField("securityProtocol", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField ALTERNATIVE_SCPHOST_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("alternativeSCPHostName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SSH_PORT_FIELD_DESC = new org.apache.thrift.protocol.TField("sshPort", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SCPDataMovementStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SCPDataMovementTupleSchemeFactory());
  }

  private String dataMovementInterfaceId; // required
  private SecurityProtocol securityProtocol; // required
  private String alternativeSCPHostName; // optional
  private int sshPort; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATA_MOVEMENT_INTERFACE_ID((short)1, "dataMovementInterfaceId"),
    /**
     * 
     * @see SecurityProtocol
     */
    SECURITY_PROTOCOL((short)2, "securityProtocol"),
    ALTERNATIVE_SCPHOST_NAME((short)3, "alternativeSCPHostName"),
    SSH_PORT((short)4, "sshPort");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DATA_MOVEMENT_INTERFACE_ID
          return DATA_MOVEMENT_INTERFACE_ID;
        case 2: // SECURITY_PROTOCOL
          return SECURITY_PROTOCOL;
        case 3: // ALTERNATIVE_SCPHOST_NAME
          return ALTERNATIVE_SCPHOST_NAME;
        case 4: // SSH_PORT
          return SSH_PORT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SSHPORT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ALTERNATIVE_SCPHOST_NAME,_Fields.SSH_PORT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATA_MOVEMENT_INTERFACE_ID, new org.apache.thrift.meta_data.FieldMetaData("dataMovementInterfaceId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SECURITY_PROTOCOL, new org.apache.thrift.meta_data.FieldMetaData("securityProtocol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SecurityProtocol.class)));
    tmpMap.put(_Fields.ALTERNATIVE_SCPHOST_NAME, new org.apache.thrift.meta_data.FieldMetaData("alternativeSCPHostName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SSH_PORT, new org.apache.thrift.meta_data.FieldMetaData("sshPort", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SCPDataMovement.class, metaDataMap);
  }

  public SCPDataMovement() {
    this.dataMovementInterfaceId = "DO_NOT_SET_AT_CLIENTS";

    this.sshPort = 22;

  }

  public SCPDataMovement(
    String dataMovementInterfaceId,
    SecurityProtocol securityProtocol)
  {
    this();
    this.dataMovementInterfaceId = dataMovementInterfaceId;
    this.securityProtocol = securityProtocol;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SCPDataMovement(SCPDataMovement other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDataMovementInterfaceId()) {
      this.dataMovementInterfaceId = other.dataMovementInterfaceId;
    }
    if (other.isSetSecurityProtocol()) {
      this.securityProtocol = other.securityProtocol;
    }
    if (other.isSetAlternativeSCPHostName()) {
      this.alternativeSCPHostName = other.alternativeSCPHostName;
    }
    this.sshPort = other.sshPort;
  }

  public SCPDataMovement deepCopy() {
    return new SCPDataMovement(this);
  }

  @Override
  public void clear() {
    this.dataMovementInterfaceId = "DO_NOT_SET_AT_CLIENTS";

    this.securityProtocol = null;
    this.alternativeSCPHostName = null;
    this.sshPort = 22;

  }

  public String getDataMovementInterfaceId() {
    return this.dataMovementInterfaceId;
  }

  public void setDataMovementInterfaceId(String dataMovementInterfaceId) {
    this.dataMovementInterfaceId = dataMovementInterfaceId;
  }

  public void unsetDataMovementInterfaceId() {
    this.dataMovementInterfaceId = null;
  }

  /** Returns true if field dataMovementInterfaceId is set (has been assigned a value) and false otherwise */
  public boolean isSetDataMovementInterfaceId() {
    return this.dataMovementInterfaceId != null;
  }

  public void setDataMovementInterfaceIdIsSet(boolean value) {
    if (!value) {
      this.dataMovementInterfaceId = null;
    }
  }

  /**
   * 
   * @see SecurityProtocol
   */
  public SecurityProtocol getSecurityProtocol() {
    return this.securityProtocol;
  }

  /**
   * 
   * @see SecurityProtocol
   */
  public void setSecurityProtocol(SecurityProtocol securityProtocol) {
    this.securityProtocol = securityProtocol;
  }

  public void unsetSecurityProtocol() {
    this.securityProtocol = null;
  }

  /** Returns true if field securityProtocol is set (has been assigned a value) and false otherwise */
  public boolean isSetSecurityProtocol() {
    return this.securityProtocol != null;
  }

  public void setSecurityProtocolIsSet(boolean value) {
    if (!value) {
      this.securityProtocol = null;
    }
  }

  public String getAlternativeSCPHostName() {
    return this.alternativeSCPHostName;
  }

  public void setAlternativeSCPHostName(String alternativeSCPHostName) {
    this.alternativeSCPHostName = alternativeSCPHostName;
  }

  public void unsetAlternativeSCPHostName() {
    this.alternativeSCPHostName = null;
  }

  /** Returns true if field alternativeSCPHostName is set (has been assigned a value) and false otherwise */
  public boolean isSetAlternativeSCPHostName() {
    return this.alternativeSCPHostName != null;
  }

  public void setAlternativeSCPHostNameIsSet(boolean value) {
    if (!value) {
      this.alternativeSCPHostName = null;
    }
  }

  public int getSshPort() {
    return this.sshPort;
  }

  public void setSshPort(int sshPort) {
    this.sshPort = sshPort;
    setSshPortIsSet(true);
  }

  public void unsetSshPort() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SSHPORT_ISSET_ID);
  }

  /** Returns true if field sshPort is set (has been assigned a value) and false otherwise */
  public boolean isSetSshPort() {
    return EncodingUtils.testBit(__isset_bitfield, __SSHPORT_ISSET_ID);
  }

  public void setSshPortIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SSHPORT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA_MOVEMENT_INTERFACE_ID:
      if (value == null) {
        unsetDataMovementInterfaceId();
      } else {
        setDataMovementInterfaceId((String)value);
      }
      break;

    case SECURITY_PROTOCOL:
      if (value == null) {
        unsetSecurityProtocol();
      } else {
        setSecurityProtocol((SecurityProtocol)value);
      }
      break;

    case ALTERNATIVE_SCPHOST_NAME:
      if (value == null) {
        unsetAlternativeSCPHostName();
      } else {
        setAlternativeSCPHostName((String)value);
      }
      break;

    case SSH_PORT:
      if (value == null) {
        unsetSshPort();
      } else {
        setSshPort((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA_MOVEMENT_INTERFACE_ID:
      return getDataMovementInterfaceId();

    case SECURITY_PROTOCOL:
      return getSecurityProtocol();

    case ALTERNATIVE_SCPHOST_NAME:
      return getAlternativeSCPHostName();

    case SSH_PORT:
      return getSshPort();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA_MOVEMENT_INTERFACE_ID:
      return isSetDataMovementInterfaceId();
    case SECURITY_PROTOCOL:
      return isSetSecurityProtocol();
    case ALTERNATIVE_SCPHOST_NAME:
      return isSetAlternativeSCPHostName();
    case SSH_PORT:
      return isSetSshPort();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SCPDataMovement)
      return this.equals((SCPDataMovement)that);
    return false;
  }

  public boolean equals(SCPDataMovement that) {
    if (that == null)
      return false;

    boolean this_present_dataMovementInterfaceId = true && this.isSetDataMovementInterfaceId();
    boolean that_present_dataMovementInterfaceId = true && that.isSetDataMovementInterfaceId();
    if (this_present_dataMovementInterfaceId || that_present_dataMovementInterfaceId) {
      if (!(this_present_dataMovementInterfaceId && that_present_dataMovementInterfaceId))
        return false;
      if (!this.dataMovementInterfaceId.equals(that.dataMovementInterfaceId))
        return false;
    }

    boolean this_present_securityProtocol = true && this.isSetSecurityProtocol();
    boolean that_present_securityProtocol = true && that.isSetSecurityProtocol();
    if (this_present_securityProtocol || that_present_securityProtocol) {
      if (!(this_present_securityProtocol && that_present_securityProtocol))
        return false;
      if (!this.securityProtocol.equals(that.securityProtocol))
        return false;
    }

    boolean this_present_alternativeSCPHostName = true && this.isSetAlternativeSCPHostName();
    boolean that_present_alternativeSCPHostName = true && that.isSetAlternativeSCPHostName();
    if (this_present_alternativeSCPHostName || that_present_alternativeSCPHostName) {
      if (!(this_present_alternativeSCPHostName && that_present_alternativeSCPHostName))
        return false;
      if (!this.alternativeSCPHostName.equals(that.alternativeSCPHostName))
        return false;
    }

    boolean this_present_sshPort = true && this.isSetSshPort();
    boolean that_present_sshPort = true && that.isSetSshPort();
    if (this_present_sshPort || that_present_sshPort) {
      if (!(this_present_sshPort && that_present_sshPort))
        return false;
      if (this.sshPort != that.sshPort)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_dataMovementInterfaceId = true && (isSetDataMovementInterfaceId());
    list.add(present_dataMovementInterfaceId);
    if (present_dataMovementInterfaceId)
      list.add(dataMovementInterfaceId);

    boolean present_securityProtocol = true && (isSetSecurityProtocol());
    list.add(present_securityProtocol);
    if (present_securityProtocol)
      list.add(securityProtocol.getValue());

    boolean present_alternativeSCPHostName = true && (isSetAlternativeSCPHostName());
    list.add(present_alternativeSCPHostName);
    if (present_alternativeSCPHostName)
      list.add(alternativeSCPHostName);

    boolean present_sshPort = true && (isSetSshPort());
    list.add(present_sshPort);
    if (present_sshPort)
      list.add(sshPort);

    return list.hashCode();
  }

  @Override
  public int compareTo(SCPDataMovement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDataMovementInterfaceId()).compareTo(other.isSetDataMovementInterfaceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDataMovementInterfaceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dataMovementInterfaceId, other.dataMovementInterfaceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSecurityProtocol()).compareTo(other.isSetSecurityProtocol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSecurityProtocol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.securityProtocol, other.securityProtocol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAlternativeSCPHostName()).compareTo(other.isSetAlternativeSCPHostName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAlternativeSCPHostName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.alternativeSCPHostName, other.alternativeSCPHostName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSshPort()).compareTo(other.isSetSshPort());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSshPort()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sshPort, other.sshPort);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SCPDataMovement(");
    boolean first = true;

    sb.append("dataMovementInterfaceId:");
    if (this.dataMovementInterfaceId == null) {
      sb.append("null");
    } else {
      sb.append(this.dataMovementInterfaceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("securityProtocol:");
    if (this.securityProtocol == null) {
      sb.append("null");
    } else {
      sb.append(this.securityProtocol);
    }
    first = false;
    if (isSetAlternativeSCPHostName()) {
      if (!first) sb.append(", ");
      sb.append("alternativeSCPHostName:");
      if (this.alternativeSCPHostName == null) {
        sb.append("null");
      } else {
        sb.append(this.alternativeSCPHostName);
      }
      first = false;
    }
    if (isSetSshPort()) {
      if (!first) sb.append(", ");
      sb.append("sshPort:");
      sb.append(this.sshPort);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDataMovementInterfaceId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dataMovementInterfaceId' is unset! Struct:" + toString());
    }

    if (!isSetSecurityProtocol()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'securityProtocol' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SCPDataMovementStandardSchemeFactory implements SchemeFactory {
    public SCPDataMovementStandardScheme getScheme() {
      return new SCPDataMovementStandardScheme();
    }
  }

  private static class SCPDataMovementStandardScheme extends StandardScheme<SCPDataMovement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SCPDataMovement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA_MOVEMENT_INTERFACE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dataMovementInterfaceId = iprot.readString();
              struct.setDataMovementInterfaceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SECURITY_PROTOCOL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.securityProtocol = org.apache.airavata.model.data.movement.SecurityProtocol.findByValue(iprot.readI32());
              struct.setSecurityProtocolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ALTERNATIVE_SCPHOST_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.alternativeSCPHostName = iprot.readString();
              struct.setAlternativeSCPHostNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SSH_PORT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sshPort = iprot.readI32();
              struct.setSshPortIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SCPDataMovement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dataMovementInterfaceId != null) {
        oprot.writeFieldBegin(DATA_MOVEMENT_INTERFACE_ID_FIELD_DESC);
        oprot.writeString(struct.dataMovementInterfaceId);
        oprot.writeFieldEnd();
      }
      if (struct.securityProtocol != null) {
        oprot.writeFieldBegin(SECURITY_PROTOCOL_FIELD_DESC);
        oprot.writeI32(struct.securityProtocol.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.alternativeSCPHostName != null) {
        if (struct.isSetAlternativeSCPHostName()) {
          oprot.writeFieldBegin(ALTERNATIVE_SCPHOST_NAME_FIELD_DESC);
          oprot.writeString(struct.alternativeSCPHostName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSshPort()) {
        oprot.writeFieldBegin(SSH_PORT_FIELD_DESC);
        oprot.writeI32(struct.sshPort);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SCPDataMovementTupleSchemeFactory implements SchemeFactory {
    public SCPDataMovementTupleScheme getScheme() {
      return new SCPDataMovementTupleScheme();
    }
  }

  private static class SCPDataMovementTupleScheme extends TupleScheme<SCPDataMovement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SCPDataMovement struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.dataMovementInterfaceId);
      oprot.writeI32(struct.securityProtocol.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetAlternativeSCPHostName()) {
        optionals.set(0);
      }
      if (struct.isSetSshPort()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAlternativeSCPHostName()) {
        oprot.writeString(struct.alternativeSCPHostName);
      }
      if (struct.isSetSshPort()) {
        oprot.writeI32(struct.sshPort);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SCPDataMovement struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.dataMovementInterfaceId = iprot.readString();
      struct.setDataMovementInterfaceIdIsSet(true);
      struct.securityProtocol = org.apache.airavata.model.data.movement.SecurityProtocol.findByValue(iprot.readI32());
      struct.setSecurityProtocolIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.alternativeSCPHostName = iprot.readString();
        struct.setAlternativeSCPHostNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sshPort = iprot.readI32();
        struct.setSshPortIsSet(true);
      }
    }
  }

}

