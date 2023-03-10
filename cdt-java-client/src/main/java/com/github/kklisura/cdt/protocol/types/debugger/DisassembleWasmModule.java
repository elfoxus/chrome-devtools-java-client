package com.github.kklisura.cdt.protocol.types.debugger;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

public class DisassembleWasmModule {

  @Optional private String streamId;

  private Integer totalNumberOfLines;

  private List<Integer> functionBodyOffsets;

  private WasmDisassemblyChunk chunk;

  /**
   * For large modules, return a stream from which additional chunks of disassembly can be read
   * successively.
   */
  public String getStreamId() {
    return streamId;
  }

  /**
   * For large modules, return a stream from which additional chunks of disassembly can be read
   * successively.
   */
  public void setStreamId(String streamId) {
    this.streamId = streamId;
  }

  /** The total number of lines in the disassembly text. */
  public Integer getTotalNumberOfLines() {
    return totalNumberOfLines;
  }

  /** The total number of lines in the disassembly text. */
  public void setTotalNumberOfLines(Integer totalNumberOfLines) {
    this.totalNumberOfLines = totalNumberOfLines;
  }

  /**
   * The offsets of all function bodies, in the format [start1, end1, start2, end2, ...] where all
   * ends are exclusive.
   */
  public List<Integer> getFunctionBodyOffsets() {
    return functionBodyOffsets;
  }

  /**
   * The offsets of all function bodies, in the format [start1, end1, start2, end2, ...] where all
   * ends are exclusive.
   */
  public void setFunctionBodyOffsets(List<Integer> functionBodyOffsets) {
    this.functionBodyOffsets = functionBodyOffsets;
  }

  /** The first chunk of disassembly. */
  public WasmDisassemblyChunk getChunk() {
    return chunk;
  }

  /** The first chunk of disassembly. */
  public void setChunk(WasmDisassemblyChunk chunk) {
    this.chunk = chunk;
  }
}
