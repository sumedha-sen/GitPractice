package com.tyss.projmap.bean;

import java.io.Serializable;


import javax.persistence.*;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="item_info")

public class Item implements Serializable {
	
    @Id
    @Column
	private int itemid;
    
    @Column
	private String itemname;
    
    @Exclude
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cid")
    private Cart cart;
	
	
	
	}


	
	



