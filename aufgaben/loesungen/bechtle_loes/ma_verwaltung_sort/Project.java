package sk.train.ma_verwaltung_sort;

import java.time.LocalDate;

public class Project {
	
	private LocalDate startdatum;
	private int budget;
	private int id;
	
	public Project(LocalDate startdatum, int budget, int id) {
		super();
		this.startdatum = startdatum;
		this.budget = budget;
		this.id = id;
	}

	public LocalDate getStartdatum() {
		return startdatum;
	}

	public void setStartdatum(LocalDate startdatum) {
		this.startdatum = startdatum;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + budget;
		result = prime * result + id;
		result = prime * result + ((startdatum == null) ? 0 : startdatum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (budget != other.budget)
			return false;
		if (id != other.id)
			return false;
		if (startdatum == null) {
			if (other.startdatum != null)
				return false;
		} else if (!startdatum.equals(other.startdatum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Project [startdatum=" + startdatum + ", budget=" + budget + ", id=" + id + "]";
	}
	
	
	
	

}
