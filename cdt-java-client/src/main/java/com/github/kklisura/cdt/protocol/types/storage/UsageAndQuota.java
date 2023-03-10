package com.github.kklisura.cdt.protocol.types.storage;

import java.util.List;

public class UsageAndQuota {

  private Double usage;

  private Double quota;

  private Boolean overrideActive;

  private List<UsageForType> usageBreakdown;

  /** Storage usage (bytes). */
  public Double getUsage() {
    return usage;
  }

  /** Storage usage (bytes). */
  public void setUsage(Double usage) {
    this.usage = usage;
  }

  /** Storage quota (bytes). */
  public Double getQuota() {
    return quota;
  }

  /** Storage quota (bytes). */
  public void setQuota(Double quota) {
    this.quota = quota;
  }

  /** Whether or not the origin has an active storage quota override */
  public Boolean getOverrideActive() {
    return overrideActive;
  }

  /** Whether or not the origin has an active storage quota override */
  public void setOverrideActive(Boolean overrideActive) {
    this.overrideActive = overrideActive;
  }

  /** Storage usage per type (bytes). */
  public List<UsageForType> getUsageBreakdown() {
    return usageBreakdown;
  }

  /** Storage usage per type (bytes). */
  public void setUsageBreakdown(List<UsageForType> usageBreakdown) {
    this.usageBreakdown = usageBreakdown;
  }
}
