// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface HaxeFunctionPrototypeDeclarationWithAttributes extends HaxeComponent {

  @Nullable
  public HaxeComponentName getComponentName();

  @Nullable
  public HaxeDeclarationAttributeList getDeclarationAttributeList();

  @Nullable
  public HaxeParameterList getParameterList();

  @NotNull
  public List<HaxeRequireMeta> getRequireMetaList();

  @Nullable
  public HaxeTypeParam getTypeParam();

  @Nullable
  public HaxeTypeTag getTypeTag();
}