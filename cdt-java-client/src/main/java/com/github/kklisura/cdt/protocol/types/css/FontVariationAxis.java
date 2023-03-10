package com.github.kklisura.cdt.protocol.types.css;

/** Information about font variation axes for variable fonts */
public class FontVariationAxis {

  private String tag;

  private String name;

  private Double minValue;

  private Double maxValue;

  private Double defaultValue;

  /** The font-variation-setting tag (a.k.a. "axis tag"). */
  public String getTag() {
    return tag;
  }

  /** The font-variation-setting tag (a.k.a. "axis tag"). */
  public void setTag(String tag) {
    this.tag = tag;
  }

  /** Human-readable variation name in the default language (normally, "en"). */
  public String getName() {
    return name;
  }

  /** Human-readable variation name in the default language (normally, "en"). */
  public void setName(String name) {
    this.name = name;
  }

  /** The minimum value (inclusive) the font supports for this tag. */
  public Double getMinValue() {
    return minValue;
  }

  /** The minimum value (inclusive) the font supports for this tag. */
  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  /** The maximum value (inclusive) the font supports for this tag. */
  public Double getMaxValue() {
    return maxValue;
  }

  /** The maximum value (inclusive) the font supports for this tag. */
  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  /** The default value. */
  public Double getDefaultValue() {
    return defaultValue;
  }

  /** The default value. */
  public void setDefaultValue(Double defaultValue) {
    this.defaultValue = defaultValue;
  }
}
