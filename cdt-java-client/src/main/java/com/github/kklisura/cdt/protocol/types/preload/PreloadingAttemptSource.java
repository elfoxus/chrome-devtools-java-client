package com.github.kklisura.cdt.protocol.types.preload;

import java.util.List;

/**
 * Lists sources for a preloading attempt, specifically the ids of rule sets that had a speculation
 * rule that triggered the attempt, and the BackendNodeIds of <a href> or <area href> elements that
 * triggered the attempt (in the case of attempts triggered by a document rule). It is possible for
 * mulitple rule sets and links to trigger a single attempt.
 */
public class PreloadingAttemptSource {

  private PreloadingAttemptKey key;

  private List<String> ruleSetIds;

  private List<Integer> nodeIds;

  public PreloadingAttemptKey getKey() {
    return key;
  }

  public void setKey(PreloadingAttemptKey key) {
    this.key = key;
  }

  public List<String> getRuleSetIds() {
    return ruleSetIds;
  }

  public void setRuleSetIds(List<String> ruleSetIds) {
    this.ruleSetIds = ruleSetIds;
  }

  public List<Integer> getNodeIds() {
    return nodeIds;
  }

  public void setNodeIds(List<Integer> nodeIds) {
    this.nodeIds = nodeIds;
  }
}
