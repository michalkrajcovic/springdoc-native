package com.example.springdocnative.web.model;

import java.util.Objects;

public class ErrorResponse {
    private final String details;

    public ErrorResponse(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorResponse that = (ErrorResponse) o;
        return details.equals(that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(details);
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "details='" + details + '\'' +
                '}';
    }
}
