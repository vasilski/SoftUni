package A17Generics.E04ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtilities {

    public static <T extends Comparable<T>> T getMax(List<T> elements) {
        ensureNonEmpty(elements.isEmpty());
        return Collections.max(elements);
    }

    public static <T extends Comparable<T>> T getMin(List<T> elements) {
        ensureNonEmpty(elements.isEmpty());
        return Collections.min(elements);
    }

    private static <T extends Comparable<T>> void ensureNonEmpty(boolean elements) {
        if (elements) {
            throw new IllegalStateException();
        }
    }
}
