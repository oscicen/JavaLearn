public class PharseOMatic {
	
	public static void main(String[] args) {
		
		String[] wordListOne = {"24/7", "multi-Tire", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
		String[] wordListTwo = {"empowered", "sticky", "value-added", "orientated", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "levereged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core-competency", "strategy", "mindshare", "portal", "space", "space", "vision", "paradigm", "mission"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String pharse = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("What we need is a " + pharse + ".");
		
	}
	
}