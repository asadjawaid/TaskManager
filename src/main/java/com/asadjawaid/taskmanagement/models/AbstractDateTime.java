package com.asadjawaid.taskmanagement.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/*
* This abstract class can be used by any entities, if they require a timestamp for when they
* are created or updated.
* */
@Data
@MappedSuperclass
public abstract class AbstractDateTime {
    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
