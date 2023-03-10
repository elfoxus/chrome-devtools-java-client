package com.github.kklisura.cdt.protocol.commands;

import com.github.kklisura.cdt.protocol.support.annotations.ReturnTypeParameter;
import com.github.kklisura.cdt.protocol.support.annotations.Returns;
import com.github.kklisura.cdt.protocol.types.schema.Domain;
import java.util.List;

/** This domain is deprecated. */
@Deprecated
public interface Schema {

  /** Returns supported domains. */
  @Returns("domains")
  @ReturnTypeParameter(Domain.class)
  List<Domain> getDomains();
}
