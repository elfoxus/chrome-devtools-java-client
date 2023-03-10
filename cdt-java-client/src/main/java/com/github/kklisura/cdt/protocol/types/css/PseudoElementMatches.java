package com.github.kklisura.cdt.protocol.types.css;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.dom.PseudoType;
import java.util.List;

/** CSS rule collection for a single pseudo style. */
public class PseudoElementMatches {

  private PseudoType pseudoType;

  @Optional private String pseudoIdentifier;

  private List<RuleMatch> matches;

  /** Pseudo element type. */
  public PseudoType getPseudoType() {
    return pseudoType;
  }

  /** Pseudo element type. */
  public void setPseudoType(PseudoType pseudoType) {
    this.pseudoType = pseudoType;
  }

  /** Pseudo element custom ident. */
  public String getPseudoIdentifier() {
    return pseudoIdentifier;
  }

  /** Pseudo element custom ident. */
  public void setPseudoIdentifier(String pseudoIdentifier) {
    this.pseudoIdentifier = pseudoIdentifier;
  }

  /** Matches of CSS rules applicable to the pseudo style. */
  public List<RuleMatch> getMatches() {
    return matches;
  }

  /** Matches of CSS rules applicable to the pseudo style. */
  public void setMatches(List<RuleMatch> matches) {
    this.matches = matches;
  }
}
