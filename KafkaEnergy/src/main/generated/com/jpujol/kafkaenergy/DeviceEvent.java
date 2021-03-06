/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.jpujol.kafkaenergy;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class DeviceEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2128671587839899758L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DeviceEvent\",\"namespace\":\"com.jpujol.kafkaenergy\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"charging\",\"type\":\"int\",\"default\":0},{\"name\":\"charging_source\",\"type\":[\"string\",\"null\"],\"default\":\"\"},{\"name\":\"current_capacity\",\"type\":\"int\",\"default\":0},{\"name\":\"moduleL_temp\",\"type\":\"int\",\"default\":0},{\"name\":\"moduleR_temp\",\"type\":\"int\",\"default\":0},{\"name\":\"processor1_temp\",\"type\":\"int\",\"default\":0},{\"name\":\"processor2_temp\",\"type\":\"int\",\"default\":0},{\"name\":\"processor3_temp\",\"type\":\"int\",\"default\":0},{\"name\":\"processor4_temp\",\"type\":\"int\",\"default\":0},{\"name\":\"inverter_state\",\"type\":\"int\",\"default\":0},{\"name\":\"SoC_regulator\",\"type\":\"int\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DeviceEvent> ENCODER =
      new BinaryMessageEncoder<DeviceEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DeviceEvent> DECODER =
      new BinaryMessageDecoder<DeviceEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DeviceEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DeviceEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DeviceEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DeviceEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DeviceEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DeviceEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DeviceEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DeviceEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence id;
  private int charging;
  private java.lang.CharSequence charging_source;
  private int current_capacity;
  private int moduleL_temp;
  private int moduleR_temp;
  private int processor1_temp;
  private int processor2_temp;
  private int processor3_temp;
  private int processor4_temp;
  private int inverter_state;
  private int SoC_regulator;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DeviceEvent() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param charging The new value for charging
   * @param charging_source The new value for charging_source
   * @param current_capacity The new value for current_capacity
   * @param moduleL_temp The new value for moduleL_temp
   * @param moduleR_temp The new value for moduleR_temp
   * @param processor1_temp The new value for processor1_temp
   * @param processor2_temp The new value for processor2_temp
   * @param processor3_temp The new value for processor3_temp
   * @param processor4_temp The new value for processor4_temp
   * @param inverter_state The new value for inverter_state
   * @param SoC_regulator The new value for SoC_regulator
   */
  public DeviceEvent(java.lang.CharSequence id, java.lang.Integer charging, java.lang.CharSequence charging_source, java.lang.Integer current_capacity, java.lang.Integer moduleL_temp, java.lang.Integer moduleR_temp, java.lang.Integer processor1_temp, java.lang.Integer processor2_temp, java.lang.Integer processor3_temp, java.lang.Integer processor4_temp, java.lang.Integer inverter_state, java.lang.Integer SoC_regulator) {
    this.id = id;
    this.charging = charging;
    this.charging_source = charging_source;
    this.current_capacity = current_capacity;
    this.moduleL_temp = moduleL_temp;
    this.moduleR_temp = moduleR_temp;
    this.processor1_temp = processor1_temp;
    this.processor2_temp = processor2_temp;
    this.processor3_temp = processor3_temp;
    this.processor4_temp = processor4_temp;
    this.inverter_state = inverter_state;
    this.SoC_regulator = SoC_regulator;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return charging;
    case 2: return charging_source;
    case 3: return current_capacity;
    case 4: return moduleL_temp;
    case 5: return moduleR_temp;
    case 6: return processor1_temp;
    case 7: return processor2_temp;
    case 8: return processor3_temp;
    case 9: return processor4_temp;
    case 10: return inverter_state;
    case 11: return SoC_regulator;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: charging = (java.lang.Integer)value$; break;
    case 2: charging_source = (java.lang.CharSequence)value$; break;
    case 3: current_capacity = (java.lang.Integer)value$; break;
    case 4: moduleL_temp = (java.lang.Integer)value$; break;
    case 5: moduleR_temp = (java.lang.Integer)value$; break;
    case 6: processor1_temp = (java.lang.Integer)value$; break;
    case 7: processor2_temp = (java.lang.Integer)value$; break;
    case 8: processor3_temp = (java.lang.Integer)value$; break;
    case 9: processor4_temp = (java.lang.Integer)value$; break;
    case 10: inverter_state = (java.lang.Integer)value$; break;
    case 11: SoC_regulator = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'charging' field.
   * @return The value of the 'charging' field.
   */
  public int getCharging() {
    return charging;
  }


  /**
   * Sets the value of the 'charging' field.
   * @param value the value to set.
   */
  public void setCharging(int value) {
    this.charging = value;
  }

  /**
   * Gets the value of the 'charging_source' field.
   * @return The value of the 'charging_source' field.
   */
  public java.lang.CharSequence getChargingSource() {
    return charging_source;
  }


  /**
   * Sets the value of the 'charging_source' field.
   * @param value the value to set.
   */
  public void setChargingSource(java.lang.CharSequence value) {
    this.charging_source = value;
  }

  /**
   * Gets the value of the 'current_capacity' field.
   * @return The value of the 'current_capacity' field.
   */
  public int getCurrentCapacity() {
    return current_capacity;
  }


  /**
   * Sets the value of the 'current_capacity' field.
   * @param value the value to set.
   */
  public void setCurrentCapacity(int value) {
    this.current_capacity = value;
  }

  /**
   * Gets the value of the 'moduleL_temp' field.
   * @return The value of the 'moduleL_temp' field.
   */
  public int getModuleLTemp() {
    return moduleL_temp;
  }


  /**
   * Sets the value of the 'moduleL_temp' field.
   * @param value the value to set.
   */
  public void setModuleLTemp(int value) {
    this.moduleL_temp = value;
  }

  /**
   * Gets the value of the 'moduleR_temp' field.
   * @return The value of the 'moduleR_temp' field.
   */
  public int getModuleRTemp() {
    return moduleR_temp;
  }


  /**
   * Sets the value of the 'moduleR_temp' field.
   * @param value the value to set.
   */
  public void setModuleRTemp(int value) {
    this.moduleR_temp = value;
  }

  /**
   * Gets the value of the 'processor1_temp' field.
   * @return The value of the 'processor1_temp' field.
   */
  public int getProcessor1Temp() {
    return processor1_temp;
  }


  /**
   * Sets the value of the 'processor1_temp' field.
   * @param value the value to set.
   */
  public void setProcessor1Temp(int value) {
    this.processor1_temp = value;
  }

  /**
   * Gets the value of the 'processor2_temp' field.
   * @return The value of the 'processor2_temp' field.
   */
  public int getProcessor2Temp() {
    return processor2_temp;
  }


  /**
   * Sets the value of the 'processor2_temp' field.
   * @param value the value to set.
   */
  public void setProcessor2Temp(int value) {
    this.processor2_temp = value;
  }

  /**
   * Gets the value of the 'processor3_temp' field.
   * @return The value of the 'processor3_temp' field.
   */
  public int getProcessor3Temp() {
    return processor3_temp;
  }


  /**
   * Sets the value of the 'processor3_temp' field.
   * @param value the value to set.
   */
  public void setProcessor3Temp(int value) {
    this.processor3_temp = value;
  }

  /**
   * Gets the value of the 'processor4_temp' field.
   * @return The value of the 'processor4_temp' field.
   */
  public int getProcessor4Temp() {
    return processor4_temp;
  }


  /**
   * Sets the value of the 'processor4_temp' field.
   * @param value the value to set.
   */
  public void setProcessor4Temp(int value) {
    this.processor4_temp = value;
  }

  /**
   * Gets the value of the 'inverter_state' field.
   * @return The value of the 'inverter_state' field.
   */
  public int getInverterState() {
    return inverter_state;
  }


  /**
   * Sets the value of the 'inverter_state' field.
   * @param value the value to set.
   */
  public void setInverterState(int value) {
    this.inverter_state = value;
  }

  /**
   * Gets the value of the 'SoC_regulator' field.
   * @return The value of the 'SoC_regulator' field.
   */
  public int getSoCRegulator() {
    return SoC_regulator;
  }


  /**
   * Sets the value of the 'SoC_regulator' field.
   * @param value the value to set.
   */
  public void setSoCRegulator(int value) {
    this.SoC_regulator = value;
  }

  /**
   * Creates a new DeviceEvent RecordBuilder.
   * @return A new DeviceEvent RecordBuilder
   */
  public static com.jpujol.kafkaenergy.DeviceEvent.Builder newBuilder() {
    return new com.jpujol.kafkaenergy.DeviceEvent.Builder();
  }

  /**
   * Creates a new DeviceEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DeviceEvent RecordBuilder
   */
  public static com.jpujol.kafkaenergy.DeviceEvent.Builder newBuilder(com.jpujol.kafkaenergy.DeviceEvent.Builder other) {
    if (other == null) {
      return new com.jpujol.kafkaenergy.DeviceEvent.Builder();
    } else {
      return new com.jpujol.kafkaenergy.DeviceEvent.Builder(other);
    }
  }

  /**
   * Creates a new DeviceEvent RecordBuilder by copying an existing DeviceEvent instance.
   * @param other The existing instance to copy.
   * @return A new DeviceEvent RecordBuilder
   */
  public static com.jpujol.kafkaenergy.DeviceEvent.Builder newBuilder(com.jpujol.kafkaenergy.DeviceEvent other) {
    if (other == null) {
      return new com.jpujol.kafkaenergy.DeviceEvent.Builder();
    } else {
      return new com.jpujol.kafkaenergy.DeviceEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for DeviceEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DeviceEvent>
    implements org.apache.avro.data.RecordBuilder<DeviceEvent> {

    private java.lang.CharSequence id;
    private int charging;
    private java.lang.CharSequence charging_source;
    private int current_capacity;
    private int moduleL_temp;
    private int moduleR_temp;
    private int processor1_temp;
    private int processor2_temp;
    private int processor3_temp;
    private int processor4_temp;
    private int inverter_state;
    private int SoC_regulator;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.jpujol.kafkaenergy.DeviceEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.charging)) {
        this.charging = data().deepCopy(fields()[1].schema(), other.charging);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.charging_source)) {
        this.charging_source = data().deepCopy(fields()[2].schema(), other.charging_source);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.current_capacity)) {
        this.current_capacity = data().deepCopy(fields()[3].schema(), other.current_capacity);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.moduleL_temp)) {
        this.moduleL_temp = data().deepCopy(fields()[4].schema(), other.moduleL_temp);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.moduleR_temp)) {
        this.moduleR_temp = data().deepCopy(fields()[5].schema(), other.moduleR_temp);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.processor1_temp)) {
        this.processor1_temp = data().deepCopy(fields()[6].schema(), other.processor1_temp);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.processor2_temp)) {
        this.processor2_temp = data().deepCopy(fields()[7].schema(), other.processor2_temp);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.processor3_temp)) {
        this.processor3_temp = data().deepCopy(fields()[8].schema(), other.processor3_temp);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.processor4_temp)) {
        this.processor4_temp = data().deepCopy(fields()[9].schema(), other.processor4_temp);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (isValidValue(fields()[10], other.inverter_state)) {
        this.inverter_state = data().deepCopy(fields()[10].schema(), other.inverter_state);
        fieldSetFlags()[10] = other.fieldSetFlags()[10];
      }
      if (isValidValue(fields()[11], other.SoC_regulator)) {
        this.SoC_regulator = data().deepCopy(fields()[11].schema(), other.SoC_regulator);
        fieldSetFlags()[11] = other.fieldSetFlags()[11];
      }
    }

    /**
     * Creates a Builder by copying an existing DeviceEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.jpujol.kafkaenergy.DeviceEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.charging)) {
        this.charging = data().deepCopy(fields()[1].schema(), other.charging);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.charging_source)) {
        this.charging_source = data().deepCopy(fields()[2].schema(), other.charging_source);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.current_capacity)) {
        this.current_capacity = data().deepCopy(fields()[3].schema(), other.current_capacity);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.moduleL_temp)) {
        this.moduleL_temp = data().deepCopy(fields()[4].schema(), other.moduleL_temp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.moduleR_temp)) {
        this.moduleR_temp = data().deepCopy(fields()[5].schema(), other.moduleR_temp);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.processor1_temp)) {
        this.processor1_temp = data().deepCopy(fields()[6].schema(), other.processor1_temp);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.processor2_temp)) {
        this.processor2_temp = data().deepCopy(fields()[7].schema(), other.processor2_temp);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.processor3_temp)) {
        this.processor3_temp = data().deepCopy(fields()[8].schema(), other.processor3_temp);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.processor4_temp)) {
        this.processor4_temp = data().deepCopy(fields()[9].schema(), other.processor4_temp);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.inverter_state)) {
        this.inverter_state = data().deepCopy(fields()[10].schema(), other.inverter_state);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.SoC_regulator)) {
        this.SoC_regulator = data().deepCopy(fields()[11].schema(), other.SoC_regulator);
        fieldSetFlags()[11] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'charging' field.
      * @return The value.
      */
    public int getCharging() {
      return charging;
    }


    /**
      * Sets the value of the 'charging' field.
      * @param value The value of 'charging'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setCharging(int value) {
      validate(fields()[1], value);
      this.charging = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'charging' field has been set.
      * @return True if the 'charging' field has been set, false otherwise.
      */
    public boolean hasCharging() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'charging' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearCharging() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'charging_source' field.
      * @return The value.
      */
    public java.lang.CharSequence getChargingSource() {
      return charging_source;
    }


    /**
      * Sets the value of the 'charging_source' field.
      * @param value The value of 'charging_source'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setChargingSource(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.charging_source = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'charging_source' field has been set.
      * @return True if the 'charging_source' field has been set, false otherwise.
      */
    public boolean hasChargingSource() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'charging_source' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearChargingSource() {
      charging_source = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'current_capacity' field.
      * @return The value.
      */
    public int getCurrentCapacity() {
      return current_capacity;
    }


    /**
      * Sets the value of the 'current_capacity' field.
      * @param value The value of 'current_capacity'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setCurrentCapacity(int value) {
      validate(fields()[3], value);
      this.current_capacity = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'current_capacity' field has been set.
      * @return True if the 'current_capacity' field has been set, false otherwise.
      */
    public boolean hasCurrentCapacity() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'current_capacity' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearCurrentCapacity() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'moduleL_temp' field.
      * @return The value.
      */
    public int getModuleLTemp() {
      return moduleL_temp;
    }


    /**
      * Sets the value of the 'moduleL_temp' field.
      * @param value The value of 'moduleL_temp'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setModuleLTemp(int value) {
      validate(fields()[4], value);
      this.moduleL_temp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'moduleL_temp' field has been set.
      * @return True if the 'moduleL_temp' field has been set, false otherwise.
      */
    public boolean hasModuleLTemp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'moduleL_temp' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearModuleLTemp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'moduleR_temp' field.
      * @return The value.
      */
    public int getModuleRTemp() {
      return moduleR_temp;
    }


    /**
      * Sets the value of the 'moduleR_temp' field.
      * @param value The value of 'moduleR_temp'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setModuleRTemp(int value) {
      validate(fields()[5], value);
      this.moduleR_temp = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'moduleR_temp' field has been set.
      * @return True if the 'moduleR_temp' field has been set, false otherwise.
      */
    public boolean hasModuleRTemp() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'moduleR_temp' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearModuleRTemp() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor1_temp' field.
      * @return The value.
      */
    public int getProcessor1Temp() {
      return processor1_temp;
    }


    /**
      * Sets the value of the 'processor1_temp' field.
      * @param value The value of 'processor1_temp'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setProcessor1Temp(int value) {
      validate(fields()[6], value);
      this.processor1_temp = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'processor1_temp' field has been set.
      * @return True if the 'processor1_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor1Temp() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'processor1_temp' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearProcessor1Temp() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor2_temp' field.
      * @return The value.
      */
    public int getProcessor2Temp() {
      return processor2_temp;
    }


    /**
      * Sets the value of the 'processor2_temp' field.
      * @param value The value of 'processor2_temp'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setProcessor2Temp(int value) {
      validate(fields()[7], value);
      this.processor2_temp = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'processor2_temp' field has been set.
      * @return True if the 'processor2_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor2Temp() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'processor2_temp' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearProcessor2Temp() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor3_temp' field.
      * @return The value.
      */
    public int getProcessor3Temp() {
      return processor3_temp;
    }


    /**
      * Sets the value of the 'processor3_temp' field.
      * @param value The value of 'processor3_temp'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setProcessor3Temp(int value) {
      validate(fields()[8], value);
      this.processor3_temp = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'processor3_temp' field has been set.
      * @return True if the 'processor3_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor3Temp() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'processor3_temp' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearProcessor3Temp() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'processor4_temp' field.
      * @return The value.
      */
    public int getProcessor4Temp() {
      return processor4_temp;
    }


    /**
      * Sets the value of the 'processor4_temp' field.
      * @param value The value of 'processor4_temp'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setProcessor4Temp(int value) {
      validate(fields()[9], value);
      this.processor4_temp = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'processor4_temp' field has been set.
      * @return True if the 'processor4_temp' field has been set, false otherwise.
      */
    public boolean hasProcessor4Temp() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'processor4_temp' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearProcessor4Temp() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'inverter_state' field.
      * @return The value.
      */
    public int getInverterState() {
      return inverter_state;
    }


    /**
      * Sets the value of the 'inverter_state' field.
      * @param value The value of 'inverter_state'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setInverterState(int value) {
      validate(fields()[10], value);
      this.inverter_state = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'inverter_state' field has been set.
      * @return True if the 'inverter_state' field has been set, false otherwise.
      */
    public boolean hasInverterState() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'inverter_state' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearInverterState() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'SoC_regulator' field.
      * @return The value.
      */
    public int getSoCRegulator() {
      return SoC_regulator;
    }


    /**
      * Sets the value of the 'SoC_regulator' field.
      * @param value The value of 'SoC_regulator'.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder setSoCRegulator(int value) {
      validate(fields()[11], value);
      this.SoC_regulator = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'SoC_regulator' field has been set.
      * @return True if the 'SoC_regulator' field has been set, false otherwise.
      */
    public boolean hasSoCRegulator() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'SoC_regulator' field.
      * @return This builder.
      */
    public com.jpujol.kafkaenergy.DeviceEvent.Builder clearSoCRegulator() {
      fieldSetFlags()[11] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DeviceEvent build() {
      try {
        DeviceEvent record = new DeviceEvent();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.charging = fieldSetFlags()[1] ? this.charging : (java.lang.Integer) defaultValue(fields()[1]);
        record.charging_source = fieldSetFlags()[2] ? this.charging_source : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.current_capacity = fieldSetFlags()[3] ? this.current_capacity : (java.lang.Integer) defaultValue(fields()[3]);
        record.moduleL_temp = fieldSetFlags()[4] ? this.moduleL_temp : (java.lang.Integer) defaultValue(fields()[4]);
        record.moduleR_temp = fieldSetFlags()[5] ? this.moduleR_temp : (java.lang.Integer) defaultValue(fields()[5]);
        record.processor1_temp = fieldSetFlags()[6] ? this.processor1_temp : (java.lang.Integer) defaultValue(fields()[6]);
        record.processor2_temp = fieldSetFlags()[7] ? this.processor2_temp : (java.lang.Integer) defaultValue(fields()[7]);
        record.processor3_temp = fieldSetFlags()[8] ? this.processor3_temp : (java.lang.Integer) defaultValue(fields()[8]);
        record.processor4_temp = fieldSetFlags()[9] ? this.processor4_temp : (java.lang.Integer) defaultValue(fields()[9]);
        record.inverter_state = fieldSetFlags()[10] ? this.inverter_state : (java.lang.Integer) defaultValue(fields()[10]);
        record.SoC_regulator = fieldSetFlags()[11] ? this.SoC_regulator : (java.lang.Integer) defaultValue(fields()[11]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DeviceEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<DeviceEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DeviceEvent>
    READER$ = (org.apache.avro.io.DatumReader<DeviceEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.id);

    out.writeInt(this.charging);

    if (this.charging_source == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.charging_source);
    }

    out.writeInt(this.current_capacity);

    out.writeInt(this.moduleL_temp);

    out.writeInt(this.moduleR_temp);

    out.writeInt(this.processor1_temp);

    out.writeInt(this.processor2_temp);

    out.writeInt(this.processor3_temp);

    out.writeInt(this.processor4_temp);

    out.writeInt(this.inverter_state);

    out.writeInt(this.SoC_regulator);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);

      this.charging = in.readInt();

      if (in.readIndex() != 0) {
        in.readNull();
        this.charging_source = null;
      } else {
        this.charging_source = in.readString(this.charging_source instanceof Utf8 ? (Utf8)this.charging_source : null);
      }

      this.current_capacity = in.readInt();

      this.moduleL_temp = in.readInt();

      this.moduleR_temp = in.readInt();

      this.processor1_temp = in.readInt();

      this.processor2_temp = in.readInt();

      this.processor3_temp = in.readInt();

      this.processor4_temp = in.readInt();

      this.inverter_state = in.readInt();

      this.SoC_regulator = in.readInt();

    } else {
      for (int i = 0; i < 12; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          break;

        case 1:
          this.charging = in.readInt();
          break;

        case 2:
          if (in.readIndex() != 0) {
            in.readNull();
            this.charging_source = null;
          } else {
            this.charging_source = in.readString(this.charging_source instanceof Utf8 ? (Utf8)this.charging_source : null);
          }
          break;

        case 3:
          this.current_capacity = in.readInt();
          break;

        case 4:
          this.moduleL_temp = in.readInt();
          break;

        case 5:
          this.moduleR_temp = in.readInt();
          break;

        case 6:
          this.processor1_temp = in.readInt();
          break;

        case 7:
          this.processor2_temp = in.readInt();
          break;

        case 8:
          this.processor3_temp = in.readInt();
          break;

        case 9:
          this.processor4_temp = in.readInt();
          break;

        case 10:
          this.inverter_state = in.readInt();
          break;

        case 11:
          this.SoC_regulator = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










