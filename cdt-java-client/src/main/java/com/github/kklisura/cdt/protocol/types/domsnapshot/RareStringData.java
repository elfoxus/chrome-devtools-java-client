package com.github.kklisura.cdt.protocol.types.domsnapshot;

import java.util.List;

/** Data that is only present on rare nodes. */
public class RareStringData {

  private List<Integer> index;

  private List<Integer> value;

  public List<Integer> getIndex() {
    return index;
  }

  public void setIndex(List<Integer> index) {
    this.index = index;
  }

  public List<Integer> getValue() {
    return value;
  }

  public void setValue(List<Integer> value) {
    this.value = value;
  }
}
