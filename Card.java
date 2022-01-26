package com.spring.mapping.relation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="id_card")
public class Card {
	@Id
	private int id;
	private String desc;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(int id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}
}
