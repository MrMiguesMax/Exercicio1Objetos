package Principal;

public class Quadrado {
	private float MedidaLado;
	
	//Contrução
	public Quadrado() {
		this.MedidaLado = MedidaLado;
		
	}

	public float getMedidaLado() {
		return MedidaLado;
	}

	public void setMedidaLado(float medidaLado) {
		MedidaLado = medidaLado;
	}
	public float getArea(float MedidaLado) {
		float Area;
		Area = MedidaLado*MedidaLado;
		return Area;
	}
	public float getPerimetro(float MedidaLado) {
		float perimetro;
		perimetro = MedidaLado*4;
		return perimetro;
	}

}
