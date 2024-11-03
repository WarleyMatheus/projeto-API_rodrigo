package com.wmsoftware.cefetsis.model;

import java.time.LocalDate;
import java.util.UUID;
import jakarta.persistence.*;
import lombok.*;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_child")
public class Child {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String name;
	private LocalDate birthday;
	
}