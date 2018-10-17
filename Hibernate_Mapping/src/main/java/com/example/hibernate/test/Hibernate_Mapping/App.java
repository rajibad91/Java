package com.example.hibernate.test.Hibernate_Mapping;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.example.hibernate.data.Accounts;
import com.example.hibernate.data.Author;
import com.example.hibernate.data.Book;
import com.example.hibernate.data.Employee;
import com.example.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Employee emp1=new Employee( "EmployeeName444", "Employee444@company.com");
        Employee emp2=new Employee( "EmployeeName555", "Employee555@company.com");
        Employee emp3=new Employee( "EmployeeName666", "Employee666@company.com");
        
        
        Accounts acc1Emp1=new Accounts( "AccountNumber411");
        Accounts acc2Emp1=new Accounts( "AccountNumber422");
        Accounts acc1Emp2=new Accounts( "AccountNumber511");
        Accounts acc2Emp2=new Accounts( "AccountNumber522");
        Accounts acc1Emp3=new Accounts( "AccountNumber611");
        Accounts acc2Emp3=new Accounts( "AccountNumber622");
        
        Set<Accounts> firstEmployeeAccounts=new HashSet<Accounts>();
        	firstEmployeeAccounts.add(acc1Emp1);
        	firstEmployeeAccounts.add(acc2Emp1);
        	
        	Set<Accounts> secondEmployeeAccounts=new HashSet<Accounts>();
        	secondEmployeeAccounts.add(acc1Emp2);
        	secondEmployeeAccounts.add(acc2Emp2);
        	
        	Set<Accounts> thirdEmployeeAccounts=new HashSet<Accounts>();
        	thirdEmployeeAccounts.add(acc1Emp3);
        	thirdEmployeeAccounts.add(acc2Emp3);
        
        emp1.setAccounts(firstEmployeeAccounts);
        emp2.setAccounts(secondEmployeeAccounts);
        emp3.setAccounts(thirdEmployeeAccounts);
        
        session.save(emp1);
        session.save(emp2);
        session.save(emp3);
//        
//        
       session.getTransaction().commit();
        
        System.out.println("Transaction completed");
        
        Employee employee1=(Employee)session.load(Employee.class,2);
        System.out.println(employee1.getEmpName()+", Your Account nos are: ");
        Set<Accounts> set=employee1.getAccounts();
        set.forEach(item->System.out.println(item.getAccountNo()));
        
        
        System.out.println("Many To One ");
        
        Accounts accounts=(Accounts)session.load(Accounts.class,1);
        System.out.println(accounts.getAccountNo());
        System.out.println(accounts.getEmployee().getEmpName());
        
        System.out.println("Second account ");
        accounts=(Accounts)session.load(Accounts.class,2);
        System.out.println(accounts.getAccountNo());
        System.out.println(accounts.getEmployee().getEmpName());
        
//        Book b1=new Book();
//        b1.setBookName("Hibernate is Easy");
//        Author a1=new Author();
//        a1.setAuthorName("Author Name one");
//        b1.setAuthor(a1);
//        
//      Integer bookId=(Integer) session.save(b1);
//      session.getTransaction().commit();
//        
//        Book book=(Book) session.get(Book.class, bookId);
//        System.out.println("Book Name is: "+book.getBookName());
//        System.out.println("Book ID is: "+book.getBookId());
//        System.out.println("Author Name is: "+book.getAuthor().getAuthorName());
//        System.out.println("Author ID is: "+book.getAuthor().getAuthorId());
    }
}
