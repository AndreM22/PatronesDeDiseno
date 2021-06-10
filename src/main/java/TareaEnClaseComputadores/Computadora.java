package TareaEnClaseComputadores;

public class Computadora {

	private String[] programasAbiertos = new String[20];
	private int memoriaRam;
	private int ConsumoCPU;
	private IStateComputadora state;

	public IStateComputadora getState() {
		return state;
	}

	public void setState(IStateComputadora state) {
		this.state = state;
	}

	public void request() {
		this.state.handler(this);
	}

	public String[] getProgramasAbiertos() {
		return programasAbiertos;
	}

	public void setProgramasAbiertos(String[] programasAbiertos) {
		this.programasAbiertos = programasAbiertos;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int getConsumoCPU() {
		return ConsumoCPU;
	}

	public void setConsumoCPU(int consumoCPU) {
		ConsumoCPU = consumoCPU;
	}

	
}
