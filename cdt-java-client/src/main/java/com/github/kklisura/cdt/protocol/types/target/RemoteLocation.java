package com.github.kklisura.cdt.protocol.types.target;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;

@Experimental
public class RemoteLocation {

  private String host;

  private Integer port;

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }
}
