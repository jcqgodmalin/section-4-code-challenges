package coding.exercise;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
	}

	public static boolean isCatPlaying(boolean summer, int temperature) {
		if(summer) {
			if((temperature >= 25) && (temperature <= 45)) {
				return true;
			}
		}else {
			if((temperature >= 25) && (temperature <= 35)) {
				return true;
			}
		}
		return false;
	}
}
