package com.sp.javacofig.ByUsingConstorDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.beans.Student;
import com.sp.config.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student stud = ctx.getBean(Student.class);
		stud.display();
    }
}
