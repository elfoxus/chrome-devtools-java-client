package com.github.kklisura.cdt.protocol.types.webaudio;

/** Protocol object for AudioParam */
public class AudioParam {

  private String paramId;

  private String nodeId;

  private String contextId;

  private String paramType;

  private AutomationRate rate;

  private Double defaultValue;

  private Double minValue;

  private Double maxValue;

  public String getParamId() {
    return paramId;
  }

  public void setParamId(String paramId) {
    this.paramId = paramId;
  }

  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public String getParamType() {
    return paramType;
  }

  public void setParamType(String paramType) {
    this.paramType = paramType;
  }

  public AutomationRate getRate() {
    return rate;
  }

  public void setRate(AutomationRate rate) {
    this.rate = rate;
  }

  public Double getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Double defaultValue) {
    this.defaultValue = defaultValue;
  }

  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }
}
