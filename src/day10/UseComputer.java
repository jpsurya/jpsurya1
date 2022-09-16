package day10;

public class UseComputer {
	public static void main(String[] args) {
		Cpu cpu1 = new Cpu();
		cpu1.brand = "hcl";
		cpu1.ram = 8;
		Cpu cpu2 = new Cpu();
		cpu2.brand = "zebronics";
		cpu2.ram = 16;
		Computer comp = new Computer();
		comp.brand = "hcl";
		comp.moniterType = "led";
		comp.isWindows = true;
		comp.cpu = cpu1;
		Computer comp1 = new Computer();
		comp1.brand = "hp";
		comp1.moniterType = "normal";
		comp1.isWindows = false;
		comp1.cpu = cpu1;
		Computer comp2 = new Computer();
		comp2.brand = "dell";
		comp2.moniterType = "normal";
		comp2.isWindows = false;
		comp2.cpu = cpu2;
		System.out.println(comp.brand + " " + comp.moniterType + " " + comp.isWindows + " " + comp.cpu.brand + " "
				+ comp.cpu.ram + " " + comp1.brand + " " + comp1.moniterType + " " + comp1.isWindows + " "
				+ comp1.cpu.brand + " " + comp1.cpu.ram);
		Computer[] comps = { comp, comp1, comp2 };
		for (int i = 0; i < comps.length; i++) {
			System.out.println(comps[i].brand + " " + comps[i].moniterType + " " + comps[i].isWindows + " "
					+ comps[i].cpu.brand + " " + comps[i].cpu.ram);
		}
	}
}
