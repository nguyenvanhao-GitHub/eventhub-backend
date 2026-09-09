package com.eventhub.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "ticket_types")
public class TicketType extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id", nullable = false)
    Event event;

    @Column(nullable = false, length = 100)
    String name;

    @Column(length = 255)
    String description;

    @Column(nullable = false, precision = 12, scale = 2)
    BigDecimal price;

    @Column(name = "total_quantity", nullable = false)
    Integer totalQuantity;

    @Column(name = "available_quantity", nullable = false)
    Integer availableQuantity;
}
