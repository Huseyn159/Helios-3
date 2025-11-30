package MentorLessons_3_3;

public enum CardType {

    DEBIT(50,"Debit Card"),
    CREDIT(70,"Credit Card"),
    VIRTUAL(90,"Virtual Card"),
    PREMIUM(150,"PREMIUM Card");

    final int fee;
    final String description;

    CardType(int fee, String description) {
        this.fee = fee;
        this.description = description;
    }

    public CardType printCardInfo(CardType type) {

            switch (type) {
                case DEBIT -> {
                    System.out.println(DEBIT.description);
                    System.out.println("Fee: " + DEBIT.fee);
                    return DEBIT;
                }
                case CREDIT -> {
                    System.out.println(CREDIT.description);
                    System.out.println("Fee: " + CREDIT.fee);
                    return CREDIT;
                }
                case VIRTUAL -> {
                    System.out.println(VIRTUAL.description);
                    System.out.println("Fee: " + VIRTUAL.fee);
                    return VIRTUAL;
                }
                case PREMIUM -> {
                    System.out.println(PREMIUM.description);
                    System.out.println("Fee: " + PREMIUM.fee);
                    return PREMIUM;
                }
                default -> {
                    System.out.println("Unknown card type");
                    return null;
                }
            }

    }

//      public String printCardInfo() {
//           return this.description + " (Fee: " + this.fee + ")";
//       }

    }

