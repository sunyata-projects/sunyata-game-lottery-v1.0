/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xt.yde.thrift.card;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

import javax.annotation.Generated;
import java.util.*;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 发牌信息
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-05-19")
public class Cards implements org.apache.thrift.TBase<Cards, Cards._Fields>, java.io.Serializable, Cloneable, Comparable<Cards> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Cards");

  private static final org.apache.thrift.protocol.TField CARD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("cardId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CENTER_CARDS_FIELD_DESC = new org.apache.thrift.protocol.TField("centerCards", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField RIGHT_CARDS_FIELD_DESC = new org.apache.thrift.protocol.TField("rightCards", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField LEFT_CARDS_FIELD_DESC = new org.apache.thrift.protocol.TField("leftCards", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField UNDER_CARDS_FIELD_DESC = new org.apache.thrift.protocol.TField("underCards", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CardsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CardsTupleSchemeFactory());
  }

  public String cardId; // required
  public List<Integer> centerCards; // required
  public List<Integer> rightCards; // required
  public List<Integer> leftCards; // required
  public List<Integer> underCards; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CARD_ID((short)1, "cardId"),
    CENTER_CARDS((short)2, "centerCards"),
    RIGHT_CARDS((short)3, "rightCards"),
    LEFT_CARDS((short)4, "leftCards"),
    UNDER_CARDS((short)5, "underCards");

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
        case 1: // CARD_ID
          return CARD_ID;
        case 2: // CENTER_CARDS
          return CENTER_CARDS;
        case 3: // RIGHT_CARDS
          return RIGHT_CARDS;
        case 4: // LEFT_CARDS
          return LEFT_CARDS;
        case 5: // UNDER_CARDS
          return UNDER_CARDS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CARD_ID, new org.apache.thrift.meta_data.FieldMetaData("cardId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CENTER_CARDS, new org.apache.thrift.meta_data.FieldMetaData("centerCards", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.RIGHT_CARDS, new org.apache.thrift.meta_data.FieldMetaData("rightCards", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.LEFT_CARDS, new org.apache.thrift.meta_data.FieldMetaData("leftCards", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.UNDER_CARDS, new org.apache.thrift.meta_data.FieldMetaData("underCards", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Cards.class, metaDataMap);
  }

  public Cards() {
  }

  public Cards(
    String cardId,
    List<Integer> centerCards,
    List<Integer> rightCards,
    List<Integer> leftCards,
    List<Integer> underCards)
  {
    this();
    this.cardId = cardId;
    this.centerCards = centerCards;
    this.rightCards = rightCards;
    this.leftCards = leftCards;
    this.underCards = underCards;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Cards(Cards other) {
    if (other.isSetCardId()) {
      this.cardId = other.cardId;
    }
    if (other.isSetCenterCards()) {
      List<Integer> __this__centerCards = new ArrayList<Integer>(other.centerCards);
      this.centerCards = __this__centerCards;
    }
    if (other.isSetRightCards()) {
      List<Integer> __this__rightCards = new ArrayList<Integer>(other.rightCards);
      this.rightCards = __this__rightCards;
    }
    if (other.isSetLeftCards()) {
      List<Integer> __this__leftCards = new ArrayList<Integer>(other.leftCards);
      this.leftCards = __this__leftCards;
    }
    if (other.isSetUnderCards()) {
      List<Integer> __this__underCards = new ArrayList<Integer>(other.underCards);
      this.underCards = __this__underCards;
    }
  }

  public Cards deepCopy() {
    return new Cards(this);
  }

  @Override
  public void clear() {
    this.cardId = null;
    this.centerCards = null;
    this.rightCards = null;
    this.leftCards = null;
    this.underCards = null;
  }

  public String getCardId() {
    return this.cardId;
  }

  public Cards setCardId(String cardId) {
    this.cardId = cardId;
    return this;
  }

  public void unsetCardId() {
    this.cardId = null;
  }

  /** Returns true if field cardId is set (has been assigned a value) and false otherwise */
  public boolean isSetCardId() {
    return this.cardId != null;
  }

  public void setCardIdIsSet(boolean value) {
    if (!value) {
      this.cardId = null;
    }
  }

  public int getCenterCardsSize() {
    return (this.centerCards == null) ? 0 : this.centerCards.size();
  }

  public java.util.Iterator<Integer> getCenterCardsIterator() {
    return (this.centerCards == null) ? null : this.centerCards.iterator();
  }

  public void addToCenterCards(int elem) {
    if (this.centerCards == null) {
      this.centerCards = new ArrayList<Integer>();
    }
    this.centerCards.add(elem);
  }

  public List<Integer> getCenterCards() {
    return this.centerCards;
  }

  public Cards setCenterCards(List<Integer> centerCards) {
    this.centerCards = centerCards;
    return this;
  }

  public void unsetCenterCards() {
    this.centerCards = null;
  }

  /** Returns true if field centerCards is set (has been assigned a value) and false otherwise */
  public boolean isSetCenterCards() {
    return this.centerCards != null;
  }

  public void setCenterCardsIsSet(boolean value) {
    if (!value) {
      this.centerCards = null;
    }
  }

  public int getRightCardsSize() {
    return (this.rightCards == null) ? 0 : this.rightCards.size();
  }

  public java.util.Iterator<Integer> getRightCardsIterator() {
    return (this.rightCards == null) ? null : this.rightCards.iterator();
  }

  public void addToRightCards(int elem) {
    if (this.rightCards == null) {
      this.rightCards = new ArrayList<Integer>();
    }
    this.rightCards.add(elem);
  }

  public List<Integer> getRightCards() {
    return this.rightCards;
  }

  public Cards setRightCards(List<Integer> rightCards) {
    this.rightCards = rightCards;
    return this;
  }

  public void unsetRightCards() {
    this.rightCards = null;
  }

  /** Returns true if field rightCards is set (has been assigned a value) and false otherwise */
  public boolean isSetRightCards() {
    return this.rightCards != null;
  }

  public void setRightCardsIsSet(boolean value) {
    if (!value) {
      this.rightCards = null;
    }
  }

  public int getLeftCardsSize() {
    return (this.leftCards == null) ? 0 : this.leftCards.size();
  }

  public java.util.Iterator<Integer> getLeftCardsIterator() {
    return (this.leftCards == null) ? null : this.leftCards.iterator();
  }

  public void addToLeftCards(int elem) {
    if (this.leftCards == null) {
      this.leftCards = new ArrayList<Integer>();
    }
    this.leftCards.add(elem);
  }

  public List<Integer> getLeftCards() {
    return this.leftCards;
  }

  public Cards setLeftCards(List<Integer> leftCards) {
    this.leftCards = leftCards;
    return this;
  }

  public void unsetLeftCards() {
    this.leftCards = null;
  }

  /** Returns true if field leftCards is set (has been assigned a value) and false otherwise */
  public boolean isSetLeftCards() {
    return this.leftCards != null;
  }

  public void setLeftCardsIsSet(boolean value) {
    if (!value) {
      this.leftCards = null;
    }
  }

  public int getUnderCardsSize() {
    return (this.underCards == null) ? 0 : this.underCards.size();
  }

  public java.util.Iterator<Integer> getUnderCardsIterator() {
    return (this.underCards == null) ? null : this.underCards.iterator();
  }

  public void addToUnderCards(int elem) {
    if (this.underCards == null) {
      this.underCards = new ArrayList<Integer>();
    }
    this.underCards.add(elem);
  }

  public List<Integer> getUnderCards() {
    return this.underCards;
  }

  public Cards setUnderCards(List<Integer> underCards) {
    this.underCards = underCards;
    return this;
  }

  public void unsetUnderCards() {
    this.underCards = null;
  }

  /** Returns true if field underCards is set (has been assigned a value) and false otherwise */
  public boolean isSetUnderCards() {
    return this.underCards != null;
  }

  public void setUnderCardsIsSet(boolean value) {
    if (!value) {
      this.underCards = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CARD_ID:
      if (value == null) {
        unsetCardId();
      } else {
        setCardId((String)value);
      }
      break;

    case CENTER_CARDS:
      if (value == null) {
        unsetCenterCards();
      } else {
        setCenterCards((List<Integer>)value);
      }
      break;

    case RIGHT_CARDS:
      if (value == null) {
        unsetRightCards();
      } else {
        setRightCards((List<Integer>)value);
      }
      break;

    case LEFT_CARDS:
      if (value == null) {
        unsetLeftCards();
      } else {
        setLeftCards((List<Integer>)value);
      }
      break;

    case UNDER_CARDS:
      if (value == null) {
        unsetUnderCards();
      } else {
        setUnderCards((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CARD_ID:
      return getCardId();

    case CENTER_CARDS:
      return getCenterCards();

    case RIGHT_CARDS:
      return getRightCards();

    case LEFT_CARDS:
      return getLeftCards();

    case UNDER_CARDS:
      return getUnderCards();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CARD_ID:
      return isSetCardId();
    case CENTER_CARDS:
      return isSetCenterCards();
    case RIGHT_CARDS:
      return isSetRightCards();
    case LEFT_CARDS:
      return isSetLeftCards();
    case UNDER_CARDS:
      return isSetUnderCards();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Cards)
      return this.equals((Cards)that);
    return false;
  }

  public boolean equals(Cards that) {
    if (that == null)
      return false;

    boolean this_present_cardId = true && this.isSetCardId();
    boolean that_present_cardId = true && that.isSetCardId();
    if (this_present_cardId || that_present_cardId) {
      if (!(this_present_cardId && that_present_cardId))
        return false;
      if (!this.cardId.equals(that.cardId))
        return false;
    }

    boolean this_present_centerCards = true && this.isSetCenterCards();
    boolean that_present_centerCards = true && that.isSetCenterCards();
    if (this_present_centerCards || that_present_centerCards) {
      if (!(this_present_centerCards && that_present_centerCards))
        return false;
      if (!this.centerCards.equals(that.centerCards))
        return false;
    }

    boolean this_present_rightCards = true && this.isSetRightCards();
    boolean that_present_rightCards = true && that.isSetRightCards();
    if (this_present_rightCards || that_present_rightCards) {
      if (!(this_present_rightCards && that_present_rightCards))
        return false;
      if (!this.rightCards.equals(that.rightCards))
        return false;
    }

    boolean this_present_leftCards = true && this.isSetLeftCards();
    boolean that_present_leftCards = true && that.isSetLeftCards();
    if (this_present_leftCards || that_present_leftCards) {
      if (!(this_present_leftCards && that_present_leftCards))
        return false;
      if (!this.leftCards.equals(that.leftCards))
        return false;
    }

    boolean this_present_underCards = true && this.isSetUnderCards();
    boolean that_present_underCards = true && that.isSetUnderCards();
    if (this_present_underCards || that_present_underCards) {
      if (!(this_present_underCards && that_present_underCards))
        return false;
      if (!this.underCards.equals(that.underCards))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cardId = true && (isSetCardId());
    list.add(present_cardId);
    if (present_cardId)
      list.add(cardId);

    boolean present_centerCards = true && (isSetCenterCards());
    list.add(present_centerCards);
    if (present_centerCards)
      list.add(centerCards);

    boolean present_rightCards = true && (isSetRightCards());
    list.add(present_rightCards);
    if (present_rightCards)
      list.add(rightCards);

    boolean present_leftCards = true && (isSetLeftCards());
    list.add(present_leftCards);
    if (present_leftCards)
      list.add(leftCards);

    boolean present_underCards = true && (isSetUnderCards());
    list.add(present_underCards);
    if (present_underCards)
      list.add(underCards);

    return list.hashCode();
  }

  @Override
  public int compareTo(Cards other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCardId()).compareTo(other.isSetCardId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCardId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cardId, other.cardId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCenterCards()).compareTo(other.isSetCenterCards());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCenterCards()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.centerCards, other.centerCards);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRightCards()).compareTo(other.isSetRightCards());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRightCards()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rightCards, other.rightCards);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLeftCards()).compareTo(other.isSetLeftCards());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLeftCards()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.leftCards, other.leftCards);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnderCards()).compareTo(other.isSetUnderCards());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnderCards()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.underCards, other.underCards);
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
    StringBuilder sb = new StringBuilder("Cards(");
    boolean first = true;

    sb.append("cardId:");
    if (this.cardId == null) {
      sb.append("null");
    } else {
      sb.append(this.cardId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("centerCards:");
    if (this.centerCards == null) {
      sb.append("null");
    } else {
      sb.append(this.centerCards);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rightCards:");
    if (this.rightCards == null) {
      sb.append("null");
    } else {
      sb.append(this.rightCards);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("leftCards:");
    if (this.leftCards == null) {
      sb.append("null");
    } else {
      sb.append(this.leftCards);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("underCards:");
    if (this.underCards == null) {
      sb.append("null");
    } else {
      sb.append(this.underCards);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CardsStandardSchemeFactory implements SchemeFactory {
    public CardsStandardScheme getScheme() {
      return new CardsStandardScheme();
    }
  }

  private static class CardsStandardScheme extends StandardScheme<Cards> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Cards struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CARD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cardId = iprot.readString();
              struct.setCardIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CENTER_CARDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.centerCards = new ArrayList<Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.centerCards.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setCenterCardsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RIGHT_CARDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.rightCards = new ArrayList<Integer>(_list3.size);
                int _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readI32();
                  struct.rightCards.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setRightCardsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LEFT_CARDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list6 = iprot.readListBegin();
                struct.leftCards = new ArrayList<Integer>(_list6.size);
                int _elem7;
                for (int _i8 = 0; _i8 < _list6.size; ++_i8)
                {
                  _elem7 = iprot.readI32();
                  struct.leftCards.add(_elem7);
                }
                iprot.readListEnd();
              }
              struct.setLeftCardsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // UNDER_CARDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list9 = iprot.readListBegin();
                struct.underCards = new ArrayList<Integer>(_list9.size);
                int _elem10;
                for (int _i11 = 0; _i11 < _list9.size; ++_i11)
                {
                  _elem10 = iprot.readI32();
                  struct.underCards.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setUnderCardsIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Cards struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cardId != null) {
        oprot.writeFieldBegin(CARD_ID_FIELD_DESC);
        oprot.writeString(struct.cardId);
        oprot.writeFieldEnd();
      }
      if (struct.centerCards != null) {
        oprot.writeFieldBegin(CENTER_CARDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.centerCards.size()));
          for (int _iter12 : struct.centerCards)
          {
            oprot.writeI32(_iter12);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.rightCards != null) {
        oprot.writeFieldBegin(RIGHT_CARDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.rightCards.size()));
          for (int _iter13 : struct.rightCards)
          {
            oprot.writeI32(_iter13);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.leftCards != null) {
        oprot.writeFieldBegin(LEFT_CARDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.leftCards.size()));
          for (int _iter14 : struct.leftCards)
          {
            oprot.writeI32(_iter14);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.underCards != null) {
        oprot.writeFieldBegin(UNDER_CARDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.underCards.size()));
          for (int _iter15 : struct.underCards)
          {
            oprot.writeI32(_iter15);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CardsTupleSchemeFactory implements SchemeFactory {
    public CardsTupleScheme getScheme() {
      return new CardsTupleScheme();
    }
  }

  private static class CardsTupleScheme extends TupleScheme<Cards> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Cards struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCardId()) {
        optionals.set(0);
      }
      if (struct.isSetCenterCards()) {
        optionals.set(1);
      }
      if (struct.isSetRightCards()) {
        optionals.set(2);
      }
      if (struct.isSetLeftCards()) {
        optionals.set(3);
      }
      if (struct.isSetUnderCards()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetCardId()) {
        oprot.writeString(struct.cardId);
      }
      if (struct.isSetCenterCards()) {
        {
          oprot.writeI32(struct.centerCards.size());
          for (int _iter16 : struct.centerCards)
          {
            oprot.writeI32(_iter16);
          }
        }
      }
      if (struct.isSetRightCards()) {
        {
          oprot.writeI32(struct.rightCards.size());
          for (int _iter17 : struct.rightCards)
          {
            oprot.writeI32(_iter17);
          }
        }
      }
      if (struct.isSetLeftCards()) {
        {
          oprot.writeI32(struct.leftCards.size());
          for (int _iter18 : struct.leftCards)
          {
            oprot.writeI32(_iter18);
          }
        }
      }
      if (struct.isSetUnderCards()) {
        {
          oprot.writeI32(struct.underCards.size());
          for (int _iter19 : struct.underCards)
          {
            oprot.writeI32(_iter19);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Cards struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.cardId = iprot.readString();
        struct.setCardIdIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list20 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.centerCards = new ArrayList<Integer>(_list20.size);
          int _elem21;
          for (int _i22 = 0; _i22 < _list20.size; ++_i22)
          {
            _elem21 = iprot.readI32();
            struct.centerCards.add(_elem21);
          }
        }
        struct.setCenterCardsIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.rightCards = new ArrayList<Integer>(_list23.size);
          int _elem24;
          for (int _i25 = 0; _i25 < _list23.size; ++_i25)
          {
            _elem24 = iprot.readI32();
            struct.rightCards.add(_elem24);
          }
        }
        struct.setRightCardsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.leftCards = new ArrayList<Integer>(_list26.size);
          int _elem27;
          for (int _i28 = 0; _i28 < _list26.size; ++_i28)
          {
            _elem27 = iprot.readI32();
            struct.leftCards.add(_elem27);
          }
        }
        struct.setLeftCardsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.underCards = new ArrayList<Integer>(_list29.size);
          int _elem30;
          for (int _i31 = 0; _i31 < _list29.size; ++_i31)
          {
            _elem30 = iprot.readI32();
            struct.underCards.add(_elem30);
          }
        }
        struct.setUnderCardsIsSet(true);
      }
    }
  }

}

