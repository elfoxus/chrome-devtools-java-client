package com.github.kklisura.cdt.protocol.types.animation;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Animation type of `Animation`. */
public enum AnimationType {
  @JsonProperty("CSSTransition")
  CSS_TRANSITION,
  @JsonProperty("CSSAnimation")
  CSS_ANIMATION,
  @JsonProperty("WebAnimation")
  WEB_ANIMATION
}
