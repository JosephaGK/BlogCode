package template.hooktemplate;

import template.nohooktemplate.AbstractHouseTemplate;

public class HouseTwo extends AbstractHouseHookTemplate {

	public HouseTwo(String name) {
		super(name);
	}

	@Override protected void buildDoor() {
		System.out.println(this.name+"=====buildDoor");
	}

	@Override protected void buildWindow() {
		System.out.println(this.name+"=====buildWindow");
	}

	@Override protected void buildWall() {
		System.out.println(this.name+"=====buildWall");
	}

	@Override protected void buildBase() {
		System.out.println(this.name+"=====buildBase");
	}
}
