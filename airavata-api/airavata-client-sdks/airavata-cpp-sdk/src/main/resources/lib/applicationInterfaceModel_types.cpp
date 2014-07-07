/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "applicationInterfaceModel_types.h"

#include <algorithm>



int _kDataTypeValues[] = {
  DataType::STRING,
  DataType::INTEGER,
  DataType::FLOAT,
  DataType::URI
};
const char* _kDataTypeNames[] = {
  "STRING",
  "INTEGER",
  "FLOAT",
  "URI"
};
const std::map<int, const char*> _DataType_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(4, _kDataTypeValues, _kDataTypeNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));

const char* InputDataObjectType::ascii_fingerprint = "0C147F4C4DFD0B9FF70275BF29D07281";
const uint8_t InputDataObjectType::binary_fingerprint[16] = {0x0C,0x14,0x7F,0x4C,0x4D,0xFD,0x0B,0x9F,0xF7,0x02,0x75,0xBF,0x29,0xD0,0x72,0x81};

uint32_t InputDataObjectType::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_isEmpty = false;
  bool isset_name = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->isEmpty);
          isset_isEmpty = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->name);
          isset_name = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->value);
          this->__isset.value = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast0;
          xfer += iprot->readI32(ecast0);
          this->type = (DataType::type)ecast0;
          this->__isset.type = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationArgument);
          this->__isset.applicationArgument = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->standardInput);
          this->__isset.standardInput = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 7:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->userFriendlyDescription);
          this->__isset.userFriendlyDescription = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 8:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->metaData);
          this->__isset.metaData = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_isEmpty)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_name)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t InputDataObjectType::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  xfer += oprot->writeStructBegin("InputDataObjectType");

  xfer += oprot->writeFieldBegin("isEmpty", ::apache::thrift::protocol::T_BOOL, 1);
  xfer += oprot->writeBool(this->isEmpty);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("name", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->name);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.value) {
    xfer += oprot->writeFieldBegin("value", ::apache::thrift::protocol::T_STRING, 3);
    xfer += oprot->writeString(this->value);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.type) {
    xfer += oprot->writeFieldBegin("type", ::apache::thrift::protocol::T_I32, 4);
    xfer += oprot->writeI32((int32_t)this->type);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationArgument) {
    xfer += oprot->writeFieldBegin("applicationArgument", ::apache::thrift::protocol::T_STRING, 5);
    xfer += oprot->writeString(this->applicationArgument);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.standardInput) {
    xfer += oprot->writeFieldBegin("standardInput", ::apache::thrift::protocol::T_BOOL, 6);
    xfer += oprot->writeBool(this->standardInput);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.userFriendlyDescription) {
    xfer += oprot->writeFieldBegin("userFriendlyDescription", ::apache::thrift::protocol::T_STRING, 7);
    xfer += oprot->writeString(this->userFriendlyDescription);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.metaData) {
    xfer += oprot->writeFieldBegin("metaData", ::apache::thrift::protocol::T_STRING, 8);
    xfer += oprot->writeString(this->metaData);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(InputDataObjectType &a, InputDataObjectType &b) {
  using ::std::swap;
  swap(a.isEmpty, b.isEmpty);
  swap(a.name, b.name);
  swap(a.value, b.value);
  swap(a.type, b.type);
  swap(a.applicationArgument, b.applicationArgument);
  swap(a.standardInput, b.standardInput);
  swap(a.userFriendlyDescription, b.userFriendlyDescription);
  swap(a.metaData, b.metaData);
  swap(a.__isset, b.__isset);
}

const char* OutputDataObjectType::ascii_fingerprint = "FFD96F45C68610A5AC6E843C512B01EC";
const uint8_t OutputDataObjectType::binary_fingerprint[16] = {0xFF,0xD9,0x6F,0x45,0xC6,0x86,0x10,0xA5,0xAC,0x6E,0x84,0x3C,0x51,0x2B,0x01,0xEC};

uint32_t OutputDataObjectType::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_isEmpty = false;
  bool isset_name = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->isEmpty);
          isset_isEmpty = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->name);
          isset_name = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->value);
          this->__isset.value = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast1;
          xfer += iprot->readI32(ecast1);
          this->type = (DataType::type)ecast1;
          this->__isset.type = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_isEmpty)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_name)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t OutputDataObjectType::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  xfer += oprot->writeStructBegin("OutputDataObjectType");

  xfer += oprot->writeFieldBegin("isEmpty", ::apache::thrift::protocol::T_BOOL, 1);
  xfer += oprot->writeBool(this->isEmpty);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("name", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->name);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.value) {
    xfer += oprot->writeFieldBegin("value", ::apache::thrift::protocol::T_STRING, 3);
    xfer += oprot->writeString(this->value);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.type) {
    xfer += oprot->writeFieldBegin("type", ::apache::thrift::protocol::T_I32, 4);
    xfer += oprot->writeI32((int32_t)this->type);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(OutputDataObjectType &a, OutputDataObjectType &b) {
  using ::std::swap;
  swap(a.isEmpty, b.isEmpty);
  swap(a.name, b.name);
  swap(a.value, b.value);
  swap(a.type, b.type);
  swap(a.__isset, b.__isset);
}

const char* ApplicationInterfaceDescription::ascii_fingerprint = "B4A4B770076264D5948E96332AE8D291";
const uint8_t ApplicationInterfaceDescription::binary_fingerprint[16] = {0xB4,0xA4,0xB7,0x70,0x07,0x62,0x64,0xD5,0x94,0x8E,0x96,0x33,0x2A,0xE8,0xD2,0x91};

uint32_t ApplicationInterfaceDescription::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_isEmpty = false;
  bool isset_applicationInterfaceId = false;
  bool isset_applicationName = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->isEmpty);
          isset_isEmpty = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationInterfaceId);
          isset_applicationInterfaceId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationName);
          isset_applicationName = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationDesription);
          this->__isset.applicationDesription = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->applicationModules.clear();
            uint32_t _size2;
            ::apache::thrift::protocol::TType _etype5;
            xfer += iprot->readListBegin(_etype5, _size2);
            this->applicationModules.resize(_size2);
            uint32_t _i6;
            for (_i6 = 0; _i6 < _size2; ++_i6)
            {
              xfer += iprot->readString(this->applicationModules[_i6]);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.applicationModules = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->applicationInputs.clear();
            uint32_t _size7;
            ::apache::thrift::protocol::TType _etype10;
            xfer += iprot->readListBegin(_etype10, _size7);
            this->applicationInputs.resize(_size7);
            uint32_t _i11;
            for (_i11 = 0; _i11 < _size7; ++_i11)
            {
              xfer += this->applicationInputs[_i11].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.applicationInputs = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 7:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->applicationOutputs.clear();
            uint32_t _size12;
            ::apache::thrift::protocol::TType _etype15;
            xfer += iprot->readListBegin(_etype15, _size12);
            this->applicationOutputs.resize(_size12);
            uint32_t _i16;
            for (_i16 = 0; _i16 < _size12; ++_i16)
            {
              xfer += this->applicationOutputs[_i16].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.applicationOutputs = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_isEmpty)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_applicationInterfaceId)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_applicationName)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t ApplicationInterfaceDescription::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  xfer += oprot->writeStructBegin("ApplicationInterfaceDescription");

  xfer += oprot->writeFieldBegin("isEmpty", ::apache::thrift::protocol::T_BOOL, 1);
  xfer += oprot->writeBool(this->isEmpty);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("applicationInterfaceId", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->applicationInterfaceId);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("applicationName", ::apache::thrift::protocol::T_STRING, 3);
  xfer += oprot->writeString(this->applicationName);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.applicationDesription) {
    xfer += oprot->writeFieldBegin("applicationDesription", ::apache::thrift::protocol::T_STRING, 4);
    xfer += oprot->writeString(this->applicationDesription);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationModules) {
    xfer += oprot->writeFieldBegin("applicationModules", ::apache::thrift::protocol::T_LIST, 5);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRING, static_cast<uint32_t>(this->applicationModules.size()));
      std::vector<std::string> ::const_iterator _iter17;
      for (_iter17 = this->applicationModules.begin(); _iter17 != this->applicationModules.end(); ++_iter17)
      {
        xfer += oprot->writeString((*_iter17));
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationInputs) {
    xfer += oprot->writeFieldBegin("applicationInputs", ::apache::thrift::protocol::T_LIST, 6);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->applicationInputs.size()));
      std::vector<InputDataObjectType> ::const_iterator _iter18;
      for (_iter18 = this->applicationInputs.begin(); _iter18 != this->applicationInputs.end(); ++_iter18)
      {
        xfer += (*_iter18).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationOutputs) {
    xfer += oprot->writeFieldBegin("applicationOutputs", ::apache::thrift::protocol::T_LIST, 7);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->applicationOutputs.size()));
      std::vector<OutputDataObjectType> ::const_iterator _iter19;
      for (_iter19 = this->applicationOutputs.begin(); _iter19 != this->applicationOutputs.end(); ++_iter19)
      {
        xfer += (*_iter19).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(ApplicationInterfaceDescription &a, ApplicationInterfaceDescription &b) {
  using ::std::swap;
  swap(a.isEmpty, b.isEmpty);
  swap(a.applicationInterfaceId, b.applicationInterfaceId);
  swap(a.applicationName, b.applicationName);
  swap(a.applicationDesription, b.applicationDesription);
  swap(a.applicationModules, b.applicationModules);
  swap(a.applicationInputs, b.applicationInputs);
  swap(a.applicationOutputs, b.applicationOutputs);
  swap(a.__isset, b.__isset);
}


