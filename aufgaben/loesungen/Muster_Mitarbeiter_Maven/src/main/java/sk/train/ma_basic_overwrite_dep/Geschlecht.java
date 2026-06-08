package sk.train.ma_basic_overwrite_dep;

public enum Geschlecht { 
	W, M, D;

	@Override
	public String toString() {
		
		switch ( this ) {

	      case W : return "weiblich";

	      case M : return "männlich";

	      default: return "divers";

	    }
	}
	
}
