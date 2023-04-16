/**Case Study: Library Management System

A library management system is a software solution that enables librarians to manage and maintain their libraries efficiently. This system can handle all the books and information related to the library. A library management system will help librarians to keep track of book lending, book return, stock management, and generate reports.

**/

//Interfaces:
//1. Book Interface:

interface Book {
    String getTitle();

    void setTitle(String title);

    String getAuthor();

    void setAuthor(String author);

    String getISBN();

    void setISBN(String ISBN);

    int getYear();

    void setYear(int year);
}


//2. Member Interface:

interface Member {
    String getName();

    void setName(String name);

    String getAddress();

    void setAddress(String address);

    String getEmail();

    void setEmail(String email);

    int getPhone();

    void setPhone(int phone);
}


//3. Library Interface:


interface Library {
    List<Book> getAllBooks();

    List<Book> searchBooks(String title);

    void addBook(Book book);

    void removeBook(Book book);

    void lendBook(Book book, Member member);

    void returnBook(Book book, Member member);

    List<Member> getAllMembers();

    void addMember(Member member);

    void removeMember(Member member);

    List<Issue> getAllIssues();
}


//Error Handling:
//1. Book Exception:

class BookException extends Exception {
    public BookException(String message) {
        super(message);
    }
}

//2. Member Exception:


class MemberException extends Exception {
    public MemberException(String message) {
        super(message);
    }
}


//3. Library Exception:

class LibraryException extends Exception {
    public LibraryException(String message) {
        super(message);
    }
}

public Main{
	public static void main(String[] args){
		
		Member obj1 = new MemberException();
		
		Book obj2 = new BookException();
		
		Library obj3 = new LibraryException();
		
		
		}
	}
	