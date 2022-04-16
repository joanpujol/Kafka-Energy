package com.jpujol.kafkaenergy.core;

public class DeviceEventModel {
  private String id;
  private int charging;
  private String charging_source;
  private int current_capacity;
  private int moduleL_temp;
  private int moduleR_temp;
  private int processor1_temp;
  private int processor2_temp;
  private int processor3_temp;
  private int processor4_temp;
  private int inverter_state;
  private int SoC_regulator;

  public int getCharging() {
    return charging;
  }

  public void setCharging(int charging) {
    this.charging = charging;
  }

  public String getCharging_source() {
    return charging_source;
  }

  public void setCharging_source(String charging_source) {
    this.charging_source = charging_source;
  }

  public int getCurrent_capacity() {
    return current_capacity;
  }

  public void setCurrent_capacity(int current_capacity) {
    this.current_capacity = current_capacity;
  }

  public int getModuleL_temp() {
    return moduleL_temp;
  }

  public void setModuleL_temp(int moduleL_temp) {
    this.moduleL_temp = moduleL_temp;
  }

  public int getModuleR_temp() {
    return moduleR_temp;
  }

  public void setModuleR_temp(int moduleR_temp) {
    this.moduleR_temp = moduleR_temp;
  }

  public int getProcessor1_temp() {
    return processor1_temp;
  }

  public void setProcessor1_temp(int processor1_temp) {
    this.processor1_temp = processor1_temp;
  }

  public int getProcessor2_temp() {
    return processor2_temp;
  }

  public void setProcessor2_temp(int processor2_temp) {
    this.processor2_temp = processor2_temp;
  }

  public int getProcessor3_temp() {
    return processor3_temp;
  }

  public void setProcessor3_temp(int processor3_temp) {
    this.processor3_temp = processor3_temp;
  }

  public int getProcessor4_temp() {
    return processor4_temp;
  }

  public void setProcessor4_temp(int processor4_temp) {
    this.processor4_temp = processor4_temp;
  }

  public int getInverter_state() {
    return inverter_state;
  }

  public void setInverter_state(int inverter_state) {
    this.inverter_state = inverter_state;
  }

  public int getSoC_regulator() {
    return SoC_regulator;
  }

  public void setSoC_regulator(int soC_regulator) {
    SoC_regulator = soC_regulator;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
