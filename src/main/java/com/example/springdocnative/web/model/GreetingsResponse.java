package com.example.springdocnative.web.model;

import java.util.Objects;

public class GreetingsResponse {
    private final String greetings;

    public GreetingsResponse(String greetings) {
        this.greetings = greetings;
    }

    public String getGreetings() {
        return greetings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GreetingsResponse that = (GreetingsResponse) o;
        return greetings.equals(that.greetings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(greetings);
    }

    @Override
    public String toString() {
        return "GreetingsRequest{" +
                "greetings='" + greetings + '\'' +
                '}';
    }
}
