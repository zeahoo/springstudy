package org.sonny;

import org.sonny.form.ComplexForm;
import org.sonny.form.ConstructForm;
import org.sonny.form.HelloForm;
import org.sonny.form.OutBean;
import org.sonny.form.StrongTypeForm;
import org.sonny.utils.CommonUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SuppressWarnings("resource")
public class Application {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    // set di
    CommonUtil.output(context.getBean(HelloForm.class));
    // construct di
    CommonUtil.output(context.getBean(ConstructForm.class));
    // inner bean
    CommonUtil.output(context.getBean(OutBean.class));
    // complex form di
    CommonUtil.output(context.getBean(ComplexForm.class));
    // strong type, empty, null form
    CommonUtil.output(context.getBean(StrongTypeForm.class));

  }


}
