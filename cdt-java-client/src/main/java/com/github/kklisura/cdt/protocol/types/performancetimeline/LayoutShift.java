package com.github.kklisura.cdt.protocol.types.performancetimeline;

import java.util.List;

/** See https://wicg.github.io/layout-instability/#sec-layout-shift and layout_shift.idl */
public class LayoutShift {

  private Double value;

  private Boolean hadRecentInput;

  private Double lastInputTime;

  private List<LayoutShiftAttribution> sources;

  /** Score increment produced by this event. */
  public Double getValue() {
    return value;
  }

  /** Score increment produced by this event. */
  public void setValue(Double value) {
    this.value = value;
  }

  public Boolean getHadRecentInput() {
    return hadRecentInput;
  }

  public void setHadRecentInput(Boolean hadRecentInput) {
    this.hadRecentInput = hadRecentInput;
  }

  public Double getLastInputTime() {
    return lastInputTime;
  }

  public void setLastInputTime(Double lastInputTime) {
    this.lastInputTime = lastInputTime;
  }

  public List<LayoutShiftAttribution> getSources() {
    return sources;
  }

  public void setSources(List<LayoutShiftAttribution> sources) {
    this.sources = sources;
  }
}
