package com.github.kklisura.cdt.definition.builder.support.java.builder.impl;

/*-
 * #%L
 * cdt-java-protocol-builder
 * %%
 * Copyright (C) 2018 - 2023 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.utils.SourceRoot;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.mockito.Mockito;

/**
 * Created by Kenan Klisura on 06/02/2018.
 *
 * @author Kenan Klisura
 */
class SourceProjectImplTest {

  private SourceRoot sourceRoot;

  @TempDir Path path;

  private SourceProjectImpl sourceProject;

  @BeforeEach
  public void setUp() {
    sourceRoot = Mockito.mock(SourceRoot.class);
    sourceProject = new SourceProjectImpl(sourceRoot);
  }

  @Test
  void testAddCompilationUnit() {
    CompilationUnit compilationUnit1 = new CompilationUnit();

    when(sourceRoot.getRoot()).thenReturn(path);

    when(sourceRoot.add(compilationUnit1)).thenReturn(sourceRoot);

    sourceProject.addCompilationUnit("com.github.kklisura", "name", compilationUnit1);

    //    verify(path, Mockito.times(1)).resolve("com/github/kklisura");
    verify(sourceRoot, Mockito.times(1)).getRoot();
    verify(sourceRoot, Mockito.times(1)).add(compilationUnit1);

    assertTrue(
        compilationUnit1.getStorage().get().getPath().endsWith("com/github/kklisura/name.java"));
  }

  @Test
  void testAddCompilationUnitThrowsExceptionWhenAddingDuplicateCompilationUnit() {
    CompilationUnit compilationUnit1 = new CompilationUnit();
    CompilationUnit compilationUnit2 = new CompilationUnit();
    compilationUnit2.addClass("TestClass");

    when(sourceRoot.getRoot()).thenReturn(path);

    when(sourceRoot.add(compilationUnit1)).thenReturn(sourceRoot);
    when(sourceRoot.add(compilationUnit2)).thenReturn(sourceRoot);

    sourceProject.addCompilationUnit("com.github.kklisura", "name", compilationUnit1);
    assertThrows(
        RuntimeException.class,
        () -> sourceProject.addCompilationUnit("com.github.kklisura", "name", compilationUnit2));
  }

  @Test
  void testAddCompilationUnitAddingDuplicateCompilationUnit() {
    CompilationUnit compilationUnit1 = new CompilationUnit();

    when(sourceRoot.getRoot()).thenReturn(path);

    when(sourceRoot.add(compilationUnit1)).thenReturn(sourceRoot);

    sourceProject.addCompilationUnit("com.github.kklisura", "name", compilationUnit1);
    sourceProject.addCompilationUnit("com.github.kklisura", "name", compilationUnit1);

    verify(sourceRoot, Mockito.times(2)).getRoot();
    verify(sourceRoot, Mockito.times(2)).add(compilationUnit1);

    assertTrue(
        compilationUnit1.getStorage().get().getPath().endsWith("com/github/kklisura/name.java"));
  }

  @Test
  void testSaveAll() throws IOException {
    CompilationUnit compilationUnit = new CompilationUnit();
    ClassOrInterfaceDeclaration classDeclaration = compilationUnit.addClass("TestClass");
    classDeclaration.addPrivateField("FieldType", "fieldName").createGetter();

    Path path = Files.createTempDirectory("cdt-test-dir");
    sourceProject = new SourceProjectImpl(path);
    sourceProject.addCompilationUnit("com.github.kklisura", "TestClass", compilationUnit);
    sourceProject.saveAll();

    File file = path.resolve("com/github/kklisura/TestClass.java").toFile();
    assertNotNull(file);

    try {

      StringBuilder result = new StringBuilder();
      Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine()) {
        result.append(myReader.nextLine()).append('\n');
      }

      var expected =
          "public class TestClass {\n"
              + "\n"
              + "  private FieldType fieldName;\n"
              + "\n"
              + "  public FieldType getFieldName() {\n"
              + "    return fieldName;\n"
              + "  }\n"
              + "}\n";

      assertTrue(expected.trim().equals(result.toString().trim()));
    } finally {
      file.delete();
    }
  }
}
