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

		String str="resources\\spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);

		System.err.println("*****************Train has-a Engine using Const*********************");
		TrainBean train = context.getBean(TrainBean.class);
		System.out.println(train);
		train.ticketIssue();
		
		System.err.println("*****************Bottle has-a Cap  using Const**********************");
		BottleBean bottle = context.getBean(BottleBean.class);
		System.out.println(bottle);

		System.err.println("*****************System has-a Power  using Const********************");
		SystemBean system = context.getBean(SystemBean.class);
		System.out.println(system);

		System.err.println("*****************TV has-a Stand  using Const************************");
		System.out.println(context.getBean(TvBean.class));

		System.err.println("*****************Apartment has-a Lift  using Const******************");
		System.out.println(context.getBean(ApartmentBean.class));

		System.err.println("*****************Shirt has-a Button  using Const*******************");
		System.out.println(context.getBean(ShirtBean.class));

		System.err.println("*****************Browser has-a Parser  using Const*****************");
		System.out.println(context.getBean(BrowserBean.class));

		System.err.println("*****************River has-a Fish  using Const*********************");
		System.out.println(context.getBean(RiverBean.class));

		System.err.println("*****************Body has-a Blood using setter*********************");
		System.out.println(context.getBean(BodyBean.class));

		System.err.println("*****************Frame has-a Photo using setter********************");
		System.out.println(context.getBean(FrameBean.class));

		System.err.println("*****************Man has-a Slipper using setter*******************");
		System.out.println(context.getBean(ManBean.class));

		System.err.println("*****************SolarSystemBean has-a PlanetsBean using setter*****************");
		System.out.println(context.getBean(SolarSystemBean.class));

		System.err.println("*****************Diamond has-a Carbon using setter*****************");
		System.out.println(context.getBean(DiamondBean.class));

		System.err.println("*****************Fish has-a Tail using setter**********************");
		System.out.println(context.getBean(FishesBean.class));

		System.err.println("*****************PCB has-a Component using setter******************");
		System.out.println(context.getBean(PCBBean.class));

		System.err.println("*****************CPU has-a MotherBoard using setter*****************");
		System.out.println(context.getBean(CPUBean.class));

		System.err.println("*****************Package has-a Class using setter*******************");
		System.out.println(context.getBean(PackageBean.class));
	}

}
