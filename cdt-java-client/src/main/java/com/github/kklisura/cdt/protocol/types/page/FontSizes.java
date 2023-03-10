package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Default font sizes. */
@Experimental
public class FontSizes {

  @Optional private Integer standard;

  @Optional private Integer fixed;

  /** Default standard font size. */
  public Integer getStandard() {
    return standard;
  }

  /** Default standard font size. */
  public void setStandard(Integer standard) {
    this.standard = standard;
  }

  /** Default fixed font size. */
  public Integer getFixed() {
    return fixed;
  }

  /** Default fixed font size. */
  public void setFixed(Integer fixed) {
    this.fixed = fixed;
  }
}
