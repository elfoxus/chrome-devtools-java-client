package com.github.kklisura.cdt.protocol.types.css;

import java.util.List;

/** Media query descriptor. */
public class MediaQuery {

  private List<MediaQueryExpression> expressions;

  private Boolean active;

  /** Array of media query expressions. */
  public List<MediaQueryExpression> getExpressions() {
    return expressions;
  }

  /** Array of media query expressions. */
  public void setExpressions(List<MediaQueryExpression> expressions) {
    this.expressions = expressions;
  }

  /** Whether the media query condition is satisfied. */
  public Boolean getActive() {
    return active;
  }

  /** Whether the media query condition is satisfied. */
  public void setActive(Boolean active) {
    this.active = active;
  }
}
