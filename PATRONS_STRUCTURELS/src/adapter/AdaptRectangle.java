package adapter;

public class AdaptRectangle implements ICarre{
	Rectangle rect;
	public AdaptRectangle(Rectangle rect) {
		super();
		this.rect = rect;
		
	}
	
	@Override
	public float Aire() {
		return rect.Aire();
	}
	
	@Override
	public float Perimetre() {
		return rect.Perimetre();
	}
	
	
}
