package avenger;

class Avengers {
	public String name;
	public int age;
	public String power;
	public String weapon;
	public String planet;
	public char[] getdetails;
	public Avengers() {
		name="THOR";
		age=300;
		power="THUNDER";
		weapon="MjiOLNER";
		planet="ASGARD";
	}
		public void getdetails(String n,String p,String w,String pl) {
			name=n;
			power=p;
			weapon=w;
			planet=pl;
		}
		public void getdetails(int a) {
		     age=a;
		}
		public String putdetails1() {
			return name;
			return power;
			return weapon;
			return planet;
		  }
		public int putdetails() {
			return age;
		}
		}
class avg{
	public static void main(String[] args) {
		Avengers av = new Avengers();
		System.out.println(av.getdetails(n, p, w, pl);)
		System.out.println(av.getdetails(a);)
	}
}
