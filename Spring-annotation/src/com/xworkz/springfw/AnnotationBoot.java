package com.xworkz.springfw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springfw.annotation.beans.AppuMoviesBean;
import com.xworkz.springfw.annotation.beans.CandyBean;
import com.xworkz.springfw.annotation.beans.CapacitorBean;
import com.xworkz.springfw.annotation.beans.HeadphoneBean;
import com.xworkz.springfw.annotation.beans.MotorBean;
import com.xworkz.springfw.annotation.beans.MovieBean;
import com.xworkz.springfw.annotation.beans.SongBean;
import com.xworkz.springfw.annotation.beans.WaterBottleBean;

public class AnnotationBoot {

	public static void main(String[] args) {

		String str="resources/springannotation.xml";
     	ApplicationContext contanier=new ClassPathXmlApplicationContext(str);
     	System.err.println("*****************SongBean****************************");

     	SongBean bean = contanier.getBean(SongBean.class);
     	System.out.println(bean);
     	
     	System.err.println("*****************CandyBean****************************");
        CandyBean bean1 =contanier.getBean(CandyBean.class);
        System.out.println(bean1);
        
     	System.err.println("*****************CapacitorBean****************************");
        CapacitorBean bean2= contanier.getBean(CapacitorBean.class);
        System.out.println(bean2);
        
     	System.err.println("*****************MotorBean****************************");
        MotorBean bean3= contanier.getBean(MotorBean.class);
        System.out.println(bean3);
     	
     	System.err.println("****************HeadphoneBean**************************");
        HeadphoneBean bean4 = contanier.getBean(HeadphoneBean.class);
        System.out.println(bean4);
        
        System.err.println("****************MovieBean**************************");
        MovieBean bean5 = contanier.getBean(MovieBean.class);
        System.out.println(bean5);
        
        System.err.println("****************WaterBottleBean**************************");
        WaterBottleBean bean6 = contanier.getBean(WaterBottleBean.class);
        System.out.println(bean6);
     
        
        System.err.println("****************AppuMoviesBean**************************");
        AppuMoviesBean bean7 = contanier.getBean(AppuMoviesBean.class);
        System.out.println(bean7);
        
	}

}
