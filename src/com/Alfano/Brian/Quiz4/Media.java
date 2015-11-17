package com.Alfano.Brian.Quiz4;



import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
abstract class Media implements Comparable<Media>
{
	protected String title;
    protected int sortKey;
    @Id
	public String getTitle()  { return title; }
	public int getSortKey() { return sortKey; }
	
	public abstract int compareTo(Media m);
}
