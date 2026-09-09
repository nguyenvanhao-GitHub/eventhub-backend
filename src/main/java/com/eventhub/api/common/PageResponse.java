package com.eventhub.api.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Collections;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageResponse<T> {

    @Builder.Default
    int currentPage = 1;

    @Builder.Default
    int totalPages = 0;

    @Builder.Default
    int pageSize = 10;

    @Builder.Default
    long totalElements = 0;

    @Builder.Default
    List<T> data = Collections.emptyList();
}
