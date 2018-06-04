package org.sonny;

import org.sonny.form.ComplexForm;
import org.sonny.form.ConstructForm;
import org.sonny.form.HelloForm;
import org.sonny.form.OutBean;
import org.sonny.utils.CommonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings("resource")
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    // set di
    HelloForm helloForm = context.getBean(HelloForm.class);
    CommonUtil.output(helloForm);
    // construct di
    ConstructForm constructForm = context.getBean(ConstructForm.class);
    CommonUtil.output(constructForm);
    // inner bean
    OutBean out = context.getBean(OutBean.class);
    CommonUtil.output(out);
    // complex form di
    ComplexForm complexForm = context.getBean(ComplexForm.class);
    CommonUtil.output(complexForm);
  }


}
