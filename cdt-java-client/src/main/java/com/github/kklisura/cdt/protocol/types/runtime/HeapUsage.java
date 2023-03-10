package com.github.kklisura.cdt.protocol.types.runtime;

public class HeapUsage {

  private Double usedSize;

  private Double totalSize;

  /** Used heap size in bytes. */
  public Double getUsedSize() {
    return usedSize;
  }

  /** Used heap size in bytes. */
  public void setUsedSize(Double usedSize) {
    this.usedSize = usedSize;
  }

  /** Allocated heap size in bytes. */
  public Double getTotalSize() {
    return totalSize;
  }

  /** Allocated heap size in bytes. */
  public void setTotalSize(Double totalSize) {
    this.totalSize = totalSize;
  }
}
