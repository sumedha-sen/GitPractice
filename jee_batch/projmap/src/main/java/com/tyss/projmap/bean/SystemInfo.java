package com.tyss.projmap.bean;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="system_info")

public class SystemInfo implements Serializable {
	
    @Id
    @Column
	private int sid;
    
    @Column
	private String sname;
    
    
    @Exclude
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="eid")
    private Employee employee;
	
	
	

}

