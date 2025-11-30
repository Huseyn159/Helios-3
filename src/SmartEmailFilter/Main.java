package SmartEmailFilter;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Email> emails = List.of(
                new Email("Faktura №123 ödəniş gecikir", false),
                new Email("Görüş sabahdır", false),
                new Email("Qazandınız!!!", true),
                new Email("Faktura maaş ödənişi", false)
        );

        Predicate<Email> filter =
                e -> !e.isSpam() && e.getContent().contains("Faktura");

        Consumer<Email> action =
                e -> System.out.println("Mühasibatlığa göndərildi: " + e.getContent());

        EmailHandler handler = new EmailHandler();
        handler.processEmails(emails, filter, action);
    }
}