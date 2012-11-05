package SERVICE;

import MODEL._Config;
import MODEL.GUI;
import MODEL.enums.Direction;

public class HTML implements GUI {

		
	@Override
	public String createInput(String type,String id,String value,int length,String onclick) {
		String input = "<input type=\""+type+"\" id=\""+id+"\" name=\""+id+"\" value=\""+value+"\"";	
		if(length > 0){
			input += " size=\""+length+"\"";
		}
		if(!onclick.isEmpty()){
			input += " onclick=\""+onclick+"\"";
		}
		input +="/>";
		return input;
	}
	
	@Override
	public String createInput(String type,String id,String value,String onclick) {
		return createInput(type,id,value,0,onclick);
	}
	
	@Override
	public String createInput(String type,String id,String value) {
		return createInput(type,id,value,0,"");
	}
	
	@Override
	public String createInput(String type,String id,int length) {
		return createInput(type,id,"",length,"");
	}
	
	public String createSelect(){
		return "";
	}
	
	
	@Override
	/**
	 * @author Shazem. Die Methode ist funktionsbereit
	 */
	public String space(int i,Direction d){
		String toreturn="",space="";
		if(d.equals(Direction.horiz)||d.equals(Direction.up)||d.equals(Direction.down)){
			space = "&nbsp;";
		}else if(d.equals(Direction.verti)||d.equals(Direction.left)||d.equals(Direction.right)){
			space = "<br/>";
		}
		for (int j = 0; j < i; j++) {
			toreturn +=space;
		}
		return toreturn;
	}
	
	
	@Override
	public void triggernotice(Exception e){
		String a = _Config.progressId;
		
		//ruft die z�standige javascript-Methode auf
	}

	@Override
	public String createRadiobuttons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDropdown() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String createA(String id,String click,String mouseover,String mouseout,String otherEvents,int textId){
		String toreturn = "<a ";
		if(!id.isEmpty()){
			//id += "_a";
			toreturn ="id=\""+id+"_a\" ";
		}
		toreturn += "onmouseover=\"";
		if(!mouseover.isEmpty()){
			toreturn += mouseover+";";
		}
		toreturn += "$(this).css({'cursor':'pointer','color':'blue'});\" ";
		
		toreturn += "onmouseout=\"";
		if(!mouseout.isEmpty()){
			toreturn += mouseout+";";
		}
		toreturn += "$(this).css({'cursor':'auto','color':'black'});\" ";
		
		if(!click.isEmpty()){
			toreturn += "onclick=\""+click+"\" ";
		}
		
		toreturn +=otherEvents+">"+Config.shsdb.text(textId)+"</a>";
		
		return toreturn;
	}
		
	@Override
	public String createA(String click,String mouseover,String mouseout,int textId){
		return createA("",click, mouseover, mouseout,"", textId);
	}
	
	@Override
	public String createA(String click, int textId) {
		return createA("",click,"","","",textId);
	}
}
