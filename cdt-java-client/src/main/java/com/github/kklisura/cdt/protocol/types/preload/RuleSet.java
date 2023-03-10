package com.github.kklisura.cdt.protocol.types.preload;

/** Corresponds to SpeculationRuleSet */
public class RuleSet {

  private String id;

  private String loaderId;

  private String sourceText;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /** Identifies a document which the rule set is associated with. */
  public String getLoaderId() {
    return loaderId;
  }

  /** Identifies a document which the rule set is associated with. */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /**
   * Source text of JSON representing the rule set. If it comes from <script> tag, it is the
   * textContent of the node. Note that it is a JSON for valid case.
   *
   * <p>See also: - https://wicg.github.io/nav-speculation/speculation-rules.html -
   * https://github.com/WICG/nav-speculation/blob/main/triggers.md
   */
  public String getSourceText() {
    return sourceText;
  }

  /**
   * Source text of JSON representing the rule set. If it comes from <script> tag, it is the
   * textContent of the node. Note that it is a JSON for valid case.
   *
   * <p>See also: - https://wicg.github.io/nav-speculation/speculation-rules.html -
   * https://github.com/WICG/nav-speculation/blob/main/triggers.md
   */
  public void setSourceText(String sourceText) {
    this.sourceText = sourceText;
  }
}
