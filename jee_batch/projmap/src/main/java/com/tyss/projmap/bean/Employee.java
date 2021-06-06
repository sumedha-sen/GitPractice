package com.tyss.projmap.bean;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="employee_info")

public class Employee implements Serializable {
	
    @Id
    @Column
	private int eid;
    
    @Column
	private String ename;
    
    @Exclude
    @OneToOne(cascade=CascadeType.ALL,mappedBy="employee" )
    private SystemInfo systeminfo;
	
	
	
	}


	
	


