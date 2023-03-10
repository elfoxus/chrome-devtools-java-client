package com.github.kklisura.cdt.protocol.types.css;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.dom.LogicalAxes;
import com.github.kklisura.cdt.protocol.types.dom.PhysicalAxes;

/** CSS container query rule descriptor. */
@Experimental
public class CSSContainerQuery {

  private String text;

  @Optional private SourceRange range;

  @Optional private String styleSheetId;

  @Optional private String name;

  @Optional private PhysicalAxes physicalAxes;

  @Optional private LogicalAxes logicalAxes;

  /** Container query text. */
  public String getText() {
    return text;
  }

  /** Container query text. */
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

  /** Optional name for the container. */
  public String getName() {
    return name;
  }

  /** Optional name for the container. */
  public void setName(String name) {
    this.name = name;
  }

  /** Optional physical axes queried for the container. */
  public PhysicalAxes getPhysicalAxes() {
    return physicalAxes;
  }

  /** Optional physical axes queried for the container. */
  public void setPhysicalAxes(PhysicalAxes physicalAxes) {
    this.physicalAxes = physicalAxes;
  }

  /** Optional logical axes queried for the container. */
  public LogicalAxes getLogicalAxes() {
    return logicalAxes;
  }

  /** Optional logical axes queried for the container. */
  public void setLogicalAxes(LogicalAxes logicalAxes) {
    this.logicalAxes = logicalAxes;
  }
}
