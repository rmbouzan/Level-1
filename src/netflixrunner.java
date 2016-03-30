
public class netflixrunner {
	public static void main(String[] args) {

		// 1. Instantiate some Movie objects (at least 5).
		Movie HI = new Movie("HI", 2);
		Movie A = new Movie("A", 1);
		Movie B = new Movie("B", 3);
		Movie Twilight = new Movie("Twilight", 5);
		Movie D = new Movie("D", 4);
		// 2. Use the Movie class to get the ticket price of one of your movies.
		HI.getTicketPrice();
		A.getTicketPrice();
		B.getTicketPrice();
		String Price1 = Twilight.getTicketPrice();
		D.getTicketPrice();
		// 3. Instantiate a NetflixQueue
		NetflixQueue A1 = new NetflixQueue();
		// 4. Add your movies to the Netflix queue.
		A1.addMovie(HI);
		A1.addMovie(A);
		A1.addMovie(Twilight);
		A1.addMovie(B);
		A1.addMovie(D);
		// 5. Print all the movies in your queue.
		A1.printMovies();
		// 6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		Movie best = A1.getBestMovie();
		best.getTitle();
		System.out.print(best.getTitle());
		// 7. Use your NetflixQueue to finish the sentence "the second best movie is...."

	}
}
