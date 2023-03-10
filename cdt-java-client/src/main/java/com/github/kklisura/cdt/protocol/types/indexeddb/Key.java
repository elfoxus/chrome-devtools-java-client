package com.github.kklisura.cdt.protocol.types.indexeddb;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** Key. */
public class Key {

  private KeyType type;

  @Optional private Double number;

  @Optional private String string;

  @Optional private Double date;

  @Optional private List<Key> array;

  /** Key type. */
  public KeyType getType() {
    return type;
  }

  /** Key type. */
  public void setType(KeyType type) {
    this.type = type;
  }

  /** Number value. */
  public Double getNumber() {
    return number;
  }

  /** Number value. */
  public void setNumber(Double number) {
    this.number = number;
  }

  /** String value. */
  public String getString() {
    return string;
  }

  /** String value. */
  public void setString(String string) {
    this.string = string;
  }

  /** Date value. */
  public Double getDate() {
    return date;
  }

  /** Date value. */
  public void setDate(Double date) {
    this.date = date;
  }

  /** Array value. */
  public List<Key> getArray() {
    return array;
  }

  /** Array value. */
  public void setArray(List<Key> array) {
    this.array = array;
  }
}
