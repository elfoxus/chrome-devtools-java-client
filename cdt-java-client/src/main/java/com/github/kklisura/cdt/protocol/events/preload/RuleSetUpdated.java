package com.github.kklisura.cdt.protocol.events.preload;

import com.github.kklisura.cdt.protocol.types.preload.RuleSet;

/** Upsert. Currently, it is only emitted when a rule set added. */
public class RuleSetUpdated {

  private RuleSet ruleSet;

  public RuleSet getRuleSet() {
    return ruleSet;
  }

  public void setRuleSet(RuleSet ruleSet) {
    this.ruleSet = ruleSet;
  }
}
