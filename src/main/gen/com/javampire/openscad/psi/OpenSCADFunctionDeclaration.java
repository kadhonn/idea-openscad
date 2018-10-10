// This is a generated file. Not intended for manual editing.
package com.javampire.openscad.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.navigation.ItemPresentation;

public interface OpenSCADFunctionDeclaration extends OpenSCADNamedElement {

  @NotNull
  OpenSCADArgDeclarationList getArgDeclarationList();

  @NotNull
  OpenSCADExpr getExpr();

  ItemPresentation getPresentation();

  String getName();

  PsiElement setName(String newName);

  PsiElement getNameIdentifier();

}
