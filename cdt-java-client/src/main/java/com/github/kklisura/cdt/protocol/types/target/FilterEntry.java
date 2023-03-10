package com.github.kklisura.cdt.protocol.types.target;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** A filter used by target query/discovery/auto-attach operations. */
@Experimental
public class FilterEntry {

  @Optional private Boolean exclude;

  @Optional private String type;

  /** If set, causes exclusion of mathcing targets from the list. */
  public Boolean getExclude() {
    return exclude;
  }

  /** If set, causes exclusion of mathcing targets from the list. */
  public void setExclude(Boolean exclude) {
    this.exclude = exclude;
  }

  /** If not present, matches any type. */
  public String getType() {
    return type;
  }

  /** If not present, matches any type. */
  public void setType(String type) {
    this.type = type;
  }
}
