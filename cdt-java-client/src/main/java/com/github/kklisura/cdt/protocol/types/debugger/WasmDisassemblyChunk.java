package com.github.kklisura.cdt.protocol.types.debugger;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import java.util.List;

@Experimental
public class WasmDisassemblyChunk {

  private List<String> lines;

  private List<Integer> bytecodeOffsets;

  /** The next chunk of disassembled lines. */
  public List<String> getLines() {
    return lines;
  }

  /** The next chunk of disassembled lines. */
  public void setLines(List<String> lines) {
    this.lines = lines;
  }

  /** The bytecode offsets describing the start of each line. */
  public List<Integer> getBytecodeOffsets() {
    return bytecodeOffsets;
  }

  /** The bytecode offsets describing the start of each line. */
  public void setBytecodeOffsets(List<Integer> bytecodeOffsets) {
    this.bytecodeOffsets = bytecodeOffsets;
  }
}
