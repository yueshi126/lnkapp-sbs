/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.fbi.sbs.online.code.txn88480.domain;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Toa88480 extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Toa88480\",\"namespace\":\"org.fbi.sbs.online.code.txn88480.domain\",\"fields\":[{\"name\":\"tdbsrt\",\"type\":\"string\"},{\"name\":\"tdmsrt\",\"type\":\"string\"},{\"name\":\"tdssrt\",\"type\":\"string\"},{\"name\":\"tdbnam\",\"type\":\"string\"},{\"name\":\"tdmnam\",\"type\":\"string\"},{\"name\":\"tdsnam\",\"type\":\"string\"},{\"name\":\"tddnam\",\"type\":\"string\"},{\"name\":\"tddcn1\",\"type\":\"string\"},{\"name\":\"tddcn2\",\"type\":\"string\"},{\"name\":\"tddcn3\",\"type\":\"string\"},{\"name\":\"tddcn4\",\"type\":\"string\"},{\"name\":\"amdtlr\",\"type\":\"string\"},{\"name\":\"upddat\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence tdbsrt;
  @Deprecated public java.lang.CharSequence tdmsrt;
  @Deprecated public java.lang.CharSequence tdssrt;
  @Deprecated public java.lang.CharSequence tdbnam;
  @Deprecated public java.lang.CharSequence tdmnam;
  @Deprecated public java.lang.CharSequence tdsnam;
  @Deprecated public java.lang.CharSequence tddnam;
  @Deprecated public java.lang.CharSequence tddcn1;
  @Deprecated public java.lang.CharSequence tddcn2;
  @Deprecated public java.lang.CharSequence tddcn3;
  @Deprecated public java.lang.CharSequence tddcn4;
  @Deprecated public java.lang.CharSequence amdtlr;
  @Deprecated public java.lang.CharSequence upddat;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Toa88480() {}

  /**
   * All-args constructor.
   */
  public Toa88480(java.lang.CharSequence tdbsrt, java.lang.CharSequence tdmsrt, java.lang.CharSequence tdssrt, java.lang.CharSequence tdbnam, java.lang.CharSequence tdmnam, java.lang.CharSequence tdsnam, java.lang.CharSequence tddnam, java.lang.CharSequence tddcn1, java.lang.CharSequence tddcn2, java.lang.CharSequence tddcn3, java.lang.CharSequence tddcn4, java.lang.CharSequence amdtlr, java.lang.CharSequence upddat) {
    this.tdbsrt = tdbsrt;
    this.tdmsrt = tdmsrt;
    this.tdssrt = tdssrt;
    this.tdbnam = tdbnam;
    this.tdmnam = tdmnam;
    this.tdsnam = tdsnam;
    this.tddnam = tddnam;
    this.tddcn1 = tddcn1;
    this.tddcn2 = tddcn2;
    this.tddcn3 = tddcn3;
    this.tddcn4 = tddcn4;
    this.amdtlr = amdtlr;
    this.upddat = upddat;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return tdbsrt;
    case 1: return tdmsrt;
    case 2: return tdssrt;
    case 3: return tdbnam;
    case 4: return tdmnam;
    case 5: return tdsnam;
    case 6: return tddnam;
    case 7: return tddcn1;
    case 8: return tddcn2;
    case 9: return tddcn3;
    case 10: return tddcn4;
    case 11: return amdtlr;
    case 12: return upddat;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: tdbsrt = (java.lang.CharSequence)value$; break;
    case 1: tdmsrt = (java.lang.CharSequence)value$; break;
    case 2: tdssrt = (java.lang.CharSequence)value$; break;
    case 3: tdbnam = (java.lang.CharSequence)value$; break;
    case 4: tdmnam = (java.lang.CharSequence)value$; break;
    case 5: tdsnam = (java.lang.CharSequence)value$; break;
    case 6: tddnam = (java.lang.CharSequence)value$; break;
    case 7: tddcn1 = (java.lang.CharSequence)value$; break;
    case 8: tddcn2 = (java.lang.CharSequence)value$; break;
    case 9: tddcn3 = (java.lang.CharSequence)value$; break;
    case 10: tddcn4 = (java.lang.CharSequence)value$; break;
    case 11: amdtlr = (java.lang.CharSequence)value$; break;
    case 12: upddat = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'tdbsrt' field.
   */
  public java.lang.CharSequence getTdbsrt() {
    return tdbsrt;
  }

  /**
   * Sets the value of the 'tdbsrt' field.
   * @param value the value to set.
   */
  public void setTdbsrt(java.lang.CharSequence value) {
    this.tdbsrt = value;
  }

  /**
   * Gets the value of the 'tdmsrt' field.
   */
  public java.lang.CharSequence getTdmsrt() {
    return tdmsrt;
  }

  /**
   * Sets the value of the 'tdmsrt' field.
   * @param value the value to set.
   */
  public void setTdmsrt(java.lang.CharSequence value) {
    this.tdmsrt = value;
  }

  /**
   * Gets the value of the 'tdssrt' field.
   */
  public java.lang.CharSequence getTdssrt() {
    return tdssrt;
  }

  /**
   * Sets the value of the 'tdssrt' field.
   * @param value the value to set.
   */
  public void setTdssrt(java.lang.CharSequence value) {
    this.tdssrt = value;
  }

  /**
   * Gets the value of the 'tdbnam' field.
   */
  public java.lang.CharSequence getTdbnam() {
    return tdbnam;
  }

  /**
   * Sets the value of the 'tdbnam' field.
   * @param value the value to set.
   */
  public void setTdbnam(java.lang.CharSequence value) {
    this.tdbnam = value;
  }

  /**
   * Gets the value of the 'tdmnam' field.
   */
  public java.lang.CharSequence getTdmnam() {
    return tdmnam;
  }

  /**
   * Sets the value of the 'tdmnam' field.
   * @param value the value to set.
   */
  public void setTdmnam(java.lang.CharSequence value) {
    this.tdmnam = value;
  }

  /**
   * Gets the value of the 'tdsnam' field.
   */
  public java.lang.CharSequence getTdsnam() {
    return tdsnam;
  }

  /**
   * Sets the value of the 'tdsnam' field.
   * @param value the value to set.
   */
  public void setTdsnam(java.lang.CharSequence value) {
    this.tdsnam = value;
  }

  /**
   * Gets the value of the 'tddnam' field.
   */
  public java.lang.CharSequence getTddnam() {
    return tddnam;
  }

  /**
   * Sets the value of the 'tddnam' field.
   * @param value the value to set.
   */
  public void setTddnam(java.lang.CharSequence value) {
    this.tddnam = value;
  }

  /**
   * Gets the value of the 'tddcn1' field.
   */
  public java.lang.CharSequence getTddcn1() {
    return tddcn1;
  }

  /**
   * Sets the value of the 'tddcn1' field.
   * @param value the value to set.
   */
  public void setTddcn1(java.lang.CharSequence value) {
    this.tddcn1 = value;
  }

  /**
   * Gets the value of the 'tddcn2' field.
   */
  public java.lang.CharSequence getTddcn2() {
    return tddcn2;
  }

  /**
   * Sets the value of the 'tddcn2' field.
   * @param value the value to set.
   */
  public void setTddcn2(java.lang.CharSequence value) {
    this.tddcn2 = value;
  }

  /**
   * Gets the value of the 'tddcn3' field.
   */
  public java.lang.CharSequence getTddcn3() {
    return tddcn3;
  }

  /**
   * Sets the value of the 'tddcn3' field.
   * @param value the value to set.
   */
  public void setTddcn3(java.lang.CharSequence value) {
    this.tddcn3 = value;
  }

  /**
   * Gets the value of the 'tddcn4' field.
   */
  public java.lang.CharSequence getTddcn4() {
    return tddcn4;
  }

  /**
   * Sets the value of the 'tddcn4' field.
   * @param value the value to set.
   */
  public void setTddcn4(java.lang.CharSequence value) {
    this.tddcn4 = value;
  }

  /**
   * Gets the value of the 'amdtlr' field.
   */
  public java.lang.CharSequence getAmdtlr() {
    return amdtlr;
  }

  /**
   * Sets the value of the 'amdtlr' field.
   * @param value the value to set.
   */
  public void setAmdtlr(java.lang.CharSequence value) {
    this.amdtlr = value;
  }

  /**
   * Gets the value of the 'upddat' field.
   */
  public java.lang.CharSequence getUpddat() {
    return upddat;
  }

  /**
   * Sets the value of the 'upddat' field.
   * @param value the value to set.
   */
  public void setUpddat(java.lang.CharSequence value) {
    this.upddat = value;
  }

  /** Creates a new Toa88480 RecordBuilder */
  public static org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder newBuilder() {
    return new org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder();
  }
  
  /** Creates a new Toa88480 RecordBuilder by copying an existing Builder */
  public static org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder newBuilder(org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder other) {
    return new org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder(other);
  }
  
  /** Creates a new Toa88480 RecordBuilder by copying an existing Toa88480 instance */
  public static org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder newBuilder(org.fbi.sbs.online.code.txn88480.domain.Toa88480 other) {
    return new org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder(other);
  }
  
  /**
   * RecordBuilder for Toa88480 instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Toa88480>
    implements org.apache.avro.data.RecordBuilder<Toa88480> {

    private java.lang.CharSequence tdbsrt;
    private java.lang.CharSequence tdmsrt;
    private java.lang.CharSequence tdssrt;
    private java.lang.CharSequence tdbnam;
    private java.lang.CharSequence tdmnam;
    private java.lang.CharSequence tdsnam;
    private java.lang.CharSequence tddnam;
    private java.lang.CharSequence tddcn1;
    private java.lang.CharSequence tddcn2;
    private java.lang.CharSequence tddcn3;
    private java.lang.CharSequence tddcn4;
    private java.lang.CharSequence amdtlr;
    private java.lang.CharSequence upddat;

    /** Creates a new Builder */
    private Builder() {
      super(org.fbi.sbs.online.code.txn88480.domain.Toa88480.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.tdbsrt)) {
        this.tdbsrt = data().deepCopy(fields()[0].schema(), other.tdbsrt);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tdmsrt)) {
        this.tdmsrt = data().deepCopy(fields()[1].schema(), other.tdmsrt);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tdssrt)) {
        this.tdssrt = data().deepCopy(fields()[2].schema(), other.tdssrt);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tdbnam)) {
        this.tdbnam = data().deepCopy(fields()[3].schema(), other.tdbnam);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tdmnam)) {
        this.tdmnam = data().deepCopy(fields()[4].schema(), other.tdmnam);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.tdsnam)) {
        this.tdsnam = data().deepCopy(fields()[5].schema(), other.tdsnam);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tddnam)) {
        this.tddnam = data().deepCopy(fields()[6].schema(), other.tddnam);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.tddcn1)) {
        this.tddcn1 = data().deepCopy(fields()[7].schema(), other.tddcn1);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.tddcn2)) {
        this.tddcn2 = data().deepCopy(fields()[8].schema(), other.tddcn2);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.tddcn3)) {
        this.tddcn3 = data().deepCopy(fields()[9].schema(), other.tddcn3);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.tddcn4)) {
        this.tddcn4 = data().deepCopy(fields()[10].schema(), other.tddcn4);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.amdtlr)) {
        this.amdtlr = data().deepCopy(fields()[11].schema(), other.amdtlr);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.upddat)) {
        this.upddat = data().deepCopy(fields()[12].schema(), other.upddat);
        fieldSetFlags()[12] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Toa88480 instance */
    private Builder(org.fbi.sbs.online.code.txn88480.domain.Toa88480 other) {
            super(org.fbi.sbs.online.code.txn88480.domain.Toa88480.SCHEMA$);
      if (isValidValue(fields()[0], other.tdbsrt)) {
        this.tdbsrt = data().deepCopy(fields()[0].schema(), other.tdbsrt);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tdmsrt)) {
        this.tdmsrt = data().deepCopy(fields()[1].schema(), other.tdmsrt);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tdssrt)) {
        this.tdssrt = data().deepCopy(fields()[2].schema(), other.tdssrt);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tdbnam)) {
        this.tdbnam = data().deepCopy(fields()[3].schema(), other.tdbnam);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tdmnam)) {
        this.tdmnam = data().deepCopy(fields()[4].schema(), other.tdmnam);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.tdsnam)) {
        this.tdsnam = data().deepCopy(fields()[5].schema(), other.tdsnam);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.tddnam)) {
        this.tddnam = data().deepCopy(fields()[6].schema(), other.tddnam);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.tddcn1)) {
        this.tddcn1 = data().deepCopy(fields()[7].schema(), other.tddcn1);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.tddcn2)) {
        this.tddcn2 = data().deepCopy(fields()[8].schema(), other.tddcn2);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.tddcn3)) {
        this.tddcn3 = data().deepCopy(fields()[9].schema(), other.tddcn3);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.tddcn4)) {
        this.tddcn4 = data().deepCopy(fields()[10].schema(), other.tddcn4);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.amdtlr)) {
        this.amdtlr = data().deepCopy(fields()[11].schema(), other.amdtlr);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.upddat)) {
        this.upddat = data().deepCopy(fields()[12].schema(), other.upddat);
        fieldSetFlags()[12] = true;
      }
    }

    /** Gets the value of the 'tdbsrt' field */
    public java.lang.CharSequence getTdbsrt() {
      return tdbsrt;
    }
    
    /** Sets the value of the 'tdbsrt' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTdbsrt(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.tdbsrt = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'tdbsrt' field has been set */
    public boolean hasTdbsrt() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'tdbsrt' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTdbsrt() {
      tdbsrt = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'tdmsrt' field */
    public java.lang.CharSequence getTdmsrt() {
      return tdmsrt;
    }
    
    /** Sets the value of the 'tdmsrt' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTdmsrt(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.tdmsrt = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'tdmsrt' field has been set */
    public boolean hasTdmsrt() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'tdmsrt' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTdmsrt() {
      tdmsrt = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'tdssrt' field */
    public java.lang.CharSequence getTdssrt() {
      return tdssrt;
    }
    
    /** Sets the value of the 'tdssrt' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTdssrt(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.tdssrt = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'tdssrt' field has been set */
    public boolean hasTdssrt() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'tdssrt' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTdssrt() {
      tdssrt = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'tdbnam' field */
    public java.lang.CharSequence getTdbnam() {
      return tdbnam;
    }
    
    /** Sets the value of the 'tdbnam' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTdbnam(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.tdbnam = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'tdbnam' field has been set */
    public boolean hasTdbnam() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'tdbnam' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTdbnam() {
      tdbnam = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'tdmnam' field */
    public java.lang.CharSequence getTdmnam() {
      return tdmnam;
    }
    
    /** Sets the value of the 'tdmnam' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTdmnam(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.tdmnam = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'tdmnam' field has been set */
    public boolean hasTdmnam() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'tdmnam' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTdmnam() {
      tdmnam = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'tdsnam' field */
    public java.lang.CharSequence getTdsnam() {
      return tdsnam;
    }
    
    /** Sets the value of the 'tdsnam' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTdsnam(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.tdsnam = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'tdsnam' field has been set */
    public boolean hasTdsnam() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'tdsnam' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTdsnam() {
      tdsnam = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'tddnam' field */
    public java.lang.CharSequence getTddnam() {
      return tddnam;
    }
    
    /** Sets the value of the 'tddnam' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTddnam(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.tddnam = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'tddnam' field has been set */
    public boolean hasTddnam() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'tddnam' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTddnam() {
      tddnam = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'tddcn1' field */
    public java.lang.CharSequence getTddcn1() {
      return tddcn1;
    }
    
    /** Sets the value of the 'tddcn1' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTddcn1(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.tddcn1 = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'tddcn1' field has been set */
    public boolean hasTddcn1() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'tddcn1' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTddcn1() {
      tddcn1 = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'tddcn2' field */
    public java.lang.CharSequence getTddcn2() {
      return tddcn2;
    }
    
    /** Sets the value of the 'tddcn2' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTddcn2(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.tddcn2 = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'tddcn2' field has been set */
    public boolean hasTddcn2() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'tddcn2' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTddcn2() {
      tddcn2 = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'tddcn3' field */
    public java.lang.CharSequence getTddcn3() {
      return tddcn3;
    }
    
    /** Sets the value of the 'tddcn3' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTddcn3(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.tddcn3 = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'tddcn3' field has been set */
    public boolean hasTddcn3() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'tddcn3' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTddcn3() {
      tddcn3 = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'tddcn4' field */
    public java.lang.CharSequence getTddcn4() {
      return tddcn4;
    }
    
    /** Sets the value of the 'tddcn4' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setTddcn4(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.tddcn4 = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'tddcn4' field has been set */
    public boolean hasTddcn4() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'tddcn4' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearTddcn4() {
      tddcn4 = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'amdtlr' field */
    public java.lang.CharSequence getAmdtlr() {
      return amdtlr;
    }
    
    /** Sets the value of the 'amdtlr' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setAmdtlr(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.amdtlr = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'amdtlr' field has been set */
    public boolean hasAmdtlr() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'amdtlr' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearAmdtlr() {
      amdtlr = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'upddat' field */
    public java.lang.CharSequence getUpddat() {
      return upddat;
    }
    
    /** Sets the value of the 'upddat' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder setUpddat(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.upddat = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'upddat' field has been set */
    public boolean hasUpddat() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'upddat' field */
    public org.fbi.sbs.online.code.txn88480.domain.Toa88480.Builder clearUpddat() {
      upddat = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public Toa88480 build() {
      try {
        Toa88480 record = new Toa88480();
        record.tdbsrt = fieldSetFlags()[0] ? this.tdbsrt : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.tdmsrt = fieldSetFlags()[1] ? this.tdmsrt : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.tdssrt = fieldSetFlags()[2] ? this.tdssrt : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.tdbnam = fieldSetFlags()[3] ? this.tdbnam : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.tdmnam = fieldSetFlags()[4] ? this.tdmnam : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.tdsnam = fieldSetFlags()[5] ? this.tdsnam : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.tddnam = fieldSetFlags()[6] ? this.tddnam : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.tddcn1 = fieldSetFlags()[7] ? this.tddcn1 : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.tddcn2 = fieldSetFlags()[8] ? this.tddcn2 : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.tddcn3 = fieldSetFlags()[9] ? this.tddcn3 : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.tddcn4 = fieldSetFlags()[10] ? this.tddcn4 : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.amdtlr = fieldSetFlags()[11] ? this.amdtlr : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.upddat = fieldSetFlags()[12] ? this.upddat : (java.lang.CharSequence) defaultValue(fields()[12]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
