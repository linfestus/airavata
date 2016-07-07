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
package org.apache.airavata.model;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-07-07")
public class ComponentStatus implements org.apache.thrift.TBase<ComponentStatus, ComponentStatus._Fields>, java.io.Serializable, Cloneable, Comparable<ComponentStatus> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ComponentStatus");

  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REASON_FIELD_DESC = new org.apache.thrift.protocol.TField("reason", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TIMEOF_STATE_CHANGE_FIELD_DESC = new org.apache.thrift.protocol.TField("timeofStateChange", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ComponentStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ComponentStatusTupleSchemeFactory());
  }

  private ComponentState state; // required
  private String reason; // optional
  private long timeofStateChange; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ComponentState
     */
    STATE((short)1, "state"),
    REASON((short)2, "reason"),
    TIMEOF_STATE_CHANGE((short)3, "timeofStateChange");

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
        case 1: // STATE
          return STATE;
        case 2: // REASON
          return REASON;
        case 3: // TIMEOF_STATE_CHANGE
          return TIMEOF_STATE_CHANGE;
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
  private static final int __TIMEOFSTATECHANGE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.REASON,_Fields.TIMEOF_STATE_CHANGE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ComponentState.class)));
    tmpMap.put(_Fields.REASON, new org.apache.thrift.meta_data.FieldMetaData("reason", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIMEOF_STATE_CHANGE, new org.apache.thrift.meta_data.FieldMetaData("timeofStateChange", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ComponentStatus.class, metaDataMap);
  }

  public ComponentStatus() {
    this.state = org.apache.airavata.model.ComponentState.CREATED;

  }

  public ComponentStatus(
    ComponentState state)
  {
    this();
    this.state = state;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ComponentStatus(ComponentStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetReason()) {
      this.reason = other.reason;
    }
    this.timeofStateChange = other.timeofStateChange;
  }

  public ComponentStatus deepCopy() {
    return new ComponentStatus(this);
  }

  @Override
  public void clear() {
    this.state = org.apache.airavata.model.ComponentState.CREATED;

    this.reason = null;
    setTimeofStateChangeIsSet(false);
    this.timeofStateChange = 0;
  }

  /**
   * 
   * @see ComponentState
   */
  public ComponentState getState() {
    return this.state;
  }

  /**
   * 
   * @see ComponentState
   */
  public void setState(ComponentState state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public String getReason() {
    return this.reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public void unsetReason() {
    this.reason = null;
  }

  /** Returns true if field reason is set (has been assigned a value) and false otherwise */
  public boolean isSetReason() {
    return this.reason != null;
  }

  public void setReasonIsSet(boolean value) {
    if (!value) {
      this.reason = null;
    }
  }

  public long getTimeofStateChange() {
    return this.timeofStateChange;
  }

  public void setTimeofStateChange(long timeofStateChange) {
    this.timeofStateChange = timeofStateChange;
    setTimeofStateChangeIsSet(true);
  }

  public void unsetTimeofStateChange() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMEOFSTATECHANGE_ISSET_ID);
  }

  /** Returns true if field timeofStateChange is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeofStateChange() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMEOFSTATECHANGE_ISSET_ID);
  }

  public void setTimeofStateChangeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMEOFSTATECHANGE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((ComponentState)value);
      }
      break;

    case REASON:
      if (value == null) {
        unsetReason();
      } else {
        setReason((String)value);
      }
      break;

    case TIMEOF_STATE_CHANGE:
      if (value == null) {
        unsetTimeofStateChange();
      } else {
        setTimeofStateChange((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case REASON:
      return getReason();

    case TIMEOF_STATE_CHANGE:
      return getTimeofStateChange();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case REASON:
      return isSetReason();
    case TIMEOF_STATE_CHANGE:
      return isSetTimeofStateChange();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ComponentStatus)
      return this.equals((ComponentStatus)that);
    return false;
  }

  public boolean equals(ComponentStatus that) {
    if (that == null)
      return false;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_reason = true && this.isSetReason();
    boolean that_present_reason = true && that.isSetReason();
    if (this_present_reason || that_present_reason) {
      if (!(this_present_reason && that_present_reason))
        return false;
      if (!this.reason.equals(that.reason))
        return false;
    }

    boolean this_present_timeofStateChange = true && this.isSetTimeofStateChange();
    boolean that_present_timeofStateChange = true && that.isSetTimeofStateChange();
    if (this_present_timeofStateChange || that_present_timeofStateChange) {
      if (!(this_present_timeofStateChange && that_present_timeofStateChange))
        return false;
      if (this.timeofStateChange != that.timeofStateChange)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_state = true && (isSetState());
    list.add(present_state);
    if (present_state)
      list.add(state.getValue());

    boolean present_reason = true && (isSetReason());
    list.add(present_reason);
    if (present_reason)
      list.add(reason);

    boolean present_timeofStateChange = true && (isSetTimeofStateChange());
    list.add(present_timeofStateChange);
    if (present_timeofStateChange)
      list.add(timeofStateChange);

    return list.hashCode();
  }

  @Override
  public int compareTo(ComponentStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReason()).compareTo(other.isSetReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReason()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reason, other.reason);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeofStateChange()).compareTo(other.isSetTimeofStateChange());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeofStateChange()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeofStateChange, other.timeofStateChange);
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
    StringBuilder sb = new StringBuilder("ComponentStatus(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (isSetReason()) {
      if (!first) sb.append(", ");
      sb.append("reason:");
      if (this.reason == null) {
        sb.append("null");
      } else {
        sb.append(this.reason);
      }
      first = false;
    }
    if (isSetTimeofStateChange()) {
      if (!first) sb.append(", ");
      sb.append("timeofStateChange:");
      sb.append(this.timeofStateChange);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetState()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state' is unset! Struct:" + toString());
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

  private static class ComponentStatusStandardSchemeFactory implements SchemeFactory {
    public ComponentStatusStandardScheme getScheme() {
      return new ComponentStatusStandardScheme();
    }
  }

  private static class ComponentStatusStandardScheme extends StandardScheme<ComponentStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ComponentStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = org.apache.airavata.model.ComponentState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REASON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.reason = iprot.readString();
              struct.setReasonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIMEOF_STATE_CHANGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeofStateChange = iprot.readI64();
              struct.setTimeofStateChangeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ComponentStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.reason != null) {
        if (struct.isSetReason()) {
          oprot.writeFieldBegin(REASON_FIELD_DESC);
          oprot.writeString(struct.reason);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTimeofStateChange()) {
        oprot.writeFieldBegin(TIMEOF_STATE_CHANGE_FIELD_DESC);
        oprot.writeI64(struct.timeofStateChange);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ComponentStatusTupleSchemeFactory implements SchemeFactory {
    public ComponentStatusTupleScheme getScheme() {
      return new ComponentStatusTupleScheme();
    }
  }

  private static class ComponentStatusTupleScheme extends TupleScheme<ComponentStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ComponentStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.state.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetReason()) {
        optionals.set(0);
      }
      if (struct.isSetTimeofStateChange()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetReason()) {
        oprot.writeString(struct.reason);
      }
      if (struct.isSetTimeofStateChange()) {
        oprot.writeI64(struct.timeofStateChange);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ComponentStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.state = org.apache.airavata.model.ComponentState.findByValue(iprot.readI32());
      struct.setStateIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.reason = iprot.readString();
        struct.setReasonIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timeofStateChange = iprot.readI64();
        struct.setTimeofStateChangeIsSet(true);
      }
    }
  }

}

