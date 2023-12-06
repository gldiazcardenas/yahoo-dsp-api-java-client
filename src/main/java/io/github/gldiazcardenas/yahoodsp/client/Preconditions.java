package io.github.gldiazcardenas.yahoodsp.client;

import io.github.gldiazcardenas.yahoodsp.client.model.Authentication;

import java.time.Duration;
import java.util.Collection;
import java.util.Objects;

final class Preconditions {

    private Preconditions() {
        super();
    }

    static <T> T requireNonNull(T object) {
        return Objects.requireNonNull(object);
    }

    static <T> T requireOneNonNull(String message, T... object) {
        if (object != null) {
            for (T t : object) {
                if (t != null) {
                    return t;
                }
            }
        }
        throw new IllegalArgumentException(message);
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

    static Duration requirePositiveLowerThan(Duration duration, Duration maximum) {
        requirePositive(duration);
        requireNonNull(maximum);
        if (duration.compareTo(maximum) > 0) {
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

    static <T extends Collection<?>> T requireNotEmpty(T collection) {
        requireNonNull(collection);
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("collection must not be empty");
        }
        return collection;
    }

    static String accessToken(Authentication auth) {
        return auth == null ? null : auth.getAccessToken();
    }

}
