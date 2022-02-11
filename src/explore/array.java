package explore;

public class array {
	
	// A simple definition for a DVD.
	public class DVD{
		public String name;
		public int releaseYear;
		public String director;
		
		public DVD(String name,int releaseYear,String director) {
			this.name = name;
			this.releaseYear = releaseYear;
			this.director = director;
		}
		
		public String toString() {
			return this.name + ",directed by" + this.director + "released in" + this.releaseYear;
		}
	}
	//public static void main(String[] args) {
		// The actual code for creating an Array to hold DVD's.
		DVD[] dvdCollection = new DVD[15];
	
		DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
		DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
		DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
		//DVD avengersDVD = new DVD("The Avengers",2012,"Josh Whedon");
		DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
		
		dvdCollection[7] = avengersDVD;
		
		// Put "The Incredibles" into the 4th place: index 3.
		dvdCollection[3] = incrediblesDVD;
		
		// Put "Finding Dory" into the 10th place: index 9.
		dvdCollection[9] = findingDoryDVD;
		
		// Put "The Lion King" into the 3rd place: index 2.
		dvdCollection[2] = lionKingDVD;
	
	}
}