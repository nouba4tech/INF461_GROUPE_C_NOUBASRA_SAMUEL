package composite;

import java.util.ArrayList;
import java.util.List;

//Classe Composite conteneur d'autres composants
public class Composite implements Component{
private List<Component> children = new ArrayList<>();

@Override
public void operation() {

	for (Component child : children) {
		child.operation();
	}
}

public void add(Component component) {
	
	children.add(component);
}

public void remove(Component component) {
	children.remove(component); 
}

public List<Component> getChildren(){
	return children; 
}

}
