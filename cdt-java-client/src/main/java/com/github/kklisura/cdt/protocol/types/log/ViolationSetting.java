package com.github.kklisura.cdt.protocol.types.log;

/** Violation configuration setting. */
public class ViolationSetting {

  private ViolationSettingName name;

  private Double threshold;

  /** Violation type. */
  public ViolationSettingName getName() {
    return name;
  }

  /** Violation type. */
  public void setName(ViolationSettingName name) {
    this.name = name;
  }

  /** Time threshold to trigger upon. */
  public Double getThreshold() {
    return threshold;
  }

  /** Time threshold to trigger upon. */
  public void setThreshold(Double threshold) {
    this.threshold = threshold;
  }
}
