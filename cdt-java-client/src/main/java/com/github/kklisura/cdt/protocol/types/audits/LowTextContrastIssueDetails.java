package com.github.kklisura.cdt.protocol.types.audits;

public class LowTextContrastIssueDetails {

  private Integer violatingNodeId;

  private String violatingNodeSelector;

  private Double contrastRatio;

  private Double thresholdAA;

  private Double thresholdAAA;

  private String fontSize;

  private String fontWeight;

  public Integer getViolatingNodeId() {
    return violatingNodeId;
  }

  public void setViolatingNodeId(Integer violatingNodeId) {
    this.violatingNodeId = violatingNodeId;
  }

  public String getViolatingNodeSelector() {
    return violatingNodeSelector;
  }

  public void setViolatingNodeSelector(String violatingNodeSelector) {
    this.violatingNodeSelector = violatingNodeSelector;
  }

  public Double getContrastRatio() {
    return contrastRatio;
  }

  public void setContrastRatio(Double contrastRatio) {
    this.contrastRatio = contrastRatio;
  }

  public Double getThresholdAA() {
    return thresholdAA;
  }

  public void setThresholdAA(Double thresholdAA) {
    this.thresholdAA = thresholdAA;
  }

  public Double getThresholdAAA() {
    return thresholdAAA;
  }

  public void setThresholdAAA(Double thresholdAAA) {
    this.thresholdAAA = thresholdAAA;
  }

  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  public String getFontWeight() {
    return fontWeight;
  }

  public void setFontWeight(String fontWeight) {
    this.fontWeight = fontWeight;
  }
}
