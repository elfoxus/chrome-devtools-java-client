package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

@Experimental
public class PermissionsPolicyFeatureState {

  private PermissionsPolicyFeature feature;

  private Boolean allowed;

  @Optional private PermissionsPolicyBlockLocator locator;

  public PermissionsPolicyFeature getFeature() {
    return feature;
  }

  public void setFeature(PermissionsPolicyFeature feature) {
    this.feature = feature;
  }

  public Boolean getAllowed() {
    return allowed;
  }

  public void setAllowed(Boolean allowed) {
    this.allowed = allowed;
  }

  public PermissionsPolicyBlockLocator getLocator() {
    return locator;
  }

  public void setLocator(PermissionsPolicyBlockLocator locator) {
    this.locator = locator;
  }
}
