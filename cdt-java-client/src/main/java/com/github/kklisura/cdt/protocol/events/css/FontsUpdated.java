package com.github.kklisura.cdt.protocol.events.css;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.css.FontFace;

/**
 * Fires whenever a web font is updated. A non-empty font parameter indicates a successfully loaded
 * web font.
 */
public class FontsUpdated {

  @Optional private FontFace font;

  /** The web font that has loaded. */
  public FontFace getFont() {
    return font;
  }

  /** The web font that has loaded. */
  public void setFont(FontFace font) {
    this.font = font;
  }
}
