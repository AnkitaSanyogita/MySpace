package com.myspace.bookdemo;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Author implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "AUTHOR_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "AUTHOR_ID_SEQ", name = "AUTHOR_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String aName;

	@javax.persistence.ManyToMany(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL}, mappedBy = "authorName")
	// @javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER,
	// cascade = {javax.persistence.CascadeType.ALL})
	private java.util.Collection<com.myspace.bookdemo.Book> bName;

	public Author() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getaName() {
		return this.aName;
	}

	public void setaName(java.lang.String aName) {
		this.aName = aName;
	}

	public java.util.Collection<com.myspace.bookdemo.Book> getbName() {
		return this.bName;
	}

	public void setbName(java.util.Collection<com.myspace.bookdemo.Book> param) {
		this.bName = param;
	}

	public Author(java.lang.Long id, java.lang.String aName,
			java.util.Collection<com.myspace.bookdemo.Book> bName) {
		this.id = id;
		this.aName = aName;
		this.bName = bName;
	}

}