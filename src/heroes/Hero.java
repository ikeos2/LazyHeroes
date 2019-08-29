package heroes;

import java.util.Comparator;

public abstract class Hero implements IHero{
	private int speed;
	
	public static Comparator<Hero> SpeedComparator = new Comparator() {
		@Override
		public int compare(Object arg0, Object arg1) {

			if(arg0.getClass().getName() != "Hero" || arg1.getClass().getName() != "Hero") return 0;
			
			Hero hero1 = (Hero)arg0;
			Hero hero2 = (Hero)arg1;
			
			if(hero1.speed == hero2.speed) return 0;
			else if(hero1.speed > hero2.speed) return 1;
			else return -1;
		}
	};
}
