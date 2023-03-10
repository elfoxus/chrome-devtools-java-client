package com.github.kklisura.cdt.protocol.types.runtime;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

public class Properties {

  private List<PropertyDescriptor> result;

  @Optional private List<InternalPropertyDescriptor> internalProperties;

  @Experimental @Optional private List<PrivatePropertyDescriptor> privateProperties;

  @Optional private ExceptionDetails exceptionDetails;

  /** Object properties. */
  public List<PropertyDescriptor> getResult() {
    return result;
  }

  /** Object properties. */
  public void setResult(List<PropertyDescriptor> result) {
    this.result = result;
  }

  /** Internal object properties (only of the element itself). */
  public List<InternalPropertyDescriptor> getInternalProperties() {
    return internalProperties;
  }

  /** Internal object properties (only of the element itself). */
  public void setInternalProperties(List<InternalPropertyDescriptor> internalProperties) {
    this.internalProperties = internalProperties;
  }

  /** Object private properties. */
  public List<PrivatePropertyDescriptor> getPrivateProperties() {
    return privateProperties;
  }

  /** Object private properties. */
  public void setPrivateProperties(List<PrivatePropertyDescriptor> privateProperties) {
    this.privateProperties = privateProperties;
  }

  /** Exception details. */
  public ExceptionDetails getExceptionDetails() {
    return exceptionDetails;
  }

  /** Exception details. */
  public void setExceptionDetails(ExceptionDetails exceptionDetails) {
    this.exceptionDetails = exceptionDetails;
  }
}
