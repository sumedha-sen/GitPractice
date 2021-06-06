package com.tyss.projmap.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="cart")

public class Cart implements Serializable {
	
    @Id
    @Column
	private int cid;
    
    @Column
	private String cname;
    
    @Exclude
    @OneToMany(cascade=CascadeType.ALL,mappedBy="cart"    )
    private List<Item> items;
	
	
	
	}


	
	


