package com.github.kklisura.cdt.protocol.events.storage;

import com.github.kklisura.cdt.protocol.types.storage.InterestGroupAccessType;

/** One of the interest groups was accessed by the associated page. */
public class InterestGroupAccessed {

  private Double accessTime;

  private InterestGroupAccessType type;

  private String ownerOrigin;

  private String name;

  public Double getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(Double accessTime) {
    this.accessTime = accessTime;
  }

  public InterestGroupAccessType getType() {
    return type;
  }

  public void setType(InterestGroupAccessType type) {
    this.type = type;
  }

  public String getOwnerOrigin() {
    return ownerOrigin;
  }

  public void setOwnerOrigin(String ownerOrigin) {
    this.ownerOrigin = ownerOrigin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
