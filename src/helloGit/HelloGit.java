package helloGit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("HelloXml.xml");
		HelloSpring helloSpring = (HelloSpring) context.getBean("hellospring");
		helloSpring.print();
	}

}

/*class HelloSpring{
	
	int x= 0;
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void print(){
		System.out.println(" Hello Spring x = " +x);
	}
	
}*/
