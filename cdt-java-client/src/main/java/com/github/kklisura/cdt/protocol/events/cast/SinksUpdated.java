package com.github.kklisura.cdt.protocol.events.cast;

import com.github.kklisura.cdt.protocol.types.cast.Sink;
import java.util.List;

/**
 * This is fired whenever the list of available sinks changes. A sink is a device or a software
 * surface that you can cast to.
 */
public class SinksUpdated {

  private List<Sink> sinks;

  public List<Sink> getSinks() {
    return sinks;
  }

  public void setSinks(List<Sink> sinks) {
    this.sinks = sinks;
  }
}
