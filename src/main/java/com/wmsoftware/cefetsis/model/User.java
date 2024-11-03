package com.wmsoftware.cefetsis.model;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String name;
	private String login;
	private String password;
	private boolean active;
	
	public void setId(UUID id) {
		this.id = id;
	}
}
