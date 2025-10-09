package io.github.rosemoe.sora.langs.ehsanlang.server;

import io.github.rosemoe.sora.data.CompletionItem;
import io.github.rosemoe.sora.interfaces.AutoCompleteProvider;
import io.github.rosemoe.sora.langs.ehsanlang.ImportList;
import io.github.rosemoe.sora.text.TextAnalyzeResult;

import java.util.ArrayList;
import java.util.List;

public class ehsanAuto implements AutoCompleteProvider {
    List<CompletionItem> item;

    private CompletionItem PhpAsCompletion(String php, String desc) {
        final CompletionItem item = new CompletionItem(php + "  ", desc);
        item.cursorOffset(item.commit.length() - 2);
        return item;
    }

    private CompletionItem CodeSampel(String em, String desc, String codeS) {
        final var open = codeS;
        final CompletionItem item = new CompletionItem(em, desc);
        item.commit = open;
        item.cursorOffset(item.commit.length() - open.length() + 2);
        return item;
    }

    @Override
    public List<CompletionItem> getAutoCompleteItems(
            String prefix, TextAnalyzeResult analyzeResult, int line, int column) {
        item = new ArrayList<>();
        for (var ab : ServerHot.keys) {
            if (ab.startsWith(prefix)) {
                item.add(PhpAsCompletion(ab, "ehsan keywords"));
            }
        }
        for (var itemImport : ServerHot.imports) {
            if (itemImport.startsWith(prefix)) {
                item.add(PhpAsCompletion(itemImport, "ehsan Imports"));
            }
        }
        for (var ass : ServerHot.as) {
            if (ass.startsWith(prefix)) {
                item.add(PhpAsCompletion(ass, "As Keydocment"));
            }
        }
        for (var in : ImportList.getImports()) {
            if (in.startsWith(prefix)) {
                item.add(PhpAsCompletion(in, "ehsanKey"));
            }
        }

        return item;
    }
}
