package com.github.kklisura.cdt.protocol.types.emulation;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

/** Used to specify User Agent Cient Hints to emulate. See https://wicg.github.io/ua-client-hints */
@Experimental
public class UserAgentBrandVersion {

  private String brand;

  private String version;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
