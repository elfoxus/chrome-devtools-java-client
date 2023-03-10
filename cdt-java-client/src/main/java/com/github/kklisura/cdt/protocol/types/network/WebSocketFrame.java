package com.github.kklisura.cdt.protocol.types.network;

/**
 * WebSocket message data. This represents an entire WebSocket message, not just a fragmented frame
 * as the name suggests.
 */
public class WebSocketFrame {

  private Double opcode;

  private Boolean mask;

  private String payloadData;

  /** WebSocket message opcode. */
  public Double getOpcode() {
    return opcode;
  }

  /** WebSocket message opcode. */
  public void setOpcode(Double opcode) {
    this.opcode = opcode;
  }

  /** WebSocket message mask. */
  public Boolean getMask() {
    return mask;
  }

  /** WebSocket message mask. */
  public void setMask(Boolean mask) {
    this.mask = mask;
  }

  /**
   * WebSocket message payload data. If the opcode is 1, this is a text message and payloadData is a
   * UTF-8 string. If the opcode isn't 1, then payloadData is a base64 encoded string representing
   * binary data.
   */
  public String getPayloadData() {
    return payloadData;
  }

  /**
   * WebSocket message payload data. If the opcode is 1, this is a text message and payloadData is a
   * UTF-8 string. If the opcode isn't 1, then payloadData is a base64 encoded string representing
   * binary data.
   */
  public void setPayloadData(String payloadData) {
    this.payloadData = payloadData;
  }
}
