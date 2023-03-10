package com.github.kklisura.cdt.protocol.types.storage;

/** Details for an origin's shared storage. */
public class SharedStorageMetadata {

  private Double creationTime;

  private Integer length;

  private Double remainingBudget;

  public Double getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Double creationTime) {
    this.creationTime = creationTime;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Double getRemainingBudget() {
    return remainingBudget;
  }

  public void setRemainingBudget(Double remainingBudget) {
    this.remainingBudget = remainingBudget;
  }
}
