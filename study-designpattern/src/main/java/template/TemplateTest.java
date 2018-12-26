package template;

import template.nohooktemplate.HouseOne;
import template.nohooktemplate.HouseTwo;

public class TemplateTest {
	public static void main(String[] arg){
		HouseOne houseOne = new HouseOne("平房");
		HouseTwo houseTwo = new HouseTwo("别墅");
		houseOne.buildHouse();
		houseTwo.buildHouse();

		template.hooktemplate.HouseOne hookHouseOne = new template.hooktemplate.HouseOne("钩子平房");
		template.hooktemplate.HouseTwo hookHouseTwo = new template.hooktemplate.HouseTwo("钩子别墅");
		hookHouseOne.buildHouse();
		hookHouseTwo.buildHouse();

	}
}
