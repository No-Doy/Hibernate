package com.Alfano.Brian.Quiz4;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "alfano_Book")
class Book extends Media
{	
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
        this.sortKey = 100;
    }
    
	public String getAuthor() { return author; }
    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	} 
    
    public int compareTo(Media obj){
    	int result = 0;
    	
    	if(obj instanceof Book){
    		Book b = (Book)obj;
    		result = this.getTitle().compareTo(b.getTitle());
    	}else{
    		return this.getSortKey() - (obj.getSortKey()); 
    	}	
    return result;
    }
}