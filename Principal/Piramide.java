package Principal;

public class Piramide {
	private float AreaBase;
	private float AreaLado;
	private float Altura;
	
	//Construção
	public Piramide() {
		this.AreaBase = AreaBase;
		this.AreaLado = AreaLado;
		this.Altura = Altura;
	}

	public float getAreaBase() {
		return AreaBase;
	}

	public void setAreaBase(float areaBase) {
		AreaBase = areaBase;
	}

	public float getAreaLado() {
		return AreaLado;
	}

	public void setAreaLado(float areaLado) {
		AreaLado = areaLado;
	}

	public float getAltura() {
		return Altura;
	}

	public void setAltura(float altura) {
		Altura = altura;
	}
	public float getVolume(float AreaBase, float Altura) {
		float Volume;
		Volume = (AreaBase*Altura)/3;
		return Volume;
	}
	public float getArea(float AreaBase, float AreaLado) {
		float Area;
		Area = AreaBase + AreaLado;
		return Area;
	}

}
