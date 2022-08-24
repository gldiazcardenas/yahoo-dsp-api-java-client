package io.github.gldiazcardenas.yahoodsp.client;

import java.time.Duration;
import java.util.Objects;

final class Preconditions {

    private Preconditions() {
        super();
    }

    public static <T> T requireNonNull(T object) {
        return Objects.requireNonNull(object);
    }

    public static int requireGreaterThanZero(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("number must be greater than zero");
        }
        return number;
    }

    public static int requirePositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be positive");
        }
        return number;
    }

    public static Duration requirePositive(Duration duration) {
        requireNonNull(duration);
        if (duration.isNegative()) {
            throw new IllegalArgumentException("duration must be positive");
        }
        return duration;
    }

    public static Duration requirePositiveLowerThan(Duration duration, Duration maximum) {
        requirePositive(duration);
        requireNonNull(maximum);
        if (duration.compareTo(maximum) > 0) {
            throw new IllegalArgumentException("duration must be lower than the maximum");
        }
        return duration;
    }

    public static String requireNotEmpty(String value) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException("string must not be empty");
        }
        return value;
    }

}
