package Principal;

public class Cone {
	private float Geratriz;
	private float raio;
	private float altura;
	
	//Constução
	public Cone() {
		this.Geratriz = Geratriz;
		this.raio = raio;
		this.altura = altura;
	}

	public float getGeratriz() {
		return Geratriz;
	}

	public void setGeratriz(float geratriz) {
		Geratriz = geratriz;
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
	public float getArea(float Geratriz, float raio, float altura) {
		float Area;
		Area = (float) ((Math.PI)*raio*(raio+Geratriz));
		return Area;
	}
	public float getVolume(float raio, float altura) {
		float Volume;
		Volume = (float) ((Math.PI)*Math.pow(raio, 2)*(altura)/3);
		return Volume;
	}

}
