package com.wmsoftware.cefetsis.model;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String name;
	private String adress;
	
	@ManyToOne
	@JoinColumn(name = "city_id", nullable = false)
	private City city;
	private boolean active;
	private LocalDate birthday;
	
	@OneToMany
	@JoinColumn(name = "child_id",  nullable = true)
	private List<Child> children;
}
