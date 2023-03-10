package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Generic font families collection. */
@Experimental
public class FontFamilies {

  @Optional private String standard;

  @Optional private String fixed;

  @Optional private String serif;

  @Optional private String sansSerif;

  @Optional private String cursive;

  @Optional private String fantasy;

  @Optional private String math;

  /** The standard font-family. */
  public String getStandard() {
    return standard;
  }

  /** The standard font-family. */
  public void setStandard(String standard) {
    this.standard = standard;
  }

  /** The fixed font-family. */
  public String getFixed() {
    return fixed;
  }

  /** The fixed font-family. */
  public void setFixed(String fixed) {
    this.fixed = fixed;
  }

  /** The serif font-family. */
  public String getSerif() {
    return serif;
  }

  /** The serif font-family. */
  public void setSerif(String serif) {
    this.serif = serif;
  }

  /** The sansSerif font-family. */
  public String getSansSerif() {
    return sansSerif;
  }

  /** The sansSerif font-family. */
  public void setSansSerif(String sansSerif) {
    this.sansSerif = sansSerif;
  }

  /** The cursive font-family. */
  public String getCursive() {
    return cursive;
  }

  /** The cursive font-family. */
  public void setCursive(String cursive) {
    this.cursive = cursive;
  }

  /** The fantasy font-family. */
  public String getFantasy() {
    return fantasy;
  }

  /** The fantasy font-family. */
  public void setFantasy(String fantasy) {
    this.fantasy = fantasy;
  }

  /** The math font-family. */
  public String getMath() {
    return math;
  }

  /** The math font-family. */
  public void setMath(String math) {
    this.math = math;
  }
}
