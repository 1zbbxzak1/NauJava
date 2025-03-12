package org.example.fourth.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record IpAddress(@JsonProperty("origin") String origin) {
}
