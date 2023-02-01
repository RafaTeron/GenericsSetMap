package entities;

import java.util.Objects;

public class Portal {
	
	private Integer ID;

	public Portal(Integer iD) {
		ID = iD;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Portal other = (Portal) obj;
		return Objects.equals(ID, other.ID);
	}

}
