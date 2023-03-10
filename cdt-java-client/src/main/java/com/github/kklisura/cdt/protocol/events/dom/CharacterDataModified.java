package com.github.kklisura.cdt.protocol.events.dom;

/** Mirrors `DOMCharacterDataModified` event. */
public class CharacterDataModified {

  private Integer nodeId;

  private String characterData;

  /** Id of the node that has changed. */
  public Integer getNodeId() {
    return nodeId;
  }

  /** Id of the node that has changed. */
  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  /** New text value. */
  public String getCharacterData() {
    return characterData;
  }

  /** New text value. */
  public void setCharacterData(String characterData) {
    this.characterData = characterData;
  }
}
