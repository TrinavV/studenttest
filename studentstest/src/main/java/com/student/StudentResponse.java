package com.student;

import io.micronaut.serde.annotation.Serdeable;
@Serdeable
public record StudentResponse(int id,
                              String name,
                              int grade,
                              String section,
                              String address,
                              int telephone) {
}
