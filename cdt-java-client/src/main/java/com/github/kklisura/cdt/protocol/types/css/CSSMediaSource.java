package com.github.kklisura.cdt.protocol.types.css;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Source of the media query: "mediaRule" if specified by a @media rule, "importRule" if specified
 * by an @import rule, "linkedSheet" if specified by a "media" attribute in a linked stylesheet's
 * LINK tag, "inlineSheet" if specified by a "media" attribute in an inline stylesheet's STYLE tag.
 */
public enum CSSMediaSource {
  @JsonProperty("mediaRule")
  MEDIA_RULE,
  @JsonProperty("importRule")
  IMPORT_RULE,
  @JsonProperty("linkedSheet")
  LINKED_SHEET,
  @JsonProperty("inlineSheet")
  INLINE_SHEET
}
