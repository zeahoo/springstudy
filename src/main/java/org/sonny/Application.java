package org.sonny;

import org.sonny.form.ConstructForm;
import org.sonny.form.HelloForm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    HelloForm form = context.getBean(HelloForm.class);
    System.out.println(form.getMessage());
    ConstructForm constructForm = context.getBean(ConstructForm.class);
    System.out.printf("%d -- %s\n", constructForm.getVersion(), constructForm.getName());
  }
}
