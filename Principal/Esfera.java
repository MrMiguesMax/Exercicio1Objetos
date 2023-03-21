package Principal;

public class Esfera {
private float raio;
	
	//Construção
	public Esfera() {
		this.raio = raio;
	}

	public final float getRaio() {
		return raio;
	}

	public final void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getArea(float raio) {
		float Area;
		Area = (float) ((float) (4*Math.PI)*Math.pow(raio, 2));
		return Area;
	}
	
	public float getVolume(float raio) {
		float Volume;
		Volume = (float) ((float) (4/3)*(Math.PI)*Math.pow(raio, 3));
		return Volume;
	}

}