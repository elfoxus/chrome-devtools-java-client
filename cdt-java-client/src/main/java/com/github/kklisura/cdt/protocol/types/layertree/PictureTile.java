package com.github.kklisura.cdt.protocol.types.layertree;

/** Serialized fragment of layer picture along with its offset within the layer. */
public class PictureTile {

  private Double x;

  private Double y;

  private String picture;

  /** Offset from owning layer left boundary */
  public Double getX() {
    return x;
  }

  /** Offset from owning layer left boundary */
  public void setX(Double x) {
    this.x = x;
  }

  /** Offset from owning layer top boundary */
  public Double getY() {
    return y;
  }

  /** Offset from owning layer top boundary */
  public void setY(Double y) {
    this.y = y;
  }

  /** Base64-encoded snapshot data. (Encoded as a base64 string when passed over JSON) */
  public String getPicture() {
    return picture;
  }

  /** Base64-encoded snapshot data. (Encoded as a base64 string when passed over JSON) */
  public void setPicture(String picture) {
    this.picture = picture;
  }
}
