/**
 * 
 */
package com.test.camel.main;

import java.util.ArrayList;

/**
 * @author josephj001
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String message = "<center><b>This should be centered <br>boldface, but the tags are </br>wrongly nested</b></center>";
		//String message = "<center><b>This</b></center>";
		ArrayList<String> list = new ArrayList<String>();
		int nextStartIndex = 0;
		String token = null;
		String closingToken = null;
		String openingToken = null;
		for(int i=0; i<message.length(); i++){
			if(new Character(message.charAt(i)).toString().equals("<")){
				nextStartIndex = message.indexOf(">", i) +1;
				token = message.substring(i, nextStartIndex); 
				System.out.println(token);
				if((list != null) && (list.size()>=1)){
					openingToken = list.get(list.size()-1);
					closingToken = constructClosingToken(openingToken);
					if((token != null) && (closingToken != null) && 
							(token.equalsIgnoreCase(closingToken))){
						list.remove(closingToken);
						list.remove(openingToken);
					}else{
						list.add(token);
					}
				}else{
					list.add(token);
				}
				token = null;
				closingToken = null;
				openingToken = null;
				if(nextStartIndex<message.length()){
					i = nextStartIndex-1;
				}
				
			}
		}
		if(list.size() == 0){
			System.out.println("Correctly tagged paragrah");
		}else{
			System.out.println(list.toString() + " not properly tagged");
		}
		
	}
	
	public static String constructClosingToken(String token){
		String constructedToken = null;
		if((token != null) && (token.length()>0)){
			token = token.replace("<", "");
			token = token.replace(">", "");
			constructedToken = "</" + token + ">";
		}
		return constructedToken;
	}

}
