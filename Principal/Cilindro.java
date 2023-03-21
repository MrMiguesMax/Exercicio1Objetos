package Principal;

public class Cilindro {
	private float raio;
	private float altura;
	
	//Construção
	public Cilindro() {
		this.raio = raio;
		this.altura = altura;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getArea(float raio, float altura) {
		float area;
		area = (float) ((float) 2*Math.PI*raio*(raio+altura));
		return area;
	}
	public float getVolume(float raio, float altura) {
		float volume;
		volume = (float) ((float) (float) (Math.PI)*Math.pow(raio, 2)*altura);
		return volume;
	}


}
