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

import static com.github.kklisura.cdt.definition.builder.support.java.builder.impl.JavaInterfaceBuilderImpl.getClassList;
import static com.github.kklisura.cdt.definition.builder.support.java.builder.impl.JavaInterfaceBuilderImpl.isClassList;
import static org.easymock.EasyMock.capture;
import static org.easymock.EasyMock.eq;
import static org.junit.Assert.*;

import com.github.javaparser.ast.CompilationUnit;
import com.github.kklisura.cdt.definition.builder.support.java.builder.SourceProject;
import com.github.kklisura.cdt.definition.builder.support.java.builder.support.MethodParam;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.easymock.Capture;
import org.easymock.EasyMockRunner;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Java interface builder test.
 *
 * @author Kenan Klisura
 */
@RunWith(EasyMockRunner.class)
public class JavaInterfaceBuilderImplTest extends EasyMockSupport {
  String lineSeparator = System.lineSeparator();
  private static final String NAME = "InterfaceTest";
  private static final String BASE_PACKAGE_NAME = "com.github.kklisura";
  private static final String ANNOTATIONS_PACKAGE_NAME = "com.github.kklisura.annotations";

  private JavaInterfaceBuilderImpl interfaceBuilder;

  @Mock private SourceProject sourceProject;

  private Path rootPath;

  @Before
  public void setUp() throws Exception {
    rootPath = new File("/tmp/test-class-builder").toPath();
    interfaceBuilder =
        new JavaInterfaceBuilderImpl(BASE_PACKAGE_NAME, NAME, ANNOTATIONS_PACKAGE_NAME);
  }

  @Test
  public void testBasicInterface() throws IOException {
    Capture<CompilationUnit> compilationUnitCapture = Capture.newInstance();

    sourceProject.addCompilationUnit(
        eq(BASE_PACKAGE_NAME), eq(NAME), capture(compilationUnitCapture));

    interfaceBuilder.setJavaDoc("");

    replayAll();

    interfaceBuilder.build(sourceProject);

    assertEquals(
        new StringBuilder()
            .append("package com.github.kklisura;")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("public interface InterfaceTest {")
            .append(lineSeparator)
            .append("}")
            .append(lineSeparator)
            .append("")
            .toString(),
        compilationUnitCapture.getValue().toString());

    verifyAll();
  }

  @Test
  public void testBasicInterfaceWithAnnotation() throws IOException {
    Capture<CompilationUnit> compilationUnitCapture = Capture.newInstance();

    sourceProject.addCompilationUnit(
        eq(BASE_PACKAGE_NAME), eq(NAME), capture(compilationUnitCapture));

    interfaceBuilder.addAnnotation("Annotation");
    interfaceBuilder.addAnnotation("Annotation");
    interfaceBuilder.addAnnotation("Deprecated");
    interfaceBuilder.addAnnotation("Deprecated");

    replayAll();

    interfaceBuilder.build(sourceProject);

    assertEquals(
        new StringBuilder()
            .append("package com.github.kklisura;")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("import com.github.kklisura.annotations.Annotation;")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("@Annotation")
            .append(lineSeparator)
            .append("@Deprecated")
            .append(lineSeparator)
            .append("public interface InterfaceTest {")
            .append(lineSeparator)
            .append("}")
            .append(lineSeparator)
            .append("")
            .toString(),
        compilationUnitCapture.getValue().toString());

    verifyAll();
  }

  @Test
  public void testSetJavadoc() throws IOException {
    Capture<CompilationUnit> compilationUnitCapture = Capture.newInstance();

    sourceProject.addCompilationUnit(
        eq(BASE_PACKAGE_NAME), eq(NAME), capture(compilationUnitCapture));

    interfaceBuilder.setJavaDoc("Java doc.");

    replayAll();

    interfaceBuilder.build(sourceProject);

    assertEquals(
        new StringBuilder()
            .append("package com.github.kklisura;")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("/**")
            .append(lineSeparator)
            .append(" * Java doc.")
            .append(lineSeparator)
            .append(" */")
            .append(lineSeparator)
            .append("public interface InterfaceTest {")
            .append(lineSeparator)
            .append("}")
            .append(lineSeparator)
            .toString(),
        compilationUnitCapture.getValue().toString());

    verifyAll();
  }

  @Test
  public void testAddingImportsOnSamePackage() throws IOException {
    Capture<CompilationUnit> compilationUnitCapture = Capture.newInstance();

    sourceProject.addCompilationUnit(
        eq(BASE_PACKAGE_NAME), eq(NAME), capture(compilationUnitCapture));

    replayAll();

    interfaceBuilder.addImport(BASE_PACKAGE_NAME, "Test");
    interfaceBuilder.addImport("java.util", "List");
    interfaceBuilder.addImport("java.util", "List");
    interfaceBuilder.addImport("java.util", "List");

    interfaceBuilder.build(sourceProject);

    assertEquals(
        new StringBuilder()
            .append("package com.github.kklisura;")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("import java.util.List;")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("public interface InterfaceTest {")
            .append(lineSeparator)
            .append("}")
            .append(lineSeparator)
            .toString(),
        compilationUnitCapture.getValue().toString());

    verifyAll();
  }

  @Test
  public void testBasicInterfaceWithSimpleMethod() throws IOException {
    Capture<CompilationUnit> compilationUnitCapture = Capture.newInstance();

    sourceProject.addCompilationUnit(
        eq(BASE_PACKAGE_NAME), eq(NAME), capture(compilationUnitCapture));

    String description =
        new StringBuilder()
            .append("Method description")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("@param test Test param")
            .append(lineSeparator)
            .append("@return Returns nothing")
            .toString();
    interfaceBuilder.addMethod("someMethod1", description, Collections.emptyList(), null);

    replayAll();

    interfaceBuilder.build(sourceProject);

    assertEquals(
        new StringBuilder()
            .append("package com.github.kklisura;")
            .append(lineSeparator)
            .append("")
            .append(lineSeparator)
            .append("public interface InterfaceTest {")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("    /**")
            .append(lineSeparator)
            .append("     * Method description")
            .append(lineSeparator)
            .append("     *")
            .append(lineSeparator)
            .append("     * @param test Test param")
            .append(lineSeparator)
            .append("     * @return Returns nothing")
            .append(lineSeparator)
            .append("     */")
            .append(lineSeparator)
            .append("    void someMethod1();")
            .append(lineSeparator)
            .append("}")
            .append(lineSeparator)
            .toString(),
        compilationUnitCapture.getValue().toString());

    verifyAll();
  }

  @Test
  public void testBasicInterfaceWithSimpleMethod2() throws IOException {
    Capture<CompilationUnit> compilationUnitCapture = Capture.newInstance();

    sourceProject.addCompilationUnit(
        eq(BASE_PACKAGE_NAME), eq(NAME), capture(compilationUnitCapture));

    final MethodParam param1 = new MethodParam();
    param1.setType("Integer");
    param1.setName("param1");

    final MethodParam param2 = new MethodParam();
    param2.setType("String");
    param2.setName("param2");
    param2.setAnnotations(
        Arrays.asList(
            createAnnotation("Annotation"),
            createAnnotation("Annotation1"),
            createAnnotation("Annotation1"),
            createAnnotation("Deprecated"),
            createAnnotation("ParamValue", "paramValueName")));

    interfaceBuilder.addMethod("someMethod1", "", Arrays.asList(param1, param2), "String");
    interfaceBuilder.addMethodAnnotation("someMethod1", "Annotation");
    interfaceBuilder.addMethodAnnotation("someMethod1", "Annotation");

    interfaceBuilder.addParametrizedMethodAnnotation("someMethod1", "Annotation2", "param");
    interfaceBuilder.addParametrizedMethodAnnotation("someMethod1", "Annotation2", "param");
    interfaceBuilder.addParametrizedMethodAnnotation("someMethod1", "Annotation3", "String.class");
    interfaceBuilder.addParametrizedMethodAnnotation(
        "someMethod1", "Annotation4", "{String.class}");
    interfaceBuilder.addParametrizedMethodAnnotation(
        "someMethod1", "Annotation5", "{String.class,Integer.class}");

    replayAll();

    interfaceBuilder.build(sourceProject);

    assertEquals(
        new StringBuilder()
            .append("package com.github.kklisura;")
            .append(lineSeparator)
            .append("")
            .append(lineSeparator)
            .append("import com.github.kklisura.annotations.Annotation;")
            .append(lineSeparator)
            .append("import com.github.kklisura.annotations.Annotation1;")
            .append(lineSeparator)
            .append("import com.github.kklisura.annotations.ParamValue;")
            .append(lineSeparator)
            .append("import com.github.kklisura.annotations.Annotation2;")
            .append(lineSeparator)
            .append("import com.github.kklisura.annotations.Annotation3;")
            .append(lineSeparator)
            .append("import com.github.kklisura.annotations.Annotation4;")
            .append(lineSeparator)
            .append("import com.github.kklisura.annotations.Annotation5;")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("public interface InterfaceTest {")
            .append(lineSeparator)
            .append(lineSeparator)
            .append("    @Annotation")
            .append(lineSeparator)
            .append("    @Annotation2(\"param\")")
            .append(lineSeparator)
            .append("    @Annotation3(String.class)")
            .append(lineSeparator)
            .append("    @Annotation4(String.class)")
            .append(lineSeparator)
            .append("    @Annotation5({ String.class, Integer.class })")
            .append(lineSeparator)
            .append(
                "    String someMethod1(Integer param1, @Annotation @Annotation1 @Deprecated @ParamValue(\"paramValueName\") String param2);")
            .append(lineSeparator)
            .append("}")
            .append(lineSeparator)
            .toString(),
        compilationUnitCapture.getValue().toString());

    verifyAll();
  }

  @Test
  public void testIsClassList() {
    assertFalse(isClassList(""));
    assertFalse(isClassList("test"));
    assertTrue(isClassList("test.class"));
    assertTrue(isClassList("{test.class}"));
    assertTrue(isClassList("{test.class,test2.class}"));
    assertTrue(isClassList("{   test.class   ,   test2.class   }"));
    assertFalse(isClassList("{   test.class   .  test2.class   }"));
    assertTrue(isClassList("{test.class,test2.class}"));
    assertTrue(isClassList("{test.class,test2.class,test3.class}"));
  }

  @Test
  public void testGetClassList() {
    assertEquals(
        list("test.class", "test2.class", "test3.class"),
        getClassList("{test.class,    test2.class   ,   test3.class   }"));
    assertEquals(
        list("test.class", "test2.class", "test3.class"),
        getClassList("{test.class,test2.class,test3.class}"));
    assertEquals(list("test.class"), getClassList("{test.class}"));
    assertEquals(list(), getClassList("{test.clas}"));
    assertEquals(list(), getClassList("{}"));
    assertEquals(list("test.class"), getClassList("test.class"));
  }

  private MethodParam.Annotation createAnnotation(String name) {
    return new MethodParam.Annotation(name);
  }

  private MethodParam.Annotation createAnnotation(String name, String value) {
    return new MethodParam.Annotation(name, value);
  }

  private static List<String> list(String... values) {
    return Arrays.asList(values);
  }
}
