package com.wmsoftware.cefetsis.model;

import com.wmsoftware.cefetsis.model.State;
import java.util.UUID;
import jakarta.persistence.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_city")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "state_id", nullable = false )
	private State state;
}
