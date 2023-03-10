package com.github.kklisura.cdt.protocol.types.css;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** CSS Supports at-rule descriptor. */
@Experimental
public class CSSSupports {

  private String text;

  private Boolean active;

  @Optional private SourceRange range;

  @Optional private String styleSheetId;

  /** Supports rule text. */
  public String getText() {
    return text;
  }

  /** Supports rule text. */
  public void setText(String text) {
    this.text = text;
  }

  /** Whether the supports condition is satisfied. */
  public Boolean getActive() {
    return active;
  }

  /** Whether the supports condition is satisfied. */
  public void setActive(Boolean active) {
    this.active = active;
  }

  /** The associated rule header range in the enclosing stylesheet (if available). */
  public SourceRange getRange() {
    return range;
  }

  /** The associated rule header range in the enclosing stylesheet (if available). */
  public void setRange(SourceRange range) {
    this.range = range;
  }

  /** Identifier of the stylesheet containing this object (if exists). */
  public String getStyleSheetId() {
    return styleSheetId;
  }

  /** Identifier of the stylesheet containing this object (if exists). */
  public void setStyleSheetId(String styleSheetId) {
    this.styleSheetId = styleSheetId;
  }
}
