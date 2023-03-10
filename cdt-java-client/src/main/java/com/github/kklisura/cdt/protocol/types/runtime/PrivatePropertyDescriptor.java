package com.github.kklisura.cdt.protocol.types.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Object private field descriptor. */
@Experimental
public class PrivatePropertyDescriptor {

  private String name;

  @Optional private RemoteObject value;

  @Optional private RemoteObject get;

  @Optional private RemoteObject set;

  /** Private property name. */
  public String getName() {
    return name;
  }

  /** Private property name. */
  public void setName(String name) {
    this.name = name;
  }

  /** The value associated with the private property. */
  public RemoteObject getValue() {
    return value;
  }

  /** The value associated with the private property. */
  public void setValue(RemoteObject value) {
    this.value = value;
  }

  /**
   * A function which serves as a getter for the private property, or `undefined` if there is no
   * getter (accessor descriptors only).
   */
  public RemoteObject getGet() {
    return get;
  }

  /**
   * A function which serves as a getter for the private property, or `undefined` if there is no
   * getter (accessor descriptors only).
   */
  public void setGet(RemoteObject get) {
    this.get = get;
  }

  /**
   * A function which serves as a setter for the private property, or `undefined` if there is no
   * setter (accessor descriptors only).
   */
  public RemoteObject getSet() {
    return set;
  }

  /**
   * A function which serves as a setter for the private property, or `undefined` if there is no
   * setter (accessor descriptors only).
   */
  public void setSet(RemoteObject set) {
    this.set = set;
  }
}
