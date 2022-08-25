package io.github.gldiazcardenas.yahoodsp.client;

import java.time.Duration;
import java.util.Objects;

final class Preconditions {

    private Preconditions() {
        super();
    }

    static <T> T requireNonNull(T object) {
        return Objects.requireNonNull(object);
    }

    static int requireGreaterThanZero(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("number must be greater than zero");
        }
        return number;
    }

    static int requirePositive(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be positive");
        }
        return number;
    }

    static Duration requirePositive(Duration duration) {
        requireNonNull(duration);
        if (duration.isNegative()) {
            throw new IllegalArgumentException("duration must be positive");
        }
        return duration;
    }

    static Duration requirePositiveLowerThan(Duration duration, Duration max) {
        requirePositive(duration);
        requireNonNull(max);
        if (duration.compareTo(max) > 0) {
            throw new IllegalArgumentException("duration must be lower than the maximum");
        }
        return duration;
    }

    static String requireNotEmpty(String value) {
        requireNonNull(value);
        if (value.trim().isEmpty()) {
            throw new IllegalArgumentException("string must not be empty");
        }
        return value;
    }

}
