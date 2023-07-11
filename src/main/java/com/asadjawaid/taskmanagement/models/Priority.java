package com.asadjawaid.taskmanagement.models;

import com.asadjawaid.taskmanagement.util.Color;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Color color;

    @OneToMany(mappedBy = "priority")
    private Set<Task> tasks = new HashSet<>();
}
