package com.github.kklisura.cdt.protocol.types.memory;

import java.util.List;

/** Array of heap profile samples. */
public class SamplingProfile {

  private List<SamplingProfileNode> samples;

  private List<Module> modules;

  public List<SamplingProfileNode> getSamples() {
    return samples;
  }

  public void setSamples(List<SamplingProfileNode> samples) {
    this.samples = samples;
  }

  public List<Module> getModules() {
    return modules;
  }

  public void setModules(List<Module> modules) {
    this.modules = modules;
  }
}
