package com.github.kklisura.cdt.protocol.types.css;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** CSS Layer at-rule descriptor. */
@Experimental
public class CSSLayer {

  private String text;

  @Optional private SourceRange range;

  @Optional private String styleSheetId;

  /** Layer name. */
  public String getText() {
    return text;
  }

  /** Layer name. */
  public void setText(String text) {
    this.text = text;
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
