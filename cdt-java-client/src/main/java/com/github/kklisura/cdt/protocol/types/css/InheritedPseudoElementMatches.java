package com.github.kklisura.cdt.protocol.types.css;

import java.util.List;

/** Inherited pseudo element matches from pseudos of an ancestor node. */
public class InheritedPseudoElementMatches {

  private List<PseudoElementMatches> pseudoElements;

  /** Matches of pseudo styles from the pseudos of an ancestor node. */
  public List<PseudoElementMatches> getPseudoElements() {
    return pseudoElements;
  }

  /** Matches of pseudo styles from the pseudos of an ancestor node. */
  public void setPseudoElements(List<PseudoElementMatches> pseudoElements) {
    this.pseudoElements = pseudoElements;
  }
}
