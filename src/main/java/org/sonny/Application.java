package org.sonny;

import org.sonny.form.ConstructForm;
import org.sonny.form.HelloForm;
import org.sonny.form.OutBean;
import org.sonny.form.PersonForm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings("resource")
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    // set di
    HelloForm form = context.getBean(HelloForm.class);
    System.out.println(form.getMessage());
    // construct di
    ConstructForm constructForm = context.getBean(ConstructForm.class);
    System.out.printf("%d -- %s\n", constructForm.getVersion(), constructForm.getName());
    // inner bean
    OutBean out = context.getBean(OutBean.class);
    PersonForm personForm = out.getTarget();
    System.out.printf("name: %s --- age: %d\n", personForm.getName(), personForm.getAge());
  }
}
