package SmartEmailFilter;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmailHandler {
    public void processEmails(List<Email> emails,
                              Predicate<Email> filter,
                              Consumer<Email> action) {
        for (Email email : emails) {
            if (filter.test(email)) {
                action.accept(email);
            }
        }
    }

}
