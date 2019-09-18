package package1;

public class Book {
	
	String title;
	String author;

		public static void main(String args[]) {
		Book [] myBook = new Book[3];
		
		myBook[0] = new Book();
		myBook[1] = new Book();
		myBook[2] = new Book();
		
		int x = 0;
		
		myBook[0].title = "text1";
		myBook[1].title = "text2";
		myBook[2].title = "text3";
		myBook[0].author = "author1";
		myBook[1].author = "author2";
		myBook[2].author = "author3";
		
		while(x<3) {
			System.out.print(myBook[x].title);
			System.out.print("By");
			System.out.println(myBook[x].author);
			x=x+1;
		}
	}
		
	}


