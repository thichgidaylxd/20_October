package com.example.demo;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "thangmuoi")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
    public class entity {
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        Integer id;

        String noiDung;
        String tenNguoiGui;
        String tenNguoiNhan;
    }
