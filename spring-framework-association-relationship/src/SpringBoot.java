import java.awt.SystemColor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.fw.bean.apartmentlift.ApartmentBean;
import com.xworkz.spring.fw.bean.bodyblood.BodyBean;
import com.xworkz.spring.fw.bean.bottlecap.BottleBean;
import com.xworkz.spring.fw.bean.browserparser.BrowserBean;
import com.xworkz.spring.fw.bean.cpumotherboard.CPUBean;
import com.xworkz.spring.fw.bean.diamondcarbon.DiamondBean;
import com.xworkz.spring.fw.bean.fishtail.FishesBean;
import com.xworkz.spring.fw.bean.framephoto.FrameBean;
import com.xworkz.spring.fw.bean.manslipper.ManBean;
import com.xworkz.spring.fw.bean.packageclass.PackageBean;
import com.xworkz.spring.fw.bean.pcbcomponent.PCBBean;
import com.xworkz.spring.fw.bean.riverfish.RiverBean;
import com.xworkz.spring.fw.bean.shirtbutton.ShirtBean;
import com.xworkz.spring.fw.bean.solarsystemplanets.SolarSystemBean;
import com.xworkz.spring.fw.bean.systempower.SystemBean;
import com.xworkz.spring.fw.bean.trainengine.TrainBean;
import com.xworkz.spring.fw.bean.tvstand.TvBean;

public class SpringBoot {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources\\spring.xml");

		System.err.println("===================1] Train has-a Engine==================");
		TrainBean train = context.getBean(TrainBean.class);
		System.out.println(train);
		train.ticketIssue();
		
		System.err.println("===================2] Bottle has-a Cap==================");
		BottleBean bottle = context.getBean(BottleBean.class);
		System.out.println(bottle);

		System.err.println("===================3] System has-a Power==================");
		SystemBean system = context.getBean(SystemBean.class);
		System.out.println(system);

		System.err.println("===================4] TV has-a Stand==================");
		System.out.println(context.getBean(TvBean.class));

		System.err.println("===================5] Apartment has-a Lift==================");
		System.out.println(context.getBean(ApartmentBean.class));

		System.err.println("===================6] Shirt has-a Button==================");
		System.out.println(context.getBean(ShirtBean.class));

		System.err.println("===================7] Browser has-a Parser==================");
		System.out.println(context.getBean(BrowserBean.class));

		System.err.println("===================8] River has-a Fish==================");
		System.out.println(context.getBean(RiverBean.class));

		System.err.println("===================9] Body has-a Blood using setter==================");
		System.out.println(context.getBean(BodyBean.class));

		System.err.println("===================10] Frame has-a Photo using setter==================");
		System.out.println(context.getBean(FrameBean.class));

		System.err.println("===================11] Man has-a Slipper using setter==================");
		System.out.println(context.getBean(ManBean.class));

		System.err.println("===================12] SolarSystemBean has-a PlanetsBean using setter==================");
		System.out.println(context.getBean(SolarSystemBean.class));

		System.err.println("===================13] Diamond has-a Carbon using setter==================");
		System.out.println(context.getBean(DiamondBean.class));

		System.err.println("===================14] Fish has-a Tail using setter==================");
		System.out.println(context.getBean(FishesBean.class));

		System.err.println("===================15] PCB has-a Component using setter==================");
		System.out.println(context.getBean(PCBBean.class));

		System.err.println("===================16] CPU has-a MotherBoard using setter==================");
		System.out.println(context.getBean(CPUBean.class));

		System.err.println("===================17] Package has-a Class using setter==================");
		System.out.println(context.getBean(PackageBean.class));
	}

}
