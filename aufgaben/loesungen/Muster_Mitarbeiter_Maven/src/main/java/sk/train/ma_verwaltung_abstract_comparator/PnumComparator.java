package sk.train.ma_verwaltung_abstract_comparator;

import java.util.Comparator;

public class PnumComparator implements Comparator<Mitarbeiter>{

	@Override
	public int compare(Mitarbeiter o1, Mitarbeiter o2) {
		String s = o1.getPersnr().substring(2); 
		int i = Integer.parseInt(s);
		s = o2.getPersnr().substring(2); 
		int j = Integer.parseInt(s);
		return i-j;
	}

}
