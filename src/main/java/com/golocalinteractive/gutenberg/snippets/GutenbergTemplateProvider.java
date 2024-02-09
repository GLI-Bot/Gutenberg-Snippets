package com.golocalinteractive.gutenberg.snippets;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class GutenbergTemplateProvider extends TemplateContextType {
    protected GutenbergTemplateProvider() {
        super("REACT", "React");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        String fileName = templateActionContext.getFile().getName();
        return fileName.endsWith(".js") || fileName.endsWith(".jsx") || fileName.endsWith(".ts") || fileName.endsWith(".tsx") || fileName.endsWith(".json");
    }
}
