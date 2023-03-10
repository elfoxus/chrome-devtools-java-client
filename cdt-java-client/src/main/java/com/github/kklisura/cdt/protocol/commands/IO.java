package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.support.annotations.ParamName;
import com.github.kklisura.cdt.protocol.support.annotations.Returns;
import com.github.kklisura.cdt.protocol.types.io.Read;

/** Input/Output operations for streams produced by DevTools. */
public interface IO {

  /**
   * Close the stream, discard any temporary backing storage.
   *
   * @param handle Handle of the stream to close.
   */
  void close(@ParamName("handle") String handle);

  /**
   * Read a chunk of the stream
   *
   * @param handle Handle of the stream to read.
   */
  Read read(@ParamName("handle") String handle);

  /**
   * Read a chunk of the stream
   *
   * @param handle Handle of the stream to read.
   * @param offset Seek to the specified offset before reading (if not specificed, proceed with
   *     offset following the last read). Some types of streams may only support sequential reads.
   * @param size Maximum number of bytes to read (left upon the agent discretion if not specified).
   */
  Read read(
      @ParamName("handle") String handle,
      @Optional @ParamName("offset") Integer offset,
      @Optional @ParamName("size") Integer size);

  /**
   * Return UUID of Blob object specified by a remote object id.
   *
   * @param objectId Object id of a Blob object wrapper.
   */
  @Returns("uuid")
  String resolveBlob(@ParamName("objectId") String objectId);
}
