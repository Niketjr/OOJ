import java.util.*;
class Book{
	String  name, author;
	int num_pages,price;
	Book(String name,String author,int num_pages,int price){
		this.name = name;
		this.author = author;
		this.num_pages = num_pages;
		this.price = price;
	}
	public String toString(){
		String name, author, price, num_pages;
		name = "Book name: " + this.name ;
		author = "\n Author name: " + this.author;
		price = "\n Price: " + this.price ;
		num_pages = "\n Number of pages: " + this.num_pages ;
		return name + author + price + num_pages;
	}
}
class Main{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n,pages,cost;
		String names,authors;
		System.out.println("Enter the number of students:");
		n = s.nextInt();
		System.out.println("Enter the details:");
		Book B[];
		B = new Book[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the number of pages:");
			pages = s.nextInt();
			System.out.println("Enter the price:");
			cost = s.nextInt();
			System.out.println("Enter the name:");
			names = s.next();
			System.out.println("Enter the author:");
			authors = s.next();
			B[i] = new Book(names, authors, pages,cost);
		}
		for(int j= 0;j<n;j++){
			System.out.println(B[j].toString());
		}
	}
}

			
	
		
