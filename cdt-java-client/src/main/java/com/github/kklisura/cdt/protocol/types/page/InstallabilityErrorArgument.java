package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

@Experimental
public class InstallabilityErrorArgument {

  private String name;

  private String value;

  /** Argument name (e.g. name:'minimum-icon-size-in-pixels'). */
  public String getName() {
    return name;
  }

  /** Argument name (e.g. name:'minimum-icon-size-in-pixels'). */
  public void setName(String name) {
    this.name = name;
  }

  /** Argument value (e.g. value:'64'). */
  public String getValue() {
    return value;
  }

  /** Argument value (e.g. value:'64'). */
  public void setValue(String value) {
    this.value = value;
  }
}
