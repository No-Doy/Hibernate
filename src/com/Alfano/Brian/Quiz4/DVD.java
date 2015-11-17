package com.Alfano.Brian.Quiz4;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table (name = "alfano_DVD")
class DVD extends Media
{	
	@Id
    private int year;
    public DVD(String title, int year)
    {	
        this.title = title;
        this.year = year;
        this.sortKey = 2;
    }
	public int getYear() 	 { return year; }
    public String toString()
    {
        return year + ": " + title + " [DVD]";
	}
    public int compareTo(Media obj){
    	int result = 0;
    	
    	if(obj instanceof DVD){
    		DVD d = (DVD)obj;
    		result = this.getTitle().compareTo(d.getTitle());
    		if(result == 0)
    			return this.year - d.year;
    	}else{
    		return this.getSortKey() - (obj.getSortKey());
    	}	
    return result;
    }
}
