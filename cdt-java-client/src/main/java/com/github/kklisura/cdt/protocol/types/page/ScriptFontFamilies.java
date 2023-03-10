package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Font families collection for a script. */
@Experimental
public class ScriptFontFamilies {

  private String script;

  private FontFamilies fontFamilies;

  /** Name of the script which these font families are defined for. */
  public String getScript() {
    return script;
  }

  /** Name of the script which these font families are defined for. */
  public void setScript(String script) {
    this.script = script;
  }

  /** Generic font families collection for the script. */
  public FontFamilies getFontFamilies() {
    return fontFamilies;
  }

  /** Generic font families collection for the script. */
  public void setFontFamilies(FontFamilies fontFamilies) {
    this.fontFamilies = fontFamilies;
  }
}
